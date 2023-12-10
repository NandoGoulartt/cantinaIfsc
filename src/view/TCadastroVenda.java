package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TCadastroVenda extends javax.swing.JDialog {

    int clienteID;

    public TCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public JButton getjBAdicionarProduto() {
        return jBAdicionarProduto;
    }

    public void setjBAdicionarProduto(JButton jBAdicionarProduto) {
        this.jBAdicionarProduto = jBAdicionarProduto;
    }

    public JButton getjBBuscar() {
        return jBBuscar;
    }

    public void setjBBuscar(JButton jBBuscar) {
        this.jBBuscar = jBBuscar;
    }

    public JButton getjBBuscarCarteirinha() {
        return jBBuscarCarteirinha;
    }

    public void setjBBuscarCarteirinha(JButton jBBuscarCarteirinha) {
        this.jBBuscarCarteirinha = jBBuscarCarteirinha;
    }

    public JButton getjBBuscarProduto() {
        return jBBuscarProduto;
    }

    public void setjBBuscarProduto(JButton jBBuscarProduto) {
        this.jBBuscarProduto = jBBuscarProduto;
    }

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public void setjBCancelar(JButton jBCancelar) {
        this.jBCancelar = jBCancelar;
    }

    public JButton getjBFuncionario() {
        return jBFuncionario;
    }

    public void setjBFuncionario(JButton jBFuncionario) {
        this.jBFuncionario = jBFuncionario;
    }

    public JButton getjBGravar() {
        return jBGravar;
    }

    public void setjBGravar(JButton jBGravar) {
        this.jBGravar = jBGravar;
    }

    public JButton getjBNovo() {
        return jBNovo;
    }

    public void setjBNovo(JButton jBNovo) {
        this.jBNovo = jBNovo;
    }

    public JButton getjBSair() {
        return jBSair;
    }

    public void setjBSair(JButton jBSair) {
        this.jBSair = jBSair;
    }

    public JComboBox<String> getjCBStatus() {
        return jCBStatus;
    }

    public void setjCBStatus(JComboBox<String> jCBStatus) {
        this.jCBStatus = jCBStatus;
    }

    public JLabel getjLCep1() {
        return jLCep1;
    }

    public void setjLCep1(JLabel jLCep1) {
        this.jLCep1 = jLCep1;
    }

    public JLabel getjLCodBarras() {
        return jLCodBarras;
    }

    public void setjLCodBarras(JLabel jLCodBarras) {
        this.jLCodBarras = jLCodBarras;
    }

    public JLabel getjLFlagTipoDesconto() {
        return jLFlagTipoDesconto;
    }

    public void setjLFlagTipoDesconto(JLabel jLFlagTipoDesconto) {
        this.jLFlagTipoDesconto = jLFlagTipoDesconto;
    }

    public JLabel getjLFuncionario() {
        return jLFuncionario;
    }

    public void setjLFuncionario(JLabel jLFuncionario) {
        this.jLFuncionario = jLFuncionario;
    }

    public JLabel getjLId() {
        return jLId;
    }

    public void setjLId(JLabel jLId) {
        this.jLId = jLId;
    }

    public JLabel getjLId2() {
        return jLId2;
    }

    public void setjLId2(JLabel jLId2) {
        this.jLId2 = jLId2;
    }

    public JLabel getjLObservacao() {
        return jLObservacao;
    }

    public void setjLObservacao(JLabel jLObservacao) {
        this.jLObservacao = jLObservacao;
    }

    public JLabel getjLStatus() {
        return jLStatus;
    }

    public void setjLStatus(JLabel jLStatus) {
        this.jLStatus = jLStatus;
    }

    public JLabel getjLValor() {
        return jLValor;
    }

    public void setjLValor(JLabel jLValor) {
        this.jLValor = jLValor;
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

    public JPanel getjPanDados1() {
        return jPanDados1;
    }

    public void setjPanDados1(JPanel jPanDados1) {
        this.jPanDados1 = jPanDados1;
    }

    public JPanel getjPanTitulo() {
        return jPanTitulo;
    }

    public void setjPanTitulo(JPanel jPanTitulo) {
        this.jPanTitulo = jPanTitulo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getjTCarteirinha() {
        return jTCarteirinha;
    }

    public void setjTCarteirinha(JTextField jTCarteirinha) {
        this.jTCarteirinha = jTCarteirinha;
    }

    public JTextField getjTFCodBarras() {
        return jTFCodBarras;
    }

    public void setjTFCodBarras(JTextField jTFCodBarras) {
        this.jTFCodBarras = jTFCodBarras;
    }

    public JTextField getjTFFlagTipoDesconto() {
        return jTFFlagTipoDesconto;
    }

    public void setjTFFlagTipoDesconto(JTextField jTFFlagTipoDesconto) {
        this.jTFFlagTipoDesconto = jTFFlagTipoDesconto;
    }

    public JTextField getjTFId() {
        return jTFId;
    }

    public void setjTFId(JTextField jTFId) {
        this.jTFId = jTFId;
    }

    public JTextField getjTFObservacao() {
        return jTFObservacao;
    }

    public void setjTFObservacao(JTextField jTFObservacao) {
        this.jTFObservacao = jTFObservacao;
    }

    public JTextField getjTFValor() {
        return jTFValor;
    }

    public void setjTFValor(JTextField jTFValor) {
        this.jTFValor = jTFValor;
    }

    public JTextField getjTFcunionario() {
        return jTFcunionario;
    }

    public void setjTFcunionario(JTextField jTFcunionario) {
        this.jTFcunionario = jTFcunionario;
    }

    public JTable getjTableDados() {
        return jTableDados;
    }

    public void setjTableDados(JTable jTableDados) {
        this.jTableDados = jTableDados;
    }

    public JFormattedTextField getTxtdateGeracao() {
        return txtdateGeracao;
    }

    public void setTxtdateGeracao(JFormattedTextField txtdateGeracao) {
        this.txtdateGeracao = txtdateGeracao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanBotoes = new javax.swing.JPanel();
        jBNovo = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanDados = new javax.swing.JPanel();
        jLCodBarras = new javax.swing.JLabel();
        jTFCodBarras = new javax.swing.JTextField();
        jBBuscarProduto = new javax.swing.JButton();
        jBAdicionarProduto = new javax.swing.JButton();
        jPanDados1 = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLObservacao = new javax.swing.JLabel();
        jTFObservacao = new javax.swing.JTextField();
        jLFlagTipoDesconto = new javax.swing.JLabel();
        jTFFlagTipoDesconto = new javax.swing.JTextField();
        jTFValor = new javax.swing.JTextField();
        jLValor = new javax.swing.JLabel();
        txtdateGeracao = new javax.swing.JFormattedTextField();
        jLId2 = new javax.swing.JLabel();
        jCBStatus = new javax.swing.JComboBox<>();
        jLStatus = new javax.swing.JLabel();
        jLCep1 = new javax.swing.JLabel();
        jTCarteirinha = new javax.swing.JTextField();
        jBBuscarCarteirinha = new javax.swing.JButton();
        jLFuncionario = new javax.swing.JLabel();
        jTFcunionario = new javax.swing.JTextField();
        jBFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Bairros");
        setResizable(false);

        jPanTitulo.setBackground(new java.awt.Color(255, 204, 102));
        jPanTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanTitulo.setForeground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venda");

        javax.swing.GroupLayout jPanTituloLayout = new javax.swing.GroupLayout(jPanTitulo);
        jPanTitulo.setLayout(jPanTituloLayout);
        jPanTituloLayout.setHorizontalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanTituloLayout.setVerticalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
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

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Cod de Barra", "Descrição", "Estoque", "Preco"
            }
        ));
        jScrollPane1.setViewportView(jTableDados);

        jPanDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanDados.setEnabled(false);

        jLCodBarras.setText("Cod de Barras");

        jTFCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodBarrasActionPerformed(evt);
            }
        });

        jBBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBBuscarProduto.setText("Buscar");
        jBBuscarProduto.setActionCommand("0");
        jBBuscarProduto.setPreferredSize(new java.awt.Dimension(110, 35));
        jBBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProdutoActionPerformed(evt);
            }
        });

        jBAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jBAdicionarProduto.setText("Adicionar");
        jBAdicionarProduto.setActionCommand("1");
        jBAdicionarProduto.setPreferredSize(new java.awt.Dimension(110, 35));
        jBAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanDadosLayout = new javax.swing.GroupLayout(jPanDados);
        jPanDados.setLayout(jPanDadosLayout);
        jPanDadosLayout.setHorizontalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanDadosLayout.createSequentialGroup()
                        .addComponent(jTFCodBarras, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jBBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanDadosLayout.createSequentialGroup()
                        .addComponent(jLCodBarras)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanDadosLayout.setVerticalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanDados1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanDados1.setEnabled(false);

        jLId.setText("ID");

        jTFId.setEditable(false);

        jLObservacao.setText("Observacao");

        jLFlagTipoDesconto.setText("Tipo Desconto");

        jTFFlagTipoDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFlagTipoDescontoActionPerformed(evt);
            }
        });

        jTFValor.setEditable(false);

        jLValor.setText("Valor");

        txtdateGeracao.setEditable(false);
        try {
            txtdateGeracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdateGeracao.setText("");

        jLId2.setText("Data Geração");

        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jCBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBStatusActionPerformed(evt);
            }
        });

        jLStatus.setText("Status");

        jLCep1.setText("Carteirinha");

        jTCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCarteirinhaActionPerformed(evt);
            }
        });

        jBBuscarCarteirinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBBuscarCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCarteirinhaActionPerformed(evt);
            }
        });

        jLFuncionario.setText("Funcionario");

        jTFcunionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcunionarioActionPerformed(evt);
            }
        });

        jBFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jBFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanDados1Layout = new javax.swing.GroupLayout(jPanDados1);
        jPanDados1.setLayout(jPanDados1Layout);
        jPanDados1Layout.setHorizontalGroup(
            jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDados1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLObservacao)
                    .addComponent(jTFObservacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanDados1Layout.createSequentialGroup()
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLId)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLId2)
                            .addComponent(txtdateGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLStatus)
                            .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanDados1Layout.createSequentialGroup()
                                .addComponent(jLFlagTipoDesconto)
                                .addGap(124, 124, 124))
                            .addComponent(jTFFlagTipoDesconto))))
                .addGap(18, 18, 18)
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLCep1)
                    .addGroup(jPanDados1Layout.createSequentialGroup()
                        .addComponent(jTCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscarCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLFuncionario)
                    .addGroup(jPanDados1Layout.createSequentialGroup()
                        .addComponent(jTFcunionario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLValor)
                    .addComponent(jTFValor))
                .addGap(12, 12, 12))
        );
        jPanDados1Layout.setVerticalGroup(
            jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanDados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jLFlagTipoDesconto)
                    .addComponent(jLId2)
                    .addComponent(jLStatus)
                    .addComponent(jLValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdateGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFlagTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLObservacao)
                    .addComponent(jLCep1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanDados1Layout.createSequentialGroup()
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanDados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanDados1Layout.createSequentialGroup()
                                .addComponent(jLFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFcunionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTFObservacao))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanDados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanDados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarProdutoActionPerformed

    private void jTFCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodBarrasActionPerformed

    private void jBAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarProdutoActionPerformed

    private void jTFFlagTipoDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFlagTipoDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFlagTipoDescontoActionPerformed

    private void jCBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBStatusActionPerformed

    private void jTCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCarteirinhaActionPerformed

    private void jBBuscarCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCarteirinhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarCarteirinhaActionPerformed

    private void jTFcunionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcunionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcunionarioActionPerformed

    private void jBFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFuncionarioActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBNovoActionPerformed

    }// GEN-LAST:event_jBNovoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCancelarActionPerformed

        // TODO add your handling code here:
    }// GEN-LAST:event_jBCancelarActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBGravarActionPerformed

        // TODO add your handling code here:
    }// GEN-LAST:event_jBGravarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBSairActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBBuscarActionPerformed

    private void txtdateGeracaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtdateGeracaoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtdateGeracaoActionPerformed

    private void txtdateCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtdateCancelamentoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtdateCancelamentoActionPerformed

    private void jBBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBBuscarClienteActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jBBuscarClienteActionPerformed

    private void jTFIdclienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTFIdclienteActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTFIdclienteActionPerformed

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
                TCadastroVenda dialog = new TCadastroVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAdicionarProduto;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarCarteirinha;
    private javax.swing.JButton jBBuscarProduto;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFuncionario;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox<String> jCBStatus;
    private javax.swing.JLabel jLCep1;
    private javax.swing.JLabel jLCodBarras;
    private javax.swing.JLabel jLFlagTipoDesconto;
    private javax.swing.JLabel jLFuncionario;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLId2;
    private javax.swing.JLabel jLObservacao;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanBotoes;
    private javax.swing.JPanel jPanDados;
    private javax.swing.JPanel jPanDados1;
    private javax.swing.JPanel jPanTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCarteirinha;
    private javax.swing.JTextField jTFCodBarras;
    private javax.swing.JTextField jTFFlagTipoDesconto;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFObservacao;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JTextField jTFcunionario;
    private javax.swing.JTable jTableDados;
    private javax.swing.JFormattedTextField txtdateGeracao;
    // End of variables declaration//GEN-END:variables
}
