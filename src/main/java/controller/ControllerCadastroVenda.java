package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Caixa;

import model.Carteirinha;
import model.Contas;
import model.Funcionario;
import model.ItemVenda;
import model.MovimentacaoEstoque;
import model.MovimentoCaixa;
import model.Produto;
import model.Venda;
import service.CaixaService;
import service.ContaService;
import service.FuncionarioService;
import service.MovimentaEstoqueService;
import service.MovimentoCaixaService;
import service.ProdutoService;
import utilities.Utilities;
import view.TBuscaCarteirinha;
import view.TBuscaFuncionario;
import view.TBuscaProduto;
import view.TBuscaVenda;
import view.TCadastroVenda;

public class ControllerCadastroVenda extends ControllerCadastro implements ActionListener {

    TCadastroVenda telaCadastroVenda;
    public static int codigo;
    DefaultTableModel tabela;
    public ControllerCadastroVenda(TCadastroVenda telaCadastroVenda) {
        this.telaCadastroVenda = telaCadastroVenda;

        this.telaCadastroVenda.getjBNovo().addActionListener(this);
        this.telaCadastroVenda.getjBSair().addActionListener(this);
        this.telaCadastroVenda.getjBCancelar().addActionListener(this);
        this.telaCadastroVenda.getjBGravar().addActionListener(this);
        this.telaCadastroVenda.getjBBuscar().addActionListener(this);
        this.telaCadastroVenda.getjBBuscarCarteirinha().addActionListener(this);
        this.telaCadastroVenda.getjBBuscarProduto().addActionListener(this);
        this.telaCadastroVenda.getjBBuscarFuncionario().addActionListener(this);
        this.telaCadastroVenda.getjBAdicionarProduto().addActionListener(this);
        this.telaCadastroVenda.getjBFecharCaixa().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

        utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
        Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());

        this.telaCadastroVenda.getjTFValor().setEnabled(false);
        tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroVenda.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados1());

            this.telaCadastroVenda.getjTFId().setEnabled(false);
            this.telaCadastroVenda.getjTFValor().setEnabled(false);
            
            this.telaCadastroVenda.getjTFuncionario().setText(FuncionarioService.carregar(this.telaCadastroVenda.getFuncionarioID()).getNome());
            this.telaCadastroVenda.getjTFValor().setText("0");
            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());

            DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
            tabela.setRowCount(0);

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBGravar()) {
            Venda venda = new Venda();
            Calendar calendario = Calendar.getInstance();

            String id = this.telaCadastroVenda.getjTFId().getText();
            String observacao = this.telaCadastroVenda.getjTFObservacao().getText();
            String status = this.telaCadastroVenda.getjCBStatus().getSelectedItem().toString();
            String flagStatusDesconto = this.telaCadastroVenda.getjTFFlagTipoDesconto().getText();
            int carteirinhaID = this.telaCadastroVenda.getCarteirinhaID();
            int funcionarioID = this.telaCadastroVenda.getFuncionarioID();

            ArrayList<String> fields = new ArrayList<>(List.of(observacao, status, flagStatusDesconto));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

                utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
                Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());
                return;
            }

            venda.setObservacao(observacao);
            venda.setDataHoraVenda(calendario.getTime());
            venda.setStatus(Utilities.getCharStatusFromString(status));
            venda.setFlagTipoDesconto(flagStatusDesconto);
            venda.setCarteirinha(carteirinhaID);
            venda.setFuncionario(funcionarioID);
                
            if (this.telaCadastroVenda.getjTFId().getText().equalsIgnoreCase("")) {
                venda.setVlrVenda(Float.valueOf(this.telaCadastroVenda.getjTFValor().getText()));
                service.VendaService.adicionar(venda);

                for (ItemVenda itemVenda : this.telaCadastroVenda.getItensVenda()) {
                    Produto produto = itemVenda.getProduto();
                    MovimentacaoEstoque movEstoque = new MovimentacaoEstoque();
                    Funcionario funcionario = new Funcionario();
                    
                    funcionario = FuncionarioService.carregar(this.telaCadastroVenda.getFuncionarioID());
                    List<Venda> vendas = service.VendaService.carregar();
                    Venda vendaCarregada = vendas.get(vendas.size() - 1);
                    
                    movEstoque.setDatahoraCompra(calendario.getTime() + "");
                    movEstoque.setFlagTipoMovimento('S');
                    movEstoque.setObservacaoMovimento("Saída por Venda");
                    movEstoque.setQtdMovimentada(itemVenda.getQtdProduto());
                    movEstoque.setStatus('I');
                    movEstoque.setProduto_id(itemVenda.getProduto());
                    movEstoque.setFuncionario_id(funcionario);
                    
                    MovimentaEstoqueService.adicionar(movEstoque);
                    
                    produto.setEstoque(produto.getEstoque() - itemVenda.getQtdProduto());
                    ProdutoService.atualizar(produto);
                    
                    itemVenda.setVenda(vendaCarregada.getId());
                    service.ItemVendaService.adicionar(itemVenda);
                    
                }
                
                List<Caixa> listaCaixa = new ArrayList();
                listaCaixa = CaixaService.carregar();
                Caixa caixa;
                
                if(listaCaixa.size() > 1){
                    caixa = CaixaService.carregar(listaCaixa.size() - 1);
                }else{
                    caixa = CaixaService.carregar(1);
                }
                
                MovimentoCaixa movCaixa = new MovimentoCaixa();
                movCaixa.setDataHoraMovimento(calendario.getTime());
                movCaixa.setFlagTipoMovimento('A');
                movCaixa.setObservacao("Venda Efetuada");
                movCaixa.setStatus('I');
                movCaixa.setValorMovimento(Float.valueOf(this.telaCadastroVenda.getjTFValor().getText()));
                movCaixa.setCaixa(caixa);
                
                MovimentoCaixaService.adicionar(movCaixa);
                
                Contas conta = new Contas();
                conta.setDataHoraEmissao(calendario.getTime());
                conta.setDataQuitacao(calendario.getTime());
                conta.setDataVencimento(calendario.getTime());
                conta.setFlagTipoConta('V');
                conta.setMovimentoCaixa(movCaixa);
                conta.setStatus('I');
                conta.setObservacao("Fechada");
                conta.setValorAcrescimo(0);
                conta.setValorDesconto(0);
                conta.setValorEmitido(Float.valueOf(this.telaCadastroVenda.getjTFValor().getText()));
                conta.setValorQuitado(Float.valueOf(this.telaCadastroVenda.getjTFValor().getText()));
                conta.setVenda(venda);
                
                ContaService.adicionar(conta);
                
                tabela.setRowCount(0);
            } else {
                venda.setId(Integer.parseInt(this.telaCadastroVenda.getjTFId().getText()));
                service.VendaService.atualizar(venda);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());
            
            DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
            tabela.setRowCount(0);
            
            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscar()) {
            TBuscaVenda telaBuscaVenda = new TBuscaVenda(null, true);

            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados1());

            this.telaCadastroVenda.getjTFId().setEnabled(false);
            this.telaCadastroVenda.getjTFValor().setEnabled(false);
            new ControllerBuscaVenda(telaBuscaVenda);

            telaBuscaVenda.setVisible(true);

            if (codigo != 0) {
                Venda venda = new Venda();
                venda = service.VendaService.carregar(codigo);
                // utilities.Utilities.ativaDesativa(false,
                //         this.telaCadastroVenda.getjPanBotoes());
                // Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados());

                // utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanDados1());
                // Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados1());

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String dataFormatada = formatter.format(venda.getDataHoraVenda());

                this.telaCadastroVenda.getjTFId().setText(venda.getId() + "");
                this.telaCadastroVenda.getjTFObservacao().setText(venda.getObservacao());
                this.telaCadastroVenda.getjTFValor().setText(Double.toString(venda.getVlrVenda()));
                this.telaCadastroVenda.getjTFFlagTipoDesconto().setText(venda.getFlagTipoDesconto());
                this.telaCadastroVenda.getjTCarteirinha().setText(venda.getCarteirinha().getCodBarra());
                this.telaCadastroVenda.getjTFuncionario().setText(venda.getFuncionario().getNome());
                this.telaCadastroVenda.setCarteirinhaID(venda.getCarteirinha().getId());
                this.telaCadastroVenda.setFuncionarioID(venda.getFuncionario().getId());
                this.telaCadastroVenda.getTxtdateGeracao().setText(dataFormatada);

                this.telaCadastroVenda.getjCBStatus().setSelectedItem(venda.getStatus());

                List<ItemVenda> itemVendas = new ArrayList<ItemVenda>();
                itemVendas = service.ItemVendaService.carregarPorVenda(venda);

                DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
                tabela.setRowCount(0);

                for (ItemVenda itemVenda : itemVendas) {
                    Produto produto = new Produto();
                    produto = service.ProdutoService.carregar(itemVenda.getProduto().getId());

                    tabela.addRow(new Object[] {
                            produto.getId(),
                            produto.getCodigoBarra(),
                            itemVenda.getQtdProduto(),
                            produto.getPreco()
                    });
                }

                int valorTotal = itemVendas.stream()
                        .mapToInt(item -> (int) item.getProduto().getPreco() * item.getQtdProduto())
                        .sum();
                
                utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
                this.telaCadastroVenda.getjTFValor().setText(Integer.toString(valorTotal));
            }

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscarCarteirinha()) {
            TBuscaCarteirinha telaBuscaCarteirinha = new TBuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(telaBuscaCarteirinha,
                    this);
            telaBuscaCarteirinha.setVisible(true);
            if (this.getCodigoCarteirinhaCadastro() != 0) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = service.CarteirinhaService.carregar(this.getCodigoCarteirinhaCadastro());

                this.telaCadastroVenda.setCarteirinhaID(carteirinha.getId());
                this.telaCadastroVenda.getjTCarteirinha().setText(carteirinha.getCodBarra());
                this.setCodigoCarteirinhaCadastro(0);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscarFuncionario()) {
            TBuscaFuncionario telaBuscaFuncionario = new TBuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario,
                    this);
            telaBuscaFuncionario.setVisible(true);
            if (this.getCodigoFuncionarioCadastro() != 0) {
                Funcionario carteirinha = new Funcionario();
                carteirinha = service.FuncionarioService.carregar(this.getCodigoFuncionarioCadastro());

                this.telaCadastroVenda.setFuncionarioID(carteirinha.getId());
                this.telaCadastroVenda.getjTFuncionario().setText(carteirinha.getNome());
                this.setCodigoFuncionarioCadastro(0);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscarProduto()) {
            TBuscaProduto telaBuscaProduto = new TBuscaProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaProduto,
                    this);
            telaBuscaProduto.setVisible(true);

            if (this.getCodigoProdutoCadastro() != 0) {
                Produto produto = new Produto();
                produto = service.ProdutoService.carregar(this.getCodigoProdutoCadastro());

                if (produto.getEstoque() == 0) {
                    JOptionPane.showMessageDialog(null, "Selecione um produto com estoque", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ItemVenda itemVenda = new ItemVenda();
                itemVenda.setProduto(produto.getId());
                itemVenda.setQtdProduto(1);
                itemVenda.setValorUnitario(produto.getPreco());

                this.telaCadastroVenda.getItensVenda().add(itemVenda);

                DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
                tabela.addRow(new Object[] {
                        produto.getId(),
                        produto.getCodigoBarra(),
                        itemVenda.getQtdProduto(),
                        produto.getPreco()
                });

                int valorTotal = this.telaCadastroVenda.getItensVenda().stream()
                        .mapToInt(item -> (int) item.getProduto().getPreco())
                        .sum();

                this.telaCadastroVenda.getjTFValor().setText(Integer.toString(valorTotal));
            }

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBAdicionarProduto()) {
            int quantidade = 1;
            if(this.telaCadastroVenda.getjTFCodBarras().getText().length() > 13){
                quantidade = Integer.valueOf(this.telaCadastroVenda.getjTFCodBarras().getText().substring(14, Integer.valueOf(this.telaCadastroVenda.getjTFCodBarras().getText().length())));
                this.telaCadastroVenda.getjTFCodBarras().setText(this.telaCadastroVenda.getjTFCodBarras().getText().substring(0,13));
            }
            
            Produto produto = new Produto();
            produto = service.ProdutoService.carregar(this.telaCadastroVenda.getjTFCodBarras().getText(),
                    "codigoBarra");

            if (produto.getDescricao() == null) {
                JOptionPane.showMessageDialog(null, "Produto nao encontrado", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (produto.getEstoque() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um produto com estoque", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setProduto(produto.getId());
            itemVenda.setQtdProduto(quantidade);
            itemVenda.setValorUnitario(produto.getPreco());
            
            this.telaCadastroVenda.getjTFValor().setText("" + Float.valueOf(this.telaCadastroVenda.getjTFValor().getText()) + itemVenda.getValorUnitario() * itemVenda.getQtdProduto());
            this.telaCadastroVenda.getItensVenda().add(itemVenda);

            DefaultTableModel tabela = (DefaultTableModel) this.telaCadastroVenda.getjTableDados().getModel();
            tabela.addRow(new Object[] {
                    produto.getId(),
                    produto.getCodigoBarra(),
                    itemVenda.getQtdProduto(),
                    produto.getPreco()
            });

            int valorTotal = this.telaCadastroVenda.getItensVenda().stream()
                    .mapToInt(item -> (int) item.getProduto().getPreco() * item.getQtdProduto())
                    .sum();

            this.telaCadastroVenda.getjTFValor().setText(Float.toString(valorTotal));

            return;
        }else if(e.getSource() == this.telaCadastroVenda.getjBFecharCaixa()){
            int result = JOptionPane.showConfirmDialog(null, "Vai fechar o caixa?");
            Calendar calendario = Calendar.getInstance();
            
            if(result == JOptionPane.YES_OPTION){
                List<Caixa> ListaCaixa = new ArrayList();
                ListaCaixa = CaixaService.carregar();
                Caixa caixa = ListaCaixa.get(ListaCaixa.size() - 1);
                caixa.setStatus('F');
                caixa.setDataHoraFechamento(calendario.getTime());
                
                List<MovimentoCaixa> listaMov = new ArrayList();
                listaMov = MovimentoCaixaService.carregar();
                
                float aux = 0;
                for(MovimentoCaixa mov : listaMov){
                    if(mov.getCaixa().getId() == ListaCaixa.size() -1){
                        aux += mov.getValorMovimento();
                    }
                }
                
                caixa.setValorFechamento(aux);
                CaixaService.atualizar(caixa);
                
                this.telaCadastroVenda.dispose();
        }else if(e.getSource() == this.telaCadastroVenda.getjBSair()){
            this.telaCadastroVenda.dispose();
        }

        this.telaCadastroVenda.dispose();
    }
    }
}
