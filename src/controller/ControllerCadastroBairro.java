package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import utilities.Utilities;
import view.TBuscaBairro;
import view.TCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroBairro telaCadastroBairro;
    public static int codigo;


    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroBairro(TCadastroBairro telaCadastroBairro) {
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
            this.telaCadastroBairro.getjTFId().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroBairro.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

        } else if (e.getSource() == this.telaCadastroBairro.getjBGravar()) {
            Bairro bairro = new Bairro();
            bairro.setId(DAO.ClasseDados.listaBairro.size() + 1);
            bairro.setDescricao(this.telaCadastroBairro.getjTFDescricao().getText());
            
            if(this.telaCadastroBairro.getjTFId().getText().equalsIgnoreCase("")){
               DAO.ClasseDados.listaBairro.add(bairro);
            }else{
              //inserir o código para alterar na lista  
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

        } else if (e.getSource() == this.telaCadastroBairro.getjBBuscar()) {
            TBuscaBairro telaBuscaBairro = new TBuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro);
            telaBuscaBairro.setVisible(true);
            if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = DAO.ClasseDados.listaBairro.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPanDados());
                
                this.telaCadastroBairro.getjTFId().setText(bairro.getId() + "");
                this.telaCadastroBairro.getjTFDescricao().setText(bairro.getDescricao());
                this.telaCadastroBairro.getjTFId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroBairro.getjBSair()) {
            this.telaCadastroBairro.dispose();

        }
    }

}
