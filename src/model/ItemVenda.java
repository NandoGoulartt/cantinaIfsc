/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class ItemVenda {

    private int id;
    private int qtdProduto;
    private String valorUnitario;
    private Venda venda;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int qtdProduto, String valorUnitario, Venda venda, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.venda = venda;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(int id) {
        Venda venda = service.VendaService.carregar(id);
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(int id) {
        Produto produto = service.ProdutoService.carregar(id);
        this.produto = produto;
    }
}
