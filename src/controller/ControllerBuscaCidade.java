package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import view.TBuscaCidade;

public class ControllerBuscaCidade implements ActionListener {

    TBuscaCidade telaBuscaCidade;

    public ControllerBuscaCidade(TBuscaCidade telaBuscaBairro) {

        this.telaBuscaCidade = telaBuscaBairro;
        this.telaBuscaCidade.getjButtonCarregar().addActionListener(this);
        this.telaBuscaCidade.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaCidade.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaCidade.getjButtonCarregar()) {
            controller.ControllerCadastroCidade.codigo = (int) this.telaBuscaCidade.getjTableDados().getValueAt(this.telaBuscaCidade.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaCidade.dispose();
        } else if (e.getSource() == this.telaBuscaCidade.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTableDados().getModel();
            for (Cidade cidadeAtual : DAO.ClasseDados.listaCidade) {
                tabela.addRow(new Object[]{
                    cidadeAtual.getId(),
                    cidadeAtual.getDescricao(),
                    cidadeAtual.getUf()
                });
            }

        } else if (e.getSource() == this.telaBuscaCidade.getjButtonSair()) {
            this.telaBuscaCidade.dispose();
        }
    }
}
