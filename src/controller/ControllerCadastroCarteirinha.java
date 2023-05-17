package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TBuscaCarteirinha;
import view.TCadastroCarteirinha;

public class ControllerCadastroCarteirinha implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCarteirinha telaCadastroCarteirinha;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroCarteirinha(TCadastroCarteirinha telaCadastroCarteirinha) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroCarteirinha = telaCadastroCarteirinha;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        this.telaCadastroCarteirinha.getjBNovo().addActionListener(this);
        this.telaCadastroCarteirinha.getjBSair().addActionListener(this);
        this.telaCadastroCarteirinha.getjBCancelar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBGravar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscar().addActionListener(this);

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCarteirinha.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()) {
            TBuscaCarteirinha telaBuscaCarteirinha = new TBuscaCarteirinha(null, true);
            //Inserir o controller da busca d bairros
            telaBuscaCarteirinha.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCarteirinha.getjBSair()) {
            this.telaCadastroCarteirinha.dispose();

        }
    }

}
