package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Cliente;
import model.Endereco;
import service.ClienteService;
import service.EnderecoService;
import utilities.Utilities;
import view.TBuscaCliente;
import view.TBuscaEndereco;
import view.TCadastroCliente;

public class ControllerCadastroCliente extends ControllerCadastro implements ActionListener {

    TCadastroCliente telaCadastroCliente;
    public static int codigo;

    public ControllerCadastroCliente(TCadastroCliente telaCadastroCliente) {
        this.telaCadastroCliente = telaCadastroCliente;

        this.telaCadastroCliente.getjBNovo().addActionListener(this);
        this.telaCadastroCliente.getjBSair().addActionListener(this);
        this.telaCadastroCliente.getjBCancelar().addActionListener(this);
        this.telaCadastroCliente.getjBGravar().addActionListener(this);
        this.telaCadastroCliente.getjBBuscar().addActionListener(this);
        this.telaCadastroCliente.getjBBuscarCep().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCliente.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPanDados());

            this.telaCadastroCliente.getjTFId().setEnabled(false);
            this.telaCadastroCliente.getTxtCep().setEnabled(false);
            this.telaCadastroCliente.getjCBCidade().setEnabled(false);
            this.telaCadastroCliente.getjCBBairro().setEnabled(false);

            return;

        }

        if (e.getSource() == this.telaCadastroCliente.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCliente.getjBGravar()) {
            Cliente cliente = new Cliente();

            String id = this.telaCadastroCliente.getjTFId().getText();
            String nome = this.telaCadastroCliente.getjTFNome().getText();
            String rg = this.telaCadastroCliente.getTxtRg().getText();
            Object selectedItem = this.telaCadastroCliente.getjCBStatus().getSelectedItem();
            String status = selectedItem instanceof String ? (String) selectedItem : "";
            String email = this.telaCadastroCliente.getjTFEmail().getText();
            String cpf = this.telaCadastroCliente.getTxtCpf().getText();
            String telefone1 = this.telaCadastroCliente.getTxtFone1().getText();
            String telefone2 = this.telaCadastroCliente.getTxtFone2().getText();
            String complemento = this.telaCadastroCliente.getjTFCompEnd().getText();
            String dataNascimento = this.telaCadastroCliente.getTxtDataNascimento().getText();
            String matricula = this.telaCadastroCliente.getjTFMatricula().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(nome, rg, status, email, cpf, telefone1, telefone2,
                    complemento, dataNascimento, matricula));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());
                return;
            }

            // Endereco endereco = EnderecoService.carregar(this.getCodigoEnderecoCadastro());
            int enderecoId = this.telaCadastroCliente.getEnderecoID();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date;
            System.out.println(status);

            try {
                date = dateFormat.parse(dataNascimento);

                cliente.setNome(nome);
                cliente.setRg(rg);
                cliente.setStatus(Utilities.getCharStatusFromString(status));
                cliente.setEmail(email);
                cliente.setEnderecoId(enderecoId);
                cliente.setCpf(cpf);
                cliente.setFone1(telefone1);
                cliente.setFone2(telefone2);
                cliente.setComplementoEndereco(complemento);
                cliente.setDataNascimento(date);
                cliente.setMatricula(matricula);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            if (this.telaCadastroCliente.getjTFId().getText().equalsIgnoreCase("")) {
                service.ClienteService.adicionar(cliente);
            } else {
                cliente.setId(Integer.parseInt(this.telaCadastroCliente.getjTFId().getText()));
                service.ClienteService.atualizar(cliente);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCliente.getjBBuscar()) {
            TBuscaCliente telaBuscaCliente = new TBuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente, null);
            // Inserir o controller da busca d bairros
            telaBuscaCliente.setVisible(true);
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            if (codigo != 0) {
                Cliente cliente = ClienteService.carregar(codigo);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPanDados());
                Endereco endereco = new Endereco();
                endereco = EnderecoService.carregar(cliente.getEnderecoId());

                this.telaCadastroCliente.getjTFId().setText(cliente.getId() + "");
                this.telaCadastroCliente.getjTFNome().setText(cliente.getNome());
                this.telaCadastroCliente.getTxtRg().setText(cliente.getRg());
                this.telaCadastroCliente.getjCBStatus().setSelectedItem(cliente.getStatus());
                this.telaCadastroCliente.getjTFEmail().setText(cliente.getEmail());
                this.telaCadastroCliente.getTxtCpf().setText(cliente.getCpf());
                this.telaCadastroCliente.getTxtCep().setText(cliente.getEndereco().getCep());
                this.telaCadastroCliente.setEnderecoID(endereco.getId());
                this.telaCadastroCliente.getjCBCidade().setText(cliente.getEndereco().getCidade().getDescricao());
                this.telaCadastroCliente.getjCBBairro().setText(cliente.getEndereco().getBairro().getDescricao());
                this.telaCadastroCliente.getTxtFone1().setText(cliente.getFone1());
                this.telaCadastroCliente.getTxtFone2().setText(cliente.getFone2());
                this.telaCadastroCliente.getjTFCompEnd().setText(cliente.getComplementoEndereco());
                this.telaCadastroCliente.getTxtFone2().setText(cliente.getFone2());
                this.telaCadastroCliente.getTxtDataNascimento()
                        .setText(formatoData.format(cliente.getDataNascimento()));
                this.telaCadastroCliente.getjTFMatricula().setText(cliente.getMatricula());

                this.telaCadastroCliente.getjTFId().setEnabled(false);
                this.telaCadastroCliente.getTxtCep().setEnabled(false);
                this.telaCadastroCliente.getjCBCidade().setEnabled(false);
                this.telaCadastroCliente.getjCBBairro().setEnabled(false);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroCliente.getjBBuscarCep()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, this);

            telaBuscaEndereco.setVisible(true);

            if (this.getCodigoEnderecoCadastro() != 0) {
                Endereco endereco = new Endereco();
                endereco = service.EnderecoService.carregar(this.getCodigoEnderecoCadastro());

                this.telaCadastroCliente.setEnderecoID(endereco.getId());
                this.telaCadastroCliente.getTxtCep().setText(endereco.getCep());
                this.telaCadastroCliente.getjCBCidade().setText(endereco.getCidade().getDescricao());
                this.telaCadastroCliente.getjCBBairro().setText(endereco.getBairro().getDescricao());
            }

            return;
        }

        this.telaCadastroCliente.dispose();
    }

}
