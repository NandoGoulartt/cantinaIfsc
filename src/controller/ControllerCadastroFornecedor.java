package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TBuscaFornecedor;
import view.TCadastroFornecedor;

public class ControllerCadastroFornecedor implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroFornecedor telaCadastroFornecedor;

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
            //Inserir o controller da busca d Fornecedors
            telaBuscaFornecedor.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroFornecedor.getjBSair()) {
            this.telaCadastroFornecedor.dispose();

        }
    }

}
