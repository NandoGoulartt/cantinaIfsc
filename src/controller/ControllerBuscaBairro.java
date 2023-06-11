package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.Bairro;
import view.TBuscaBairro;

public class ControllerBuscaBairro implements ActionListener {

    TBuscaBairro telaBuscaBairro;

    public ControllerBuscaBairro(TBuscaBairro telaBuscaBairro) {

        this.telaBuscaBairro = telaBuscaBairro;
        this.telaBuscaBairro.getjButtonCarregar().addActionListener(this);
        this.telaBuscaBairro.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaBairro.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaBairro.getjButtonCarregar()) {
            controller.ControllerCadastroBairro.codigo = (int) this.telaBuscaBairro.getjTableDados().getValueAt(this.telaBuscaBairro.getjTableDados().getSelectedRow(), 0);
            this.telaBuscaBairro.dispose();

            return;
        }

        if (e.getSource() == this.telaBuscaBairro.getjButtonFiltrar()) {
            //Criando/Carregando uma instancia da classe singleton de dados
            DAO.ClasseDados.getInstance();

            //Criar um objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTableDados().getModel();
            
            tabela.setRowCount(0);
            
            for (Bairro bairroAtual : DAO.ClasseDados.listaBairro) {
                tabela.addRow(new Object[]{
                    bairroAtual.getId(),
                    bairroAtual.getDescricao()
                });
            }

            return;
        }

        this.telaBuscaBairro.dispose();
    }
}
