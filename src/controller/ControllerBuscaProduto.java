package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Produto;
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
            controller.ControllerCadastroProduto.codigo = (int) this.telaBuscaProduto.getjTableDados().getValueAt(this.telaBuscaProduto.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaProduto.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaProduto.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Produto produtoAtual : DAO.ClasseDados.listaProduto) {
                tabela.addRow(new Object[]{
                    produtoAtual.getId(),
                    produtoAtual.getDescricao(),
                    produtoAtual.getCodigoBarra(),
                    produtoAtual.getStatus()
                });
            }

            return;
        }

        this.telaBuscaProduto.dispose();
    }
}
