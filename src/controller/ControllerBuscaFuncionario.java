package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.Funcionario;
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
            List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
            listaFuncionario = FuncionarioService.carregar();

            // Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTableDados().getModel();

            tabela.setRowCount(0);

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
