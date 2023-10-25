package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import service.BairroService;
import view.TBuscaBairro;

public class ControllerBuscaBairro implements ActionListener {

    TBuscaBairro telaBuscaBairro;

    public ControllerBuscaBairro(TBuscaBairro telaBuscaBairro) {

        this.telaBuscaBairro = telaBuscaBairro;
        this.telaBuscaBairro.getjButtonCarregar().addActionListener(this);
        this.telaBuscaBairro.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaBairro.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaBairro.getjButtonCarregar()) {
            controller.ControllerCadastroBairro.codigo = (int) this.telaBuscaBairro.
                    getjTableDados().
                    getValueAt(this.telaBuscaBairro.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaBairro.dispose();
        }

        if (e.getSource() == this.telaBuscaBairro.getjButtonFiltrar()) {
            List<Bairro> listaBairros = new ArrayList<Bairro>();
            listaBairros = BairroService.carregar();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTableDados().getModel();
            for (Bairro bairroAtual : listaBairros) {
                tabela.addRow(new Object[]{
                    bairroAtual.getId(),
                    bairroAtual.getDescricao()
                });
            }
        }

        if (e.getSource() == this.telaBuscaBairro.getjButtonSair()) {
        this.telaBuscaBairro.dispose();
        }
    }
}
