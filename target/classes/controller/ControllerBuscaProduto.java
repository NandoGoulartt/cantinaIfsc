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
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaProduto(TBuscaProduto telaBuscaProduto, ControllerCadastro controllerCadastro) {

        this.telaBuscaProduto = telaBuscaProduto;
        this.controllerCadastro = controllerCadastro;
        this.telaBuscaProduto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaProduto.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaProduto.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProduto.getjButtonCarregar()) {
            if (controllerCadastro != null) {
                controllerCadastro.setCodigoProdutoCadastro((int) this.telaBuscaProduto.getjTableDados()
                        .getValueAt(this.telaBuscaProduto.getjTableDados().getSelectedRow(), 0));
                this.telaBuscaProduto.dispose();

                return;
            }

            controller.ControllerCadastroProduto.codigo = (int) this.telaBuscaProduto.getjTableDados()
                    .getValueAt(this.telaBuscaProduto.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaProduto.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaProduto.getjButtonFiltrar()) {
            String search = this.telaBuscaProduto.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaProduto.getjCombobox().getSelectedItem().toString();
                Produto produto = new Produto();

                produto = ProdutoService.carregar(search, column);

                if (produto.getDescricao() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        produto.getId(),
                        produto.getStatus(),
                        produto.getCodigoBarra(),
                        produto.getDescricao(),
                        produto.getEstoque(),
                        produto.getPreco()
                });

                return;
            }

            List<Produto> listaProduto = new ArrayList<Produto>();
            listaProduto = service.ProdutoService.carregar();

            for (Produto produtoAtual : listaProduto) {
                tabela.addRow(new Object[] {
                        produtoAtual.getId(),
                        produtoAtual.getStatus(),
                        produtoAtual.getCodigoBarra(),
                        produtoAtual.getDescricao(),
                        produtoAtual.getEstoque(),
                        produtoAtual.getPreco()
                });
            }

            return;
        }

        this.telaBuscaProduto.dispose();
    }
}
