package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import model.Cidade;
import utilities.Utilities;
import view.TBuscaCidade;
import view.TCadastroCidade;

public class ControllerCadastroCidade implements ActionListener {

    TCadastroCidade telaCadastroCidade;
    public static int codigo;

    public ControllerCadastroCidade(TCadastroCidade telaCadastroCidade) {
        this.telaCadastroCidade = telaCadastroCidade;

        this.telaCadastroCidade.getjBNovo().addActionListener(this);
        this.telaCadastroCidade.getjBSair().addActionListener(this);
        this.telaCadastroCidade.getjBCancelar().addActionListener(this);
        this.telaCadastroCidade.getjBGravar().addActionListener(this);
        this.telaCadastroCidade.getjBBuscar().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCidade.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPanDados());
            this.telaCadastroCidade.getjTFId().setEnabled(false);

            return;
        }
        if (e.getSource() == this.telaCadastroCidade.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());

            return;
        }
        if (e.getSource() == this.telaCadastroCidade.getjBGravar()) {
            Cidade cidade = new Cidade();
            String descricao = this.telaCadastroCidade.getjTFDescricao().getText();
            String uf = this.telaCadastroCidade.getjTFUf().getText();

            cidade.setDescricao(descricao);
            cidade.setUf(uf);

            ArrayList<String> fields = new ArrayList<>(List.of(descricao, uf));

            if (!Utilities.validateFields(null, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());
                return;
            }

            if (this.telaCadastroCidade.getjTFId().getText().equalsIgnoreCase("")) {
                service.CidadeService.adicionar(cidade);
            } else {
                cidade.setId(Integer.parseInt(this.telaCadastroCidade.getjTFId().getText()));
                service.CidadeService.atualizar(cidade);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getjPanDados());
            return;
        }
        if (e.getSource() == this.telaCadastroCidade.getjBBuscar()) {
            TBuscaCidade telaBuscaCidade = new TBuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscaCidade, null);
            telaBuscaCidade.setVisible(true);

            if (codigo != 0) {
                Cidade cidade = new Cidade();
                cidade = service.CidadeService.carregar(codigo);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCidade.getjPanDados());

                this.telaCadastroCidade.getjTFId().setText(cidade.getId() + "");
                this.telaCadastroCidade.getjTFDescricao().setText(cidade.getDescricao());
                this.telaCadastroCidade.getjTFUf().setText(cidade.getUf());
                this.telaCadastroCidade.getjTFId().setEnabled(false);
            }

        }
        if (e.getSource() == this.telaCadastroCidade.getjBSair()) {
            this.telaCadastroCidade.dispose();

        }
    }

}
