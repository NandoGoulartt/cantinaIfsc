package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import model.Carteirinha;
import service.CarteirinhaService;
import view.TBuscaCarteirinha;

public class ControllerBuscaCarteirinha implements ActionListener {

    TBuscaCarteirinha telaBuscaCarteirinha;
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaCarteirinha(TBuscaCarteirinha telaBuscaCarteirinha, ControllerCadastro controllerCadastro) {

        this.controllerCadastro = controllerCadastro;
        this.telaBuscaCarteirinha = telaBuscaCarteirinha;
        this.telaBuscaCarteirinha.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCarteirinha.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCarteirinha.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCarteirinha.getjButtonCarregar()) {
            if (controllerCadastro != null) {
                controllerCadastro.setCodigoCarteirinhaCadastro((int) this.telaBuscaCarteirinha.getjTableDados()
                        .getValueAt(this.telaBuscaCarteirinha.getjTableDados().getSelectedRow(), 0));
                        
                this.telaBuscaCarteirinha.dispose();

                return;
            }

            controller.ControllerCadastroCarteirinha.codigo = (int) this.telaBuscaCarteirinha.getjTableDados()
                    .getValueAt(this.telaBuscaCarteirinha.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaCarteirinha.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaCarteirinha.getjButtonFiltrar()) {
            String search = this.telaBuscaCarteirinha.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCarteirinha.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaCarteirinha.getjCombobox().getSelectedItem().toString();
                Carteirinha carteirinha = new Carteirinha();

                carteirinha = CarteirinhaService.carregar(search, column);

                if (carteirinha.getCodBarra() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        carteirinha.getId(),
                        carteirinha.getDataGeracao(),
                        carteirinha.getIdcliente(),
                        carteirinha.getDataCancelamento(),
                        carteirinha.getCodBarra()
                });

                return;
            }

            List<Carteirinha> listaCarteirinha = new ArrayList<Carteirinha>();
            listaCarteirinha = CarteirinhaService.carregar();

            for (Carteirinha carteirinhaAtual : listaCarteirinha) {
                tabela.addRow(new Object[] {
                        carteirinhaAtual.getId(),
                        carteirinhaAtual.getDataGeracao(),
                        carteirinhaAtual.getIdcliente(),
                        carteirinhaAtual.getDataCancelamento(),
                        carteirinhaAtual.getCodBarra()
                });
            }

            return;
        }

        this.telaBuscaCarteirinha.dispose();
    }
}
