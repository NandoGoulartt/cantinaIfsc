package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TCadastroFornecedor extends javax.swing.JDialog {
    
    int enderecoID;

    public TCadastroFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   }

    
    public void setEnderecoId(int id) {
        this.enderecoID = id;
    }
    
    public int getEnderecoId() {
        return enderecoID;
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

    public JButton getjBSair() {
        return jBSair;
    }


    public JPanel getjPanBotoes() {
        return jPanBotoes;
    }

    public JPanel getjPanDados() {
        return jPanDados;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }


    public void setjBBuscarCep(JButton jBBuscarCep) {
        this.jBBuscarCep = jBBuscarCep;
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

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public void setjComboBoxStatus(JComboBox<String> jComboBoxStatus) {
        this.jComboBoxStatus = jComboBoxStatus;
    }

    public JLabel getjLId1() {
        return jLId1;
    }

    public void setjLId1(JLabel jLId1) {
        this.jLId1 = jLId1;
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

    public JPanel getjPanTitulo() {
        return jPanTitulo;
    }

    public void setjPanTitulo(JPanel jPanTitulo) {
        this.jPanTitulo = jPanTitulo;
    }

    public JTextField getjTFComplemento() {
        return jTFComplemento;
    }

    public void setjTFComplemento(JTextField jTFComplemento) {
        this.jTFComplemento = jTFComplemento;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public void setjTFEmail(JTextField jTFEmail) {
        this.jTFEmail = jTFEmail;
    }

    public JTextField getjTFId4() {
        return jTFId4;
    }

    public void setjTFId4(JTextField jTFId4) {
        this.jTFId4 = jTFId4;
    }

    public JTextField getjTFInscricao() {
        return jTFInscricao;
    }

    public void setjTFInscricao(JTextField jTFInscricao) {
        this.jTFInscricao = jTFInscricao;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public void setjTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }

    public JTextField getjTFRazaoSocial() {
        return jTFRazaoSocial;
    }

    public void setjTFRazaoSocial(JTextField jTFRazaoSocial) {
        this.jTFRazaoSocial = jTFRazaoSocial;
    }

    public JFormattedTextField getTxtCEP() {
        return txtCEP;
    }

    public void setTxtCEP(JFormattedTextField txtCEP) {
        this.txtCEP = txtCEP;
    }

    public JFormattedTextField getTxtCNPJ() {
        return txtCNPJ;
    }

    public void setTxtCNPJ(JFormattedTextField txtCNPJ) {
        this.txtCNPJ = txtCNPJ;
    }

    public JFormattedTextField getTxtFone1() {
        return txtFone1;
    }

    public void setTxtFone1(JFormattedTextField txtFone1) {
        this.txtFone1 = txtFone1;
    }

    public JFormattedTextField getTxtFone2() {
        return txtFone2;
    }

    public void setTxtFone2(JFormattedTextField txtFone2) {
        this.txtFone2 = txtFone2;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanDados = new javax.swing.JPanel();
        jLId4 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        txtFone1 = new javax.swing.JFormattedTextField();
        jLId5 = new javax.swing.JLabel();
        jLId6 = new javax.swing.JLabel();
        jTFRazaoSocial = new javax.swing.JTextField();
        txtFone2 = new javax.swing.JFormattedTextField();
        jLId7 = new javax.swing.JLabel();
        jLId8 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLId9 = new javax.swing.JLabel();
        jLId10 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLId11 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLId1 = new javax.swing.JLabel();
        jLId12 = new javax.swing.JLabel();
        jLId2 = new javax.swing.JLabel();
        jLId13 = new javax.swing.JLabel();
        jTFId4 = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLId3 = new javax.swing.JLabel();
        jTFInscricao = new javax.swing.JTextField();
        jBBuscarCep = new javax.swing.JButton();
        jCBCidade = new javax.swing.JTextField();
        jCBBairro = new javax.swing.JTextField();
        jPanBotoes = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Bairros");
        setResizable(false);

        jPanTitulo.setBackground(new java.awt.Color(255, 204, 102));
        jPanTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanTitulo.setForeground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fornecedor");

        javax.swing.GroupLayout jPanTituloLayout = new javax.swing.GroupLayout(jPanTitulo);
        jPanTitulo.setLayout(jPanTituloLayout);
        jPanTituloLayout.setHorizontalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanTituloLayout.setVerticalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanDados.setEnabled(false);

        jLId4.setText("Cep");

        try {
            txtFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLId5.setText("Telefone 2");

        jLId6.setText("Razao Social");

        try {
            txtFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLId7.setText("Telefone");

        jLId8.setText("Status");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPtxtCEPActionPerformed(evt);
            }
        });

        jLId9.setText("Email");

        jLId10.setText("Bairro");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jLId11.setText("Cidade");

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLId1.setText("ID");

        jLId12.setText("IE");

        jLId2.setText("Nome");

        jLId13.setText("Complemento de Endereco");

        jTFId4.setEditable(false);

        jTFComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFComplementoActionPerformed(evt);
            }
        });

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setText("");
        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });

        jLId3.setText("CNPJ");

        jTFInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInscricaoActionPerformed(evt);
            }
        });

        jBBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCepActionPerformed(evt);
            }
        });

        jCBCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCBCidade.setEnabled(false);
        jCBCidade.setName("JtextCidade"); // NOI18N

        jCBBairro.setEnabled(false);
        jCBBairro.setName("JtextBairro"); // NOI18N

        javax.swing.GroupLayout jPanDadosLayout = new javax.swing.GroupLayout(jPanDados);
        jPanDados.setLayout(jPanDadosLayout);
        jPanDadosLayout.setHorizontalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosLayout.createSequentialGroup()
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDadosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLId9)
                            .addGroup(jPanDadosLayout.createSequentialGroup()
                                .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFone2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDadosLayout.createSequentialGroup()
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addComponent(jLId1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(jLId2)
                                        .addGap(276, 276, 276))
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addComponent(jTFId4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addComponent(jLId12)
                                        .addGap(162, 162, 162))
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addComponent(jTFInscricao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLId8)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanDadosLayout.createSequentialGroup()
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanDadosLayout.createSequentialGroup()
                                            .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLId4)
                                                .addGroup(jPanDadosLayout.createSequentialGroup()
                                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDadosLayout.createSequentialGroup()
                                                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(jPanDadosLayout.createSequentialGroup()
                                                    .addComponent(jLId11)
                                                    .addGap(86, 86, 86)))
                                            .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLId10)
                                                .addComponent(jCBBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLId13))
                                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLId5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLId7)
                                        .addGap(114, 114, 114))
                                    .addGroup(jPanDadosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanDadosLayout.createSequentialGroup()
                                                .addComponent(jLId3)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtCNPJ)
                                            .addComponent(txtFone1)))))
                            .addComponent(jTFRazaoSocial)))
                    .addGroup(jPanDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLId6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanDadosLayout.setVerticalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId1)
                    .addComponent(jLId2)
                    .addComponent(jLId8)
                    .addComponent(jLId12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFId4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLId9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLId4)
                    .addComponent(jLId10)
                    .addComponent(jLId11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanDadosLayout.createSequentialGroup()
                        .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLId5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLId13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLId6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

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
        jBGravar.setPreferredSize(new java.awt.Dimension(110, 35));
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });
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
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        jPanBotoes.add(jBSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed


    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSairActionPerformed

    private void txtCEPtxtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPtxtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPtxtCEPActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarCepActionPerformed

    private void jTFInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInscricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFInscricaoActionPerformed

    private void jTFComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFComplementoActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TCadastroFornecedor dialog = new TCadastroFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarCep;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jCBBairro;
    private javax.swing.JTextField jCBCidade;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLId1;
    private javax.swing.JLabel jLId10;
    private javax.swing.JLabel jLId11;
    private javax.swing.JLabel jLId12;
    private javax.swing.JLabel jLId13;
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
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFId4;
    private javax.swing.JTextField jTFInscricao;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRazaoSocial;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtFone1;
    private javax.swing.JFormattedTextField txtFone2;
    // End of variables declaration//GEN-END:variables
}
