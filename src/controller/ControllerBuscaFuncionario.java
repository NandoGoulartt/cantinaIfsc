package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.Funcionario;
import service.FuncionarioService;
import view.TBuscaFuncionario;

public class ControllerBuscaFuncionario implements ActionListener {

    TBuscaFuncionario telaBuscaFuncionario;

    public ControllerBuscaFuncionario(TBuscaFuncionario telaBuscaFuncionario) {

        this.telaBuscaFuncionario = telaBuscaFuncionario;
        this.telaBuscaFuncionario.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaFuncionario.getjButtonCarregar()) {
            controller.ControllerCadastroFuncionario.codigo = (int) this.telaBuscaFuncionario.getjTableDados()
                    .getValueAt(this.telaBuscaFuncionario.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaFuncionario.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaFuncionario.getjButtonFiltrar()) {
            String search = this.telaBuscaFuncionario.getjTFFitrar().getText();

            // Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTableDados().getModel();
            tabela.setRowCount(0);

            if (!search.equals("")) {
                String column = this.telaBuscaFuncionario.getjCombobox().getSelectedItem().toString();
                Funcionario funcionario = new Funcionario();

                funcionario = service.FuncionarioService.carregar(search, column);

                tabela.addRow(new Object[] {
                        funcionario.getId(),
                        funcionario.getNome(),
                        funcionario.getEmail(),
                        funcionario.getCpf(),
                        funcionario.getStatus()
                });

                return;
            }

            List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
            listaFuncionario = FuncionarioService.carregar();

            for (Funcionario funcionarioAtual : listaFuncionario) {
                tabela.addRow(new Object[] {
                        funcionarioAtual.getId(),
                        funcionarioAtual.getNome(),
                        funcionarioAtual.getEmail(),
                        funcionarioAtual.getCpf(),
                        funcionarioAtual.getStatus()
                });
            }

            return;
        }

        this.telaBuscaFuncionario.dispose();
    }
}
