package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.Produto;
import service.ProdutoService;
import view.TBuscaProduto;

public class ControllerBuscaProduto implements ActionListener {

    TBuscaProduto telaBuscaProduto;

    public ControllerBuscaProduto(TBuscaProduto telaBuscaProduto) {

        this.telaBuscaProduto = telaBuscaProduto;
        this.telaBuscaProduto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaProduto.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaProduto.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProduto.getjButtonCarregar()) {
            controller.ControllerCadastroProduto.codigo = (int) this.telaBuscaProduto.getjTableDados()
                    .getValueAt(this.telaBuscaProduto.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaProduto.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaProduto.getjButtonFiltrar()) {
            List<Produto> listaProduto = new ArrayList<Produto>();
            listaProduto = ProdutoService.carregar();

            // Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Produto produtoAtual : listaProduto) {
                tabela.addRow(new Object[] {
                        produtoAtual.getId(),
                        produtoAtual.getStatus(),
                        produtoAtual.getCodigoBarra(),
                        produtoAtual.getDescricao()
                });
            }

            return;
        }

        this.telaBuscaProduto.dispose();
    }
}
