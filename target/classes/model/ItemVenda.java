/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "qtdProduto", nullable = false)
    private int qtdProduto;

    @Column(name = "valorUnitario", nullable = false)
    private double valorUnitario;

    @JoinColumn
    @ManyToOne
    private Venda venda;

    @JoinColumn
    @ManyToOne
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int qtdProduto, double valorUnitario, Venda venda, Produto produto) {
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
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
