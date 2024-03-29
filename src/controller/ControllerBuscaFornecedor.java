package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.Fornecedor;
import service.FornecedorService;
import view.TBuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {

    TBuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(TBuscaFornecedor telaBuscaFornecedor) {

        this.telaBuscaFornecedor = telaBuscaFornecedor;
        this.telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFornecedor.getjButtonCarregar()) {
            controller.ControllerCadastroFornecedor.codigo = (int) this.telaBuscaFornecedor.getjTableDados()
                    .getValueAt(this.telaBuscaFornecedor.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaFornecedor.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaFornecedor.getjButtonFiltrar()) {
            String search = this.telaBuscaFornecedor.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaFornecedor.getjCombobox().getSelectedItem().toString();
                Fornecedor fornecedor = new Fornecedor();

                fornecedor = FornecedorService.carregar(search, column);

                if (fornecedor.getNome() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        fornecedor.getId(),
                        fornecedor.getNome(),
                        fornecedor.getEmail(),
                        fornecedor.getCnpj(),
                        fornecedor.getStatus()
                });

                return;
            }

            List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
            listaFornecedor = FornecedorService.carregar();

            for (Fornecedor fornecedorAtual : listaFornecedor) {
                tabela.addRow(new Object[] {
                        fornecedorAtual.getId(),
                        fornecedorAtual.getNome(),
                        fornecedorAtual.getEmail(),
                        fornecedorAtual.getCnpj(),
                        fornecedorAtual.getStatus()
                });
            }

            return;
        }

        this.telaBuscaFornecedor.dispose();
    }
}
