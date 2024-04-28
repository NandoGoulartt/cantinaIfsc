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
public class ItemCompra {
    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;
    private Produto produto;

    public ItemCompra(int id, float qtdProduto, float valorUnitario, char status, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitario=" + valorUnitario + ", status=" + status + ", produto=" + produto + '}';
    }
    
}
