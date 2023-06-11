package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.TBuscaCliente;

public class ControllerBuscaCliente implements ActionListener {

    TBuscaCliente telaBuscaCliente;

    public ControllerBuscaCliente(TBuscaCliente telaBuscaCliente) {

        this.telaBuscaCliente = telaBuscaCliente;
        this.telaBuscaCliente.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCliente.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCliente.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCliente.getjButtonCarregar()) {
            controller.ControllerCadastroCliente.codigo = (int) this.telaBuscaCliente.getjTableDados().getValueAt(this.telaBuscaCliente.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaCliente.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaCliente.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Cliente clienteAtual : DAO.ClasseDados.listaCliente) {
                tabela.addRow(new Object[]{
                    clienteAtual.getId(),
                    clienteAtual.getNome(),
                    clienteAtual.getEmail(),
                    clienteAtual.getCpf(),
                    clienteAtual.getStatus(),});
            }

            return;
        }

        this.telaBuscaCliente.dispose();
    }
}
