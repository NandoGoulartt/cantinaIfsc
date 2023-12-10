/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCadastroBairro;
import controller.ControllerCadastroCarteirinha;
import controller.ControllerCadastroCidade;
import controller.ControllerCadastroCliente;
import controller.ControllerCadastroEndereco;
import controller.ControllerCadastroFornecedor;
import controller.ControllerCadastroFuncionario;
import controller.ControllerCadastroProduto;
import controller.ControllerCadastroVenda;

import javax.swing.JOptionPane;

/**
 *
 * @author house
 */
public class TMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPrincipal
     */
    public TMenu() {
        initComponents();
        DAO.ClasseDados.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        providerButton = new javax.swing.JButton();
        productButton = new javax.swing.JButton();
        addressButton = new javax.swing.JButton();
        cityButton = new javax.swing.JButton();
        bairroButton = new javax.swing.JButton();
        carteirinhaButton = new javax.swing.JButton();
        vendaButton = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCarteirinha = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMovimentos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisCan - Sistema de Controle de Cantinas");
        setResizable(false);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        customerButton.setText("Cliente");
        customerButton.setMaximumSize(new java.awt.Dimension(40, 23));
        customerButton.setMinimumSize(new java.awt.Dimension(40, 23));
        customerButton.setPreferredSize(new java.awt.Dimension(270, 270));
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(customerButton);

        providerButton.setText("Fornecedor");
        providerButton.setPreferredSize(new java.awt.Dimension(270, 270));
        providerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(providerButton);

        productButton.setText("Produto");
        productButton.setPreferredSize(new java.awt.Dimension(270, 270));
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        jPanel1.add(productButton);

        addressButton.setText("Endere�o");
        addressButton.setPreferredSize(new java.awt.Dimension(270, 270));
        addressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addressButton);

        cityButton.setText("Cidade");
        cityButton.setPreferredSize(new java.awt.Dimension(270, 270));
        cityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cityButton);

        bairroButton.setText("Bairro");
        bairroButton.setPreferredSize(new java.awt.Dimension(270, 270));
        bairroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bairroButton);

        carteirinhaButton.setText("Carteirinha");
        carteirinhaButton.setPreferredSize(new java.awt.Dimension(270, 270));
        carteirinhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carteirinhaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(carteirinhaButton);

        vendaButton.setText("Venda");
        vendaButton.setPreferredSize(new java.awt.Dimension(270, 270));
        vendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(vendaButton);

        jMenuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/People.png"))); // NOI18N
        jMenuCadastros.setText("Cadastros");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss_1.png"))); // NOI18N
        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delivery.png"))); // NOI18N
        jMenuItem2.setText("Fornecedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Boss.png"))); // NOI18N
        jMenuItem3.setText("Funcion�rio");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem3);
        jMenuCadastros.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.png"))); // NOI18N
        jMenuItem4.setText("Bairro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.png"))); // NOI18N
        jMenuItem5.setText("Cidade");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.png"))); // NOI18N
        jMenuItem6.setText("Endere�o");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItem6);
        jMenuCadastros.add(jSeparator2);

        jMenuItemCarteirinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItemCarteirinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Message.png"))); // NOI18N
        jMenuItemCarteirinha.setText("Carteirinha");
        jMenuItemCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarteirinhaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCarteirinha);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Blue tag.png"))); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.setName(""); // NOI18N
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProduto);
        jMenuCadastros.add(jSeparator3);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setName("JMISair"); // NOI18N
        jMenuCadastros.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuCadastros);

        jMenuMovimentos.setText("Movimentos");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dollar.png"))); // NOI18N
        jMenu1.setText("Contas");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Down.png"))); // NOI18N
        jMenuItem10.setText("Pagar");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dollar.png"))); // NOI18N
        jMenuItem11.setText("Receber");
        jMenu1.add(jMenuItem11);

        jMenuMovimentos.add(jMenu1);

        jMenuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buy.png"))); // NOI18N
        jMenuItemVenda.setText("Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuMovimentos.add(jMenuItemVenda);

        jMenuBarPrincipal.add(jMenuMovimentos);

        jMenuRelatorios.setText("Relatorios");
        jMenuBarPrincipal.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");
        jMenuBarPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TCadastroCliente telaCadastroCliente = new TCadastroCliente(null, true);
        ControllerCadastroCliente ControllerCadastroCliente = new ControllerCadastroCliente(telaCadastroCliente);
        telaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TCadastroFornecedor telaCadastroFornecedor = new TCadastroFornecedor(null, true);
        ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(telaCadastroFornecedor);
        telaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TCadastroBairro telaCadastroBairro = new TCadastroBairro(null, true);
        ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(telaCadastroBairro);
        telaCadastroBairro.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void bairroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroButtonActionPerformed
        TCadastroBairro telaCadastroBairro = new TCadastroBairro(null, true);
        ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(telaCadastroBairro);
        telaCadastroBairro.setVisible(true);
    }//GEN-LAST:event_bairroButtonActionPerformed

    private void providerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerButtonActionPerformed
        TCadastroFornecedor telaCadastroFornecedor = new TCadastroFornecedor(null, true);
        ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(telaCadastroFornecedor);
        telaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_providerButtonActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TCadastroFuncionario telaCadastroFuncionario = new TCadastroFuncionario(null, true);
        ControllerCadastroFuncionario ControllerCadastroFuncionario = new ControllerCadastroFuncionario(telaCadastroFuncionario);
        telaCadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        TCadastroProduto telaCadastroProduto = new TCadastroProduto(null, true);
        ControllerCadastroProduto controllerCadastroProduto = new ControllerCadastroProduto(telaCadastroProduto);
        telaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_productButtonActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        TCadastroProduto telaCadastroProduto = new TCadastroProduto(null, true);
        ControllerCadastroProduto controllerCadastroProduto = new ControllerCadastroProduto(telaCadastroProduto);
        telaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void cityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityButtonActionPerformed
        TCadastroCidade telaCadastroCidade = new TCadastroCidade(null, true);
        ControllerCadastroCidade controllerCadastroCidade = new ControllerCadastroCidade(telaCadastroCidade);
        telaCadastroCidade.setVisible(true);
    }//GEN-LAST:event_cityButtonActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TCadastroCidade telaCadastroCidade = new TCadastroCidade(null, true);
        ControllerCadastroCidade controllerCadastroCidade = new ControllerCadastroCidade(telaCadastroCidade);
        telaCadastroCidade.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void addressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressButtonActionPerformed
        TCadastroEndereco telaCadastroEndereco = new TCadastroEndereco(null, true);
        ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(telaCadastroEndereco);
        telaCadastroEndereco.setVisible(true);
    }//GEN-LAST:event_addressButtonActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TCadastroEndereco telaCadastroEndereco = new TCadastroEndereco(null, true);
        ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(telaCadastroEndereco);
        telaCadastroEndereco.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        TCadastroCliente telaCadastroCliente = new TCadastroCliente(null, true);
        ControllerCadastroCliente ControllerCadastroCliente = new ControllerCadastroCliente(telaCadastroCliente);
        telaCadastroCliente.setVisible(true);
    }//GEN-LAST:event_customerButtonActionPerformed

    private void jMenuItemCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarteirinhaActionPerformed
        TCadastroCarteirinha telaCadastroCarteirinha = new TCadastroCarteirinha(null, true);
        ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(telaCadastroCarteirinha);
        telaCadastroCarteirinha.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCarteirinhaActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        TCadastroVenda telaCadastroVenda = new TCadastroVenda(null, true);
        new ControllerCadastroVenda(telaCadastroVenda);
        telaCadastroVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void carteirinhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteirinhaButtonActionPerformed
        TCadastroCarteirinha telaCadastroCarteirinha = new TCadastroCarteirinha(null, true);
        new ControllerCadastroCarteirinha(telaCadastroCarteirinha);
        telaCadastroCarteirinha.setVisible(true);
    }//GEN-LAST:event_carteirinhaButtonActionPerformed

    private void vendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaButtonActionPerformed
        TCadastroVenda telaCadastroVenda = new TCadastroVenda(null, true);
        new ControllerCadastroVenda(telaCadastroVenda);
        telaCadastroVenda.setVisible(true);
    }//GEN-LAST:event_vendaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addressButton;
    private javax.swing.JButton bairroButton;
    private javax.swing.JButton carteirinhaButton;
    private javax.swing.JButton cityButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemCarteirinha;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuMovimentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton productButton;
    private javax.swing.JButton providerButton;
    private javax.swing.JButton vendaButton;
    // End of variables declaration//GEN-END:variables
}
