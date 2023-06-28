package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;
import utilities.Utilities;
import view.TBuscaEndereco;
import view.TBuscaFornecedor;
import view.TCadastroFornecedor;

public class ControllerCadastroFornecedor extends ControllerCadastro implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroFornecedor telaCadastroFornecedor;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroFornecedor(TCadastroFornecedor telaCadastroFornecedor) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroFornecedor = telaCadastroFornecedor;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroFornecedor.getjBNovo().addActionListener(this);
        this.telaCadastroFornecedor.getjBSair().addActionListener(this);
        this.telaCadastroFornecedor.getjBCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getjBGravar().addActionListener(this);
        this.telaCadastroFornecedor.getjBBuscar().addActionListener(this);
        this.telaCadastroFornecedor.getjBBuscarCep().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroFornecedor.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPanDados());

            this.telaCadastroFornecedor.getjTFId4().setEnabled(false);
            this.telaCadastroFornecedor.getTxtCEP().setEnabled(false);
            this.telaCadastroFornecedor.getjCBCidade().setEnabled(false);
            this.telaCadastroFornecedor.getjCBBairro().setEnabled(false);
            
            return;

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBGravar()) {
            Fornecedor fornecedor = new Fornecedor();

            String id = this.telaCadastroFornecedor.getjTFId4().getText();
            String nome = this.telaCadastroFornecedor.getjTFNome().getText();
            Object selectedItem = this.telaCadastroFornecedor.getjComboBoxStatus().getSelectedItem();
            String status = selectedItem instanceof String ? (String) selectedItem : "";
            String email = this.telaCadastroFornecedor.getjTFEmail().getText();
            String ie = this.telaCadastroFornecedor.getjTFInscricao().getText();
            String cnpj = this.telaCadastroFornecedor.getTxtCNPJ().getText();
            String telefone1 = this.telaCadastroFornecedor.getTxtFone1().getText();
            String telefone2 = this.telaCadastroFornecedor.getTxtFone2().getText();
            String complemento = this.telaCadastroFornecedor.getjTFComplemento().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(nome, status, email, ie, cnpj, telefone1, telefone2, complemento));

            if (!Utilities.validateFields(fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());
                return;
            }

            Endereco endereco = DAO.ClasseDados.listaEndereco.get(this.getCodigoEnderecoCadastro() - 1);

            fornecedor.setId(DAO.ClasseDados.listaCliente.size() + 1);
            fornecedor.setNome(nome);
            fornecedor.setRazaoSocial(ie);
            fornecedor.setStatus(Utilities.getCharStatusFromString(status));
            fornecedor.setEmail(email);
            fornecedor.setEndereco(endereco);
            fornecedor.setCnpj(cnpj);
            fornecedor.setFone1(telefone1);
            fornecedor.setFone2(telefone2);
            fornecedor.setComplementoEndereco(complemento);

            DAO.ClasseDados.listaFornecedor.add(fornecedor);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());

            return;

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscar()) {
            TBuscaFornecedor telaBuscaFornecedor = new TBuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerbuscafornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor);

            telaBuscaFornecedor.setVisible(true);

            if (codigo != 0) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = DAO.ClasseDados.listaFornecedor.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getjPanDados());

                this.telaCadastroFornecedor.getjTFId4().setText(fornecedor.getId() + "");
                this.telaCadastroFornecedor.getjTFNome().setText(fornecedor.getNome());
                this.telaCadastroFornecedor.getjTFInscricao().setText(fornecedor.getInscricaoEstadual());
                this.telaCadastroFornecedor.getjComboBoxStatus().setSelectedItem(fornecedor.getStatus());
                this.telaCadastroFornecedor.getjTFEmail().setText(fornecedor.getEmail());
                this.telaCadastroFornecedor.getTxtCNPJ().setText(fornecedor.getCnpj());
                this.telaCadastroFornecedor.getTxtCEP().setText(fornecedor.getEndereco().getCep());
                this.telaCadastroFornecedor.getjCBCidade().setText(fornecedor.getEndereco().getCidade().getDescricao());
                this.telaCadastroFornecedor.getjCBBairro().setText(fornecedor.getEndereco().getBairro().getDescricao());
                this.telaCadastroFornecedor.getTxtFone1().setText(fornecedor.getFone1());
                this.telaCadastroFornecedor.getTxtFone2().setText(fornecedor.getFone2());
                this.telaCadastroFornecedor.getjTFComplemento().setText(fornecedor.getComplementoEndereco());
                this.telaCadastroFornecedor.getjTFRazaoSocial().setText(fornecedor.getRazaoSocial());

                this.telaCadastroFornecedor.getjTFId4().setEnabled(false);
                this.telaCadastroFornecedor.getTxtCEP().setEnabled(false);
                this.telaCadastroFornecedor.getjCBCidade().setEnabled(false);
                this.telaCadastroFornecedor.getjCBBairro().setEnabled(false);
            }

            return;

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()) {
            this.telaCadastroFornecedor.dispose();

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscarCep()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, this);

            telaBuscaEndereco.setVisible(true);

            if (this.getCodigoEnderecoCadastro() != 0) {
                Endereco endereco = new Endereco();
                endereco = DAO.ClasseDados.listaEndereco.get(this.getCodigoEnderecoCadastro() - 1);

                this.telaCadastroFornecedor.getTxtCEP().setText(endereco.getCep());
                this.telaCadastroFornecedor.getjCBCidade().setText(endereco.getCidade().getDescricao());
                this.telaCadastroFornecedor.getjCBBairro().setText(endereco.getBairro().getDescricao());
            }

            return;
        }
    }

}
