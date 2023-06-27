package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import utilities.Utilities;
import view.TBuscaCliente;
import view.TBuscaEndereco;
import view.TCadastroCliente;

public class ControllerCadastroCliente implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCliente telaCadastroCliente;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroCliente(TCadastroCliente telaCadastroCliente) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroCliente = telaCadastroCliente;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        this.telaCadastroCliente.getjBNovo().addActionListener(this);
        this.telaCadastroCliente.getjBSair().addActionListener(this);
        this.telaCadastroCliente.getjBCancelar().addActionListener(this);
        this.telaCadastroCliente.getjBGravar().addActionListener(this);
        this.telaCadastroCliente.getjBBuscar().addActionListener(this);
        this.telaCadastroCliente.getjBBuscarCep().addActionListener(this);

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCliente.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPanDados());

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
            String cep = this.telaCadastroCliente.getTxtCep().getText();
            String cidade = this.telaCadastroCliente.getjCBCidade().getText();
            String bairro = this.telaCadastroCliente.getjCBBairro().getText();
            String telefone1 = this.telaCadastroCliente.getTxtFone1().getText();
            String telefone2 = this.telaCadastroCliente.getTxtFone2().getText();
            String complemento = this.telaCadastroCliente.getjTFCompEnd().getText();
            String dataNascimento = this.telaCadastroCliente.getTxtDataNascimento().getText();
            String matricula = this.telaCadastroCliente.getjTFMatricula().getText();
            
            
            ArrayList<String> fields = new ArrayList<>(List.of(nome,rg,status,email,cpf,cep,cidade,bairro,telefone1,telefone2,complemento,dataNascimento,matricula));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());
                return;
            }

            cliente.setId(DAO.ClasseDados.listaCliente.size() + 1);
            cliente.setNome(nome);
            cliente.setRg(rg);
            cliente.setStatus(Utilities.getCharStatusFromString(status));
            cliente.setEmail(email);
            cliente.setCpf(cpf);
            cliente.setFone1(telefone1);
            cliente.setFone2(telefone2);
            cliente.setComplementoEndereco(complemento);
            cliente.setDataNascimento(dataNascimento);
            cliente.setMatricula(matricula);
            
//            cliente.set(cep);
//            String cidade = this.telaCadastroCliente.getjCBCidade().getText();
//            String bairro = this.telaCadastroCliente.getjCBBairro().getText();

            DAO.ClasseDados.listaCliente.add(cliente);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCliente.getjBBuscar()) {
            TBuscaCliente telaBuscaCliente = new TBuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente);
            //Inserir o controller da busca d bairros
            telaBuscaCliente.setVisible(true);

            if (codigo != 0) {
                Cliente cliente = new Cliente();
                cliente = DAO.ClasseDados.listaCliente.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCliente.getjPanDados());

                this.telaCadastroCliente.getjTFId().setText(cliente.getId() + "");
                this.telaCadastroCliente.getjTFNome().setText(cliente.getNome());
                this.telaCadastroCliente.getTxtRg().setText(cliente.getRg());
                this.telaCadastroCliente.getjCBStatus().setSelectedItem(cliente.getStatus());
                this.telaCadastroCliente.getjTFEmail().setText(cliente.getEmail());
                this.telaCadastroCliente.getTxtCpf().setText(cliente.getCpf());
                this.telaCadastroCliente.getTxtCep().setText(cliente.getEndereco().getCep());
                this.telaCadastroCliente.getjCBCidade().setText(cliente.getEndereco().getCidade().getDescricao());
                this.telaCadastroCliente.getjCBBairro().setText(cliente.getEndereco().getBairro().getDescricao());
                this.telaCadastroCliente.getTxtFone1().setText(cliente.getFone1());
                this.telaCadastroCliente.getTxtFone2().setText(cliente.getFone2());
                this.telaCadastroCliente.getjTFCompEnd().setText(cliente.getComplementoEndereco());
                this.telaCadastroCliente.getTxtFone2().setText(cliente.getFone2());
                this.telaCadastroCliente.getTxtDataNascimento().setText(cliente.getDataNascimento());
                this.telaCadastroCliente.getjTFMatricula().setText(cliente.getMatricula());

                this.telaCadastroCliente.getjTFId().setEnabled(false);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroCliente.getjBBuscarCep()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);

            telaBuscaEndereco.setVisible(true);

            return;
        }

        this.telaCadastroCliente.dispose();
    }

}
