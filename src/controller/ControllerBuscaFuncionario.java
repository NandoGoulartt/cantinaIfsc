package controller;

import static DAO.ClasseDados.listaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
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
            controller.ControllerCadastroFuncionario.codigo = (int) this.telaBuscaFuncionario.getjTableDados().getValueAt(this.telaBuscaFuncionario.getjTableDados().getSelectedRow(), 0);

            this.telaBuscaFuncionario.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaFuncionario.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFuncionario.getjTableDados().getModel();

            tabela.setRowCount(0);

            for (Funcionario funcionarioAtual : DAO.ClasseDados.listaFuncionario) {
                tabela.addRow(new Object[]{
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
