package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.Endereco;
import service.EnderecoService;
import view.TBuscaEndereco;

public class ControllerBuscaEndereco implements ActionListener {

    TBuscaEndereco telaBuscaEndereco;
    ControllerCadastro controllerCadastro = null;

    public ControllerBuscaEndereco(TBuscaEndereco telaBuscaEndereco, ControllerCadastro controllerCadastro) {
        this.controllerCadastro = controllerCadastro;
        this.telaBuscaEndereco = telaBuscaEndereco;
        this.telaBuscaEndereco.getjButtonCarregar().addActionListener(this);
        this.telaBuscaEndereco.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaEndereco.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaEndereco.getjButtonCarregar()) {
            if (controllerCadastro != null) {
                controllerCadastro.setCodigoEnderecoCadastro((int) this.telaBuscaEndereco.getjTableDados()
                        .getValueAt(this.telaBuscaEndereco.getjTableDados().getSelectedRow(), 0));
                this.telaBuscaEndereco.dispose();

                return;
            }

            controller.ControllerCadastroEndereco.codigo = (int) this.telaBuscaEndereco.getjTableDados()
                    .getValueAt(this.telaBuscaEndereco.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaEndereco.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaEndereco.getjButtonFiltrar()) {
            String search = this.telaBuscaEndereco.getjTFFitrar().getText();

            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaEndereco.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaEndereco.getjCombobox().getSelectedItem().toString();
                Endereco endereco = new Endereco();

                endereco = EnderecoService.carregar(search, column);

                if (endereco.getCep() == null) {
                    return;
                }

                tabela.addRow(new Object[] {
                        endereco.getId(),
                        endereco.getLogradouro(),
                        endereco.getCep(),
                        endereco.getBairro().getDescricao(),
                        endereco.getCidade().getDescricao()
                });

                return;
            }

            List<Endereco> listaEndereco = new ArrayList<Endereco>();
            listaEndereco = EnderecoService.carregar();

            for (Endereco enderecoAtual : listaEndereco) {
                tabela.addRow(new Object[] {
                        enderecoAtual.getId(),
                        enderecoAtual.getLogradouro(),
                        enderecoAtual.getCep(),
                        enderecoAtual.getBairro().getDescricao(),
                        enderecoAtual.getCidade().getDescricao()
                });
            }

            return;
        }

        this.telaBuscaEndereco.dispose();
    }
}
