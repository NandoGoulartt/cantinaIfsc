package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import utilities.Utilities;
import view.TBuscaBairro;
import view.TCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {

    TCadastroBairro telaCadastroBairro;
    public static int codigo;

    public ControllerCadastroBairro(TCadastroBairro telaCadastroBairro) {
        this.telaCadastroBairro = telaCadastroBairro;

        this.telaCadastroBairro.getjBNovo().addActionListener(this);
        this.telaCadastroBairro.getjBSair().addActionListener(this);
        this.telaCadastroBairro.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro.getjBGravar().addActionListener(this);
        this.telaCadastroBairro.getjBBuscar().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroBairro.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPanDados());
            this.telaCadastroBairro.getjTFId().setEnabled(false);

            return;
        }

        if (e.getSource() == this.telaCadastroBairro.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

            return;

        }

        if (e.getSource() == this.telaCadastroBairro.getjBGravar()) {
            Bairro bairro = new Bairro();

            String id = this.telaCadastroBairro.getjTFId().getText();
            String descricao = this.telaCadastroBairro.getjTFDescricao().getText();

            bairro.setDescricao(descricao);

            if(this.telaCadastroBairro.getjTFId().getText().equalsIgnoreCase("")){
               service.BairroService.adicionar(bairro);
            }else{
              bairro.setId(Integer.parseInt(this.telaCadastroBairro.getjTFId().getText()));
              service.BairroService.atualizar(bairro);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroBairro.getjBBuscar()) {
            TBuscaBairro telaBuscaBairro = new TBuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro, null);
            telaBuscaBairro.setVisible(true);
            if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = service.BairroService.carregar(codigo);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroBairro.getjPanDados());

                this.telaCadastroBairro.getjTFId().setText(bairro.getId() + "");
                this.telaCadastroBairro.getjTFDescricao().setText(bairro.getDescricao());
                this.telaCadastroBairro.getjTFId().setEnabled(false);
            }

        }
        if (e.getSource() == this.telaCadastroBairro.getjBSair()) {
            this.telaCadastroBairro.dispose();
        }
    }
}
