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
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaCidade(TBuscaCidade telaBuscaCidade, ControllerCadastro controllerCadastro) {

        this.controllerCadastro = controllerCadastro;
        this.telaBuscaCidade = telaBuscaCidade;
        this.telaBuscaCidade.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCidade.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCidade.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCidade.getjButtonCarregar()) {

            if (controllerCadastro != null) {
                controllerCadastro.setCodigoCidadeCadastro((int) this.telaBuscaCidade.getjTableDados()
                        .getValueAt(this.telaBuscaCidade.getjTableDados().getSelectedRow(), 0));
                this.telaBuscaCidade.dispose();

                return;
            }
            controller.ControllerCadastroCidade.codigo = (int) this.telaBuscaCidade.getjTableDados()
                    .getValueAt(this.telaBuscaCidade.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaCidade.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaCidade.getjButtonFiltrar()) {
            String search = this.telaBuscaCidade.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaCidade.getjCombobox().getSelectedItem().toString();
                Cidade cidade = new Cidade();

                cidade = CidadeService.carregar(search, column);

                if (cidade.getDescricao() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        cidade.getId(),
                        cidade.getUf(),
                        cidade.getDescricao()
                });

                return;
            }

            List<Cidade> listaCidade = new ArrayList<Cidade>();
            listaCidade = CidadeService.carregar();

            for (Cidade cidadeAtual : listaCidade) {

                tabela.addRow(new Object[] {
                        cidadeAtual.getId(),
                        cidadeAtual.getUf(),
                        cidadeAtual.getDescricao()

                });
            }

            return;
        }

        if (e.getSource() == this.telaBuscaCidade.getjButtonSair()) {
            this.telaBuscaCidade.dispose();
        }
    }
}
