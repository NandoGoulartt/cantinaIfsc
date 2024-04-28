package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import model.Cliente;
import view.TBuscaCliente;

public class ControllerBuscaCliente implements ActionListener {

    TBuscaCliente telaBuscaCliente;
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaCliente(TBuscaCliente telaBuscaCliente, ControllerCadastro controllerCadastro) {

        this.controllerCadastro = controllerCadastro;
        this.telaBuscaCliente = telaBuscaCliente;
        this.telaBuscaCliente.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCliente.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCliente.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCliente.getjButtonCarregar()) {
            if (controllerCadastro != null) {
                controllerCadastro.setCodigoClienteCadastro((int) this.telaBuscaCliente.getjTableDados()
                        .getValueAt(this.telaBuscaCliente.getjTableDados().getSelectedRow(), 0));
                this.telaBuscaCliente.dispose();

                return;
            }

            controller.ControllerCadastroCliente.codigo = (int) this.telaBuscaCliente.getjTableDados()
                    .getValueAt(this.telaBuscaCliente.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaCliente.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaCliente.getjButtonFiltrar()) {
            String search = this.telaBuscaCliente.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaCliente.getjCombobox().getSelectedItem().toString();
                Cliente cliente = new Cliente();

                cliente = service.ClienteService.carregar(search, column);

                if (cliente.getNome() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getEmail(),
                        cliente.getCpf(),
                        cliente.getStatus()
                });

                return;
            }

            List<Cliente> listaCliente = new ArrayList<Cliente>();
            listaCliente = service.ClienteService.carregar();

            for (Cliente clienteAtual : listaCliente) {
                tabela.addRow(new Object[] {
                        clienteAtual.getId(),
                        clienteAtual.getNome(),
                        clienteAtual.getEmail(),
                        clienteAtual.getCpf(),
                        clienteAtual.getStatus()
                });
            }

            return;
        }

        this.telaBuscaCliente.dispose();
    }
}
