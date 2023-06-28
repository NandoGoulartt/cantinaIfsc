package utilities;

import javax.swing.*;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilities {

    public static void ativaDesativa(boolean ativa, JPanel painel) {
        Component[] componentes = painel.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JButton) {
                if (((JButton) componente).getActionCommand() == "0") {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
            }
        }
    }

    public static void limpaComponentes(boolean ativa, JPanel painel) {
        Component[] componentes = painel.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(-1);
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JPasswordField) {
                ((JPasswordField) componente).setText("");
            }
            componente.setEnabled(ativa);
        }
    }

    public static Boolean validateFields(String id, ArrayList<String> fields) {
        if (!id.equalsIgnoreCase("")) {
            return false;
        }
        
        for (String field : fields) {
            if (field.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return true;
    }

    public static char getCharStatusFromString(String status) {
        if (!(status instanceof String)) {
            JOptionPane.showMessageDialog(null, "Status precisa ser 'Ativo' ou 'Inativo'", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Status precisa ser 'Ativo' ou 'Inativo'");
        }
        
        if (status.equalsIgnoreCase("Ativo")) {
            return 'a';
        }
        
        return 'i';
    }
}
