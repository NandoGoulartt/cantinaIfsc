package controller;

import static DAO.ClasseDados.listaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import model.Funcionario;
import view.TBuscaFornecedor;
import view.TBuscaFuncionario;

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
            controller.ControllerCadastroFornecedor.codigo = (int) this.telaBuscaFornecedor.getjTableDados().getValueAt(this.telaBuscaFornecedor.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaFornecedor.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaFornecedor.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Fornecedor fornecedorAtual : DAO.ClasseDados.listaFornecedor) {
                tabela.addRow(new Object[]{
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
