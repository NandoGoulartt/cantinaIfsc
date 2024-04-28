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
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaBairro(TBuscaBairro telaBuscaBairro, ControllerCadastro controllerCadastro) {

        this.controllerCadastro = controllerCadastro;
        this.telaBuscaBairro = telaBuscaBairro;
        this.telaBuscaBairro.getjButtonCarregar().addActionListener(this);
        this.telaBuscaBairro.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaBairro.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaBairro.getjButtonCarregar()) {
            if (controllerCadastro != null) {
                controllerCadastro.setCodigoBairroCadastro((int) this.telaBuscaBairro.getjTableDados()
                        .getValueAt(this.telaBuscaBairro.getjTableDados().getSelectedRow(), 0));
                this.telaBuscaBairro.dispose();

                return;
            }
            controller.ControllerCadastroBairro.codigo = (int) this.telaBuscaBairro.getjTableDados()
                    .getValueAt(this.telaBuscaBairro.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaBairro.dispose();
        }

        if (e.getSource() == this.telaBuscaBairro.getjButtonFiltrar()) {
            String search = this.telaBuscaBairro.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaBairro.getjCombobox().getSelectedItem().toString();
                Bairro bairro = new Bairro();

                bairro = BairroService.carregar(search, column);

                if (bairro.getDescricao() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        bairro.getId(),
                        bairro.getDescricao()
                });

                return;
            }

            List<Bairro> listaBairros = new ArrayList<Bairro>();
            listaBairros = BairroService.carregar();

            for (Bairro bairroAtual : listaBairros) {
                tabela.addRow(new Object[] {
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
