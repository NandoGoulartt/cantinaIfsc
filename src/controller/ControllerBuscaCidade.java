package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import service.CidadeService;
import view.TBuscaCidade;

public class ControllerBuscaCidade implements ActionListener {

    TBuscaCidade telaBuscaCidade;

    public ControllerBuscaCidade(TBuscaCidade telaBuscaCidade) {

        this.telaBuscaCidade = telaBuscaCidade;
        this.telaBuscaCidade.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCidade.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCidade.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCidade.getjButtonCarregar()) {
            controller.ControllerCadastroCidade.codigo = (int) this.telaBuscaCidade.getjTableDados().getValueAt(this.telaBuscaCidade.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaCidade.dispose();

        }

        if (e.getSource() == this.telaBuscaCidade.getjButtonFiltrar()) {
             List<Cidade> listaCidade = new ArrayList<Cidade>();
            listaCidade = CidadeService.carregar();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTableDados().getModel();
            for (Cidade cidadeAtual : listaCidade) {
                tabela.addRow(new Object[]{
                    cidadeAtual.getId(),
                    cidadeAtual.getDescricao(),
                    cidadeAtual.getUf()
                });
            }
        }

        if (e.getSource() == this.telaBuscaCidade.getjButtonSair()) {
        this.telaBuscaCidade.dispose();
        }
    }
}
