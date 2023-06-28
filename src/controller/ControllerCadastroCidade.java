package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cidade;
import utilities.Utilities;
import view.TBuscaCidade;
import view.TCadastroCidade;

public class ControllerCadastroCidade implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCidade telaCadastroCidade;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invocaï¿½ï¿½o
    public ControllerCadastroCidade(TCadastroCidade telaCadastroCidade) {
        //Repassando o valor(tela) do parï¿½metro para o objeto global
        this.telaCadastroCidade = telaCadastroCidade;

        //Adicionando ouvintes(Listeners) para escutar aï¿½ï¿½es nos botï¿½es da tela
        this.telaCadastroCidade.getjBNovo().addActionListener(this);
        this.telaCadastroCidade.getjBSair().addActionListener(this);
        this.telaCadastroCidade.getjBCancelar().addActionListener(this);
        this.telaCadastroCidade.getjBGravar().addActionListener(this);
        this.telaCadastroCidade.getjBBuscar().addActionListener(this);

        //Executando os mï¿½todos da classe de utilitï¿½rios
        //para ativar/desativar/limpar botï¿½es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCidade.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPanDados());
            this.telaCadastroCidade.getjTFId().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroCidade.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCidade.getjBGravar()) {
            Cidade cidade = new Cidade();
            cidade.setId(DAO.ClasseDados.listaCidade.size() + 1);
            cidade.setDescricao(this.telaCadastroCidade.getjTFDescricao().getText());
            cidade.setUf(this.telaCadastroCidade.getjTFUf().getText());
            
            if(this.telaCadastroCidade.getjTFId().getText().equalsIgnoreCase("")){
               DAO.ClasseDados.listaCidade.add(cidade);
            }else{
              //inserir o código para alterar na lista  
            }
            
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());

        } else if (e.getSource() == this.telaCadastroCidade.getjBBuscar()) {
            TBuscaCidade telaBuscaCidade = new TBuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscaCidade);
            telaBuscaCidade.setVisible(true);
            
            if (codigo != 0) {
                Cidade cidade = new Cidade();
                cidade = DAO.ClasseDados.listaCidade.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPanDados());
                
                this.telaCadastroCidade.getjTFId().setText(cidade.getId() + "");
                this.telaCadastroCidade.getjTFDescricao().setText(cidade.getDescricao());
                this.telaCadastroCidade.getjTFUf().setText(cidade.getUf());
                this.telaCadastroCidade.getjTFId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroCidade.getjBSair()) {
            this.telaCadastroCidade.dispose();

        }
    }

}
