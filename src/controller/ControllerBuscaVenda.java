package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.Produto;
import model.Venda;
import service.ProdutoService;
import service.VendaService;
import view.TBuscaVenda;

public class ControllerBuscaVenda implements ActionListener {

    TBuscaVenda telaBuscaVenda;

    public ControllerBuscaVenda(TBuscaVenda telaBuscaProduto) {

        this.telaBuscaVenda = telaBuscaProduto;
        this.telaBuscaVenda.getjButtonCarregar().addActionListener(this);
        this.telaBuscaVenda.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaVenda.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaVenda.getjButtonCarregar()) {
            controller.ControllerCadastroVenda.codigo = (int) this.telaBuscaVenda.getjTableDados()
                    .getValueAt(this.telaBuscaVenda.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaVenda.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaVenda.getjButtonFiltrar()) {
            String search = this.telaBuscaVenda.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaVenda.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaVenda.getjCombobox().getSelectedItem().toString();
                Venda venda = new Venda();

                venda = VendaService.carregar(search, column);

                tabela.addRow(new Object[] {
                        venda.getId(),
                        venda.getStatus(),
                        venda.getFlagTipoDesconto(),
                        venda.getObservacao(),
                        venda.getFuncionario().getNome(),
                        venda.getCarteirinha().getCodBarra(),
                        venda.getCliente(),
                });

                return;
            }

            List<Venda> listaVenda = new ArrayList<Venda>();
            listaVenda = service.VendaService.carregar();

            for (Venda vendaAtual : listaVenda) {
                tabela.addRow(new Object[] {
                        vendaAtual.getId(),
                        vendaAtual.getStatus(),
                        vendaAtual.getFlagTipoDesconto(),
                        vendaAtual.getObservacao(),
                        vendaAtual.getFuncionario().getNome(),
                        vendaAtual.getCarteirinha().getCodBarra(),
                        vendaAtual.getCliente(),
                });
            }

            return;
        }

        this.telaBuscaVenda.dispose();
    }
}
