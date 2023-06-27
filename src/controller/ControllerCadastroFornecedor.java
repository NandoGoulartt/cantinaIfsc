package controller;

import static DAO.ClasseDados.listaFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Fornecedor;
import utilities.Utilities;
import view.TBuscaEndereco;
import view.TBuscaFornecedor;
import view.TCadastroFornecedor;

public class ControllerCadastroFornecedor implements ActionListener {

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

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getjPanDados());

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
            }

            return;
            

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()) {
            this.telaCadastroFornecedor.dispose();

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBBuscarCep()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);

            telaBuscaEndereco.setVisible(true);

            return;
        }
    }

}
