package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TBuscaCidade;
import view.TCadastroCidade;

public class ControllerCadastroCidade implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCidade telaCadastroCidade;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroCidade(TCadastroCidade telaCadastroCidade) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroCidade = telaCadastroCidade;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroCidade.getjBNovo().addActionListener(this);
        this.telaCadastroCidade.getjBSair().addActionListener(this);
        this.telaCadastroCidade.getjBCancelar().addActionListener(this);
        this.telaCadastroCidade.getjBGravar().addActionListener(this);
        this.telaCadastroCidade.getjBBuscar().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCidade.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCidade.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCidade.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCidade.getjBBuscar()) {
            TBuscaCidade telaBuscaCidade = new TBuscaCidade(null, true);
            //Inserir o controller da busca d Cidades
            telaBuscaCidade.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCidade.getjBSair()) {
            this.telaCadastroCidade.dispose();

        }
    }

}
