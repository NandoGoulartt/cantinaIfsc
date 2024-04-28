package utilities;

import javax.swing.*;

import java.awt.Component;
import java.util.ArrayList;

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
            JOptionPane.showMessageDialog(null, "Status precisa ser 'Ativo' ou 'Inativo'", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            System.err.println("Status precisa ser 'Ativo' ou 'Inativo'");
        }

        if (status.equalsIgnoreCase("Ativo") || status.equalsIgnoreCase("a")) {
            return 'a';
        }

        return 'i';
    }

    public static boolean onlyNumbers(String input) {
        return input.matches("[0-9]+");
    }

    public static boolean validaCodigoBarras(String input) {
        if (onlyNumbers(input) == false) {
            JOptionPane.showMessageDialog(null, "Codigo de barras precisa ser um numero", "Erro",
                    JOptionPane.ERROR_MESSAGE);

            return false;
        }

        if (input.length() != 13) {
            JOptionPane.showMessageDialog(null, "Codigo de barras precisa ter 13 digitos", "Erro",
                    JOptionPane.ERROR_MESSAGE);

            return false;
        }

        return onlyNumbers(input);
    }
}
