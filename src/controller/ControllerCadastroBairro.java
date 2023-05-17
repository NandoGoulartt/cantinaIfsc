package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.TelaBuscaBairro;
import view.TelaCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TelaCadastroBairro telaCadastroBairro;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroBairro(TelaCadastroBairro telaCadastroBairro) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroBairro = telaCadastroBairro;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        this.telaCadastroBairro.getjBNovo().addActionListener(this);
        this.telaCadastroBairro.getjBSair().addActionListener(this);
        this.telaCadastroBairro.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro.getjBGravar().addActionListener(this);
        this.telaCadastroBairro.getjBBuscar().addActionListener(this);

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroBairro.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPanDados());

        } else if (e.getSource() == this.telaCadastroBairro.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

        } else if (e.getSource() == this.telaCadastroBairro.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

        } else if (e.getSource() == this.telaCadastroBairro.getjBBuscar()) {
            TelaBuscaBairro telaBuscaBairro = new TelaBuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroBairro.getjBSair()) {
            this.telaCadastroBairro.dispose();

        }
    }

}
