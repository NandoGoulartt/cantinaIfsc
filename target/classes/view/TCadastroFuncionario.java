/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class TCadastroFuncionario extends javax.swing.JDialog {

    private JButton jButton1;
    int enderecoID;

    public TCadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public int getEnderecoID() {
        return enderecoID;
    }

    public void setEnderecoID(int enderecoID) {
        this.enderecoID = enderecoID;
    }

    public JButton getjBBuscarCep() {
        return jBBuscarCep;
    }

    public JButton getjBBuscar() {
        return jBBuscar;
    }

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public JButton getjBGravar() {
        return jBGravar;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public JComboBox<String> getJcomboBoxStatus() {
        return JcomboBoxStatus;
    }

    public void setJcomboBoxStatus(JComboBox<String> JcomboBoxStatus) {
        this.JcomboBoxStatus = JcomboBoxStatus;
    }

    public JFormattedTextField getJtextCep() {
        return JtextCep;
    }

    public void setJtextCep(JFormattedTextField JtextCep) {
        this.JtextCep = JtextCep;
    }

    public JTextField getJtextComplemento() {
        return JtextComplemento;
    }

    public void setJtextComplemento(JTextField JtextComplemento) {
        this.JtextComplemento = JtextComplemento;
    }

    public JFormattedTextField getJtextCpf() {
        return JtextCpf;
    }

    public void setJtextCpf(JFormattedTextField JtextCpf) {
        this.JtextCpf = JtextCpf;
    }

    public JTextField getJtextEmail() {
        return JtextEmail;
    }

    public void setJtextEmail(JTextField JtextEmail) {
        this.JtextEmail = JtextEmail;
    }

    public JTextField getJtextNome() {
        return JtextNome;
    }

    public void setJtextNome(JTextField JtextNome) {
        this.JtextNome = JtextNome;
    }

    public JFormattedTextField getJtextRg() {
        return JtextRg;
    }

    public void setJtextRg(JFormattedTextField JtextRg) {
        this.JtextRg = JtextRg;
    }

    public JTextField getJtextSenha() {
        return JtextSenha;
    }

    public void setJtextSenha(JTextField JtextSenha) {
        this.JtextSenha = JtextSenha;
    }

    public JFormattedTextField getJtextTelefone1() {
        return JtextTelefone1;
    }

    public void setJtextTelefone1(JFormattedTextField JtextTelefone1) {
        this.JtextTelefone1 = JtextTelefone1;
    }

    public JFormattedTextField getJtextTelefone2() {
        return JtextTelefone2;
    }

    public void setJtextTelefone2(JFormattedTextField JtextTelefone2) {
        this.JtextTelefone2 = JtextTelefone2;
    }

    public JTextField getJtextUsuario() {
        return JtextUsuario;
    }

    public void setJtextUsuario(JTextField JtextUsuario) {
        this.JtextUsuario = JtextUsuario;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JTextField getjCBBairro() {
        return jCBBairro;
    }

    public void setjCBBairro(JTextField jCBBairro) {
        this.jCBBairro = jCBBairro;
    }

    public JTextField getjCBCidade() {
        return jCBCidade;
    }

    public void setjCBCidade(JTextField jCBCidade) {
        this.jCBCidade = jCBCidade;
    }

    public JLabel getjLId() {
        return jLId;
    }

    public void setjLId(JLabel jLId) {
        this.jLId = jLId;
    }

    public JLabel getjLId10() {
        return jLId10;
    }

    public void setjLId10(JLabel jLId10) {
        this.jLId10 = jLId10;
    }

    public JLabel getjLId11() {
        return jLId11;
    }

    public void setjLId11(JLabel jLId11) {
        this.jLId11 = jLId11;
    }

    public JLabel getjLId12() {
        return jLId12;
    }

    public void setjLId12(JLabel jLId12) {
        this.jLId12 = jLId12;
    }

    public JLabel getjLId13() {
        return jLId13;
    }

    public void setjLId13(JLabel jLId13) {
        this.jLId13 = jLId13;
    }

    public JLabel getjLId14() {
        return jLId14;
    }

    public void setjLId14(JLabel jLId14) {
        this.jLId14 = jLId14;
    }

    public JLabel getjLId2() {
        return jLId2;
    }

    public void setjLId2(JLabel jLId2) {
        this.jLId2 = jLId2;
    }

    public JLabel getjLId3() {
        return jLId3;
    }

    public void setjLId3(JLabel jLId3) {
        this.jLId3 = jLId3;
    }

    public JLabel getjLId4() {
        return jLId4;
    }

    public void setjLId4(JLabel jLId4) {
        this.jLId4 = jLId4;
    }

    public JLabel getjLId5() {
        return jLId5;
    }

    public void setjLId5(JLabel jLId5) {
        this.jLId5 = jLId5;
    }

    public JLabel getjLId6() {
        return jLId6;
    }

    public void setjLId6(JLabel jLId6) {
        this.jLId6 = jLId6;
    }

    public JLabel getjLId7() {
        return jLId7;
    }

    public void setjLId7(JLabel jLId7) {
        this.jLId7 = jLId7;
    }

    public JLabel getjLId8() {
        return jLId8;
    }

    public void setjLId8(JLabel jLId8) {
        this.jLId8 = jLId8;
    }

    public JLabel getjLId9() {
        return jLId9;
    }

    public void setjLId9(JLabel jLId9) {
        this.jLId9 = jLId9;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanBotoes() {
        return jPanBotoes;
    }

    public void setjPanBotoes(JPanel jPanBotoes) {
        this.jPanBotoes = jPanBotoes;
    }

    public JPanel getjPanDados() {
        return jPanDados;
    }

    public void setjPanDados(JPanel jPanDados) {
        this.jPanDados = jPanDados;
    }

    public JPanel getjPanTitulo() {
        return jPanTitulo;
    }

    public void setjPanTitulo(JPanel jPanTitulo) {
        this.jPanTitulo = jPanTitulo;
    }

    public JTextField getjTFId1() {
        return jTFId1;
    }

    public void setjTFId1(JTextField jTFId1) {
        this.jTFId1 = jTFId1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanDados = new javax.swing.JPanel();
        JtextNome = new javax.swing.JTextField();
        jLId = new javax.swing.JLabel();
        jLId2 = new javax.swing.JLabel();
        jTFId1 = new javax.swing.JTextField();
        JtextCpf = new javax.swing.JFormattedTextField();
        jLId3 = new javax.swing.JLabel();
        jLId4 = new javax.swing.JLabel();
        JtextEmail = new javax.swing.JTextField();
        JtextTelefone1 = new javax.swing.JFormattedTextField();
        jLId5 = new javax.swing.JLabel();
        jLId6 = new javax.swing.JLabel();
        JtextComplemento = new javax.swing.JTextField();
        JtextTelefone2 = new javax.swing.JFormattedTextField();
        jLId7 = new javax.swing.JLabel();
        jLId8 = new javax.swing.JLabel();
        JtextCep = new javax.swing.JFormattedTextField();
        jLId9 = new javax.swing.JLabel();
        jLId10 = new javax.swing.JLabel();
        JcomboBoxStatus = new javax.swing.JComboBox<>();
        jLId11 = new javax.swing.JLabel();
        jLId12 = new javax.swing.JLabel();
        jLId13 = new javax.swing.JLabel();
        JtextSenha = new javax.swing.JTextField();
        JtextUsuario = new javax.swing.JTextField();
        jLId14 = new javax.swing.JLabel();
        JtextRg = new javax.swing.JFormattedTextField();
        jCBCidade = new javax.swing.JTextField();
        jCBBairro = new javax.swing.JTextField();
        jBBuscarCep = new javax.swing.JButton();
        jPanBotoes = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanTitulo.setBackground(new java.awt.Color(255, 204, 102));
        jPanTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanTitulo.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionario");

        javax.swing.GroupLayout jPanTituloLayout = new javax.swing.GroupLayout(jPanTitulo);
        jPanTitulo.setLayout(jPanTituloLayout);
        jPanTituloLayout.setHorizontalGroup(
                jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE));
        jPanTituloLayout.setVerticalGroup(
                jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE));

        jPanDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanDados.setEnabled(false);

        JtextNome.setName("JtextNome"); // NOI18N

        jLId.setText("ID");

        jLId2.setText("Nome");

        jTFId1.setEditable(false);

        try {
            JtextCpf.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtextCpf.setText("");
        JtextCpf.setName("JtextCpf"); // NOI18N

        jLId3.setText("CPF");

        jLId4.setText("Cep");

        JtextEmail.setName("JtextEmail"); // NOI18N

        try {
            JtextTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                    new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtextTelefone1.setText("");
        JtextTelefone1.setName("JtextTelefone1"); // NOI18N

        jLId5.setText("Telefone 2");

        jLId6.setText("Complemento de Endereco");

        JtextComplemento.setName("JtextComplemento"); // NOI18N

        try {
            JtextTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                    new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtextTelefone2.setText("");
        JtextTelefone2.setName("JtextTelefone2"); // NOI18N

        jLId7.setText("Telefone");

        jLId8.setText("Status");

        try {
            JtextCep.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtextCep.setName("JtextCep"); // NOI18N
        JtextCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextCeptxtCEPActionPerformed(evt);
            }
        });

        jLId9.setText("Email");

        jLId10.setText("Bairro");

        JcomboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        JcomboBoxStatus.setName("JcomboBoxStatus"); // NOI18N

        jLId11.setText("Cidade");

        jLId12.setText("RG");

        jLId13.setText("Senha");

        JtextSenha.setName("JtextSenha"); // NOI18N

        JtextUsuario.setName("JtextUsuario"); // NOI18N

        jLId14.setText("Usuario");

        try {
            JtextRg.setFormatterFactory(
                    new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JtextRg.setName("JtextRg"); // NOI18N
        JtextRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextRgActionPerformed(evt);
            }
        });

        jCBCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCBCidade.setEnabled(false);
        jCBCidade.setName("JtextCidade"); // NOI18N

        jCBBairro.setEnabled(false);
        jCBBairro.setName("JtextBairro"); // NOI18N

        jBBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanDadosLayout = new javax.swing.GroupLayout(jPanDados);
        jPanDados.setLayout(jPanDadosLayout);
        jPanDadosLayout.setHorizontalGroup(
                jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanDadosLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanDadosLayout
                                                .createSequentialGroup()
                                                .addComponent(jLId9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLId3)
                                                .addGap(134, 134, 134))
                                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLId)
                                                        .addComponent(jTFId1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JtextNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLId2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLId12)
                                                        .addComponent(JtextRg, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLId8)
                                                        .addComponent(JcomboBoxStatus,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanDadosLayout
                                                .createSequentialGroup()
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JtextUsuario,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 287,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLId14))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                                                .addComponent(jLId13)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(JtextSenha)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanDadosLayout
                                                .createSequentialGroup()
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanDadosLayout.createSequentialGroup()
                                                                        .addGroup(jPanDadosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addGroup(jPanDadosLayout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(JtextCep,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                110,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jBBuscarCep,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(3, 3, 3))
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        jPanDadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLId4)
                                                                                                .addGap(139, 139, 139)))
                                                                        .addGroup(jPanDadosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLId11)
                                                                                .addComponent(jCBCidade,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        127,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanDadosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanDadosLayout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(jLId10)
                                                                                        .addGap(104, 104, 104))
                                                                                .addComponent(jCBBairro)))
                                                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                                                .addComponent(jLId6)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(JtextEmail)
                                                        .addComponent(JtextComplemento))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanDadosLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JtextTelefone2)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanDadosLayout.createSequentialGroup()
                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                        .addGroup(jPanDadosLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(JtextCpf,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        165,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanDadosLayout
                                                                                        .createSequentialGroup()
                                                                                        .addGap(6, 6, 6)
                                                                                        .addComponent(jLId7))))
                                                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLId5))
                                                        .addComponent(JtextTelefone1))))
                                .addGap(15, 15, 15)));
        jPanDadosLayout.setVerticalGroup(
                jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLId)
                                                .addComponent(jLId2)
                                                .addComponent(jLId8)
                                                .addComponent(jLId12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTFId1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JcomboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextRg, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLId3, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLId9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JtextCpf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLId7, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLId4)
                                                .addComponent(jLId10)
                                                .addComponent(jLId11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanDadosLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JtextTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextCep, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jCBBairro, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLId6)
                                                .addComponent(jLId5, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JtextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLId13)
                                                .addComponent(jLId14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(JtextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JtextSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE)));

        jPanBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.setActionCommand("0");
        jBNovo.setPreferredSize(new java.awt.Dimension(110, 35));
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });
        jPanBotoes.add(jBNovo);

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setActionCommand("1");
        jBCancelar.setEnabled(false);
        jBCancelar.setPreferredSize(new java.awt.Dimension(110, 35));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanBotoes.add(jBCancelar);

        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OK.png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.setActionCommand("1");
        jBGravar.setEnabled(false);
        jBGravar.setPreferredSize(new java.awt.Dimension(110, 35));
        jPanBotoes.add(jBGravar);

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setActionCommand("0");
        jBBuscar.setPreferredSize(new java.awt.Dimension(110, 35));
        jPanBotoes.add(jBBuscar);

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.setActionCommand("0");
        jBSair.setPreferredSize(new java.awt.Dimension(110, 35));
        jPanBotoes.add(jBSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanTitulo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 629,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanTitulo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanBotoes, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBNovoActionPerformed

    private void JtextCeptxtCEPActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JtextCeptxtCEPActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_JtextCeptxtCEPActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBCancelarActionPerformed

    private void JtextRgActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_JtextRgActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_JtextRgActionPerformed

    private void jBBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBBuscarCepActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBBuscarCepActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TemplateCadastros dialog = new TemplateCadastros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboBoxStatus;
    private javax.swing.JFormattedTextField JtextCep;
    private javax.swing.JTextField JtextComplemento;
    private javax.swing.JFormattedTextField JtextCpf;
    private javax.swing.JTextField JtextEmail;
    private javax.swing.JTextField JtextNome;
    private javax.swing.JFormattedTextField JtextRg;
    private javax.swing.JTextField JtextSenha;
    private javax.swing.JFormattedTextField JtextTelefone1;
    private javax.swing.JFormattedTextField JtextTelefone2;
    private javax.swing.JTextField JtextUsuario;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarCep;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jCBBairro;
    private javax.swing.JTextField jCBCidade;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLId10;
    private javax.swing.JLabel jLId11;
    private javax.swing.JLabel jLId12;
    private javax.swing.JLabel jLId13;
    private javax.swing.JLabel jLId14;
    private javax.swing.JLabel jLId2;
    private javax.swing.JLabel jLId3;
    private javax.swing.JLabel jLId4;
    private javax.swing.JLabel jLId5;
    private javax.swing.JLabel jLId6;
    private javax.swing.JLabel jLId7;
    private javax.swing.JLabel jLId8;
    private javax.swing.JLabel jLId9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanBotoes;
    private javax.swing.JPanel jPanDados;
    private javax.swing.JPanel jPanTitulo;
    private javax.swing.JTextField jTFId1;
    // End of variables declaration//GEN-END:variables
}
