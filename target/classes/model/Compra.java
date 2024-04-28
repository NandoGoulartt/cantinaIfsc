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
public class Compra {
    private int id;
    private int numeronf;
    private String datahoraCompra;
    private float valorDesconto;
    private char flagTipoDesconto;
    private char status;
    private String observacao;
    
    private Fornecedor fornecedor;
    private ItemCompra itemCompra;

    public Compra(int id, int numeronf, String datahoraCompra, float valorDesconto, char flagTipoDesconto, char status, String observacao, Fornecedor fornecedor, ItemCompra itemCompra) {
        this.id = id;
        this.numeronf = numeronf;
        this.datahoraCompra = datahoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
        this.fornecedor = fornecedor;
        this.itemCompra = itemCompra;
    }

    public int getId() {
        return id;
    }

    public int getNumeronf() {
        return numeronf;
    }

    public String getDatahoraCompra() {
        return datahoraCompra;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public char getStatus() {
        return status;
    }

    public String getObservacao() {
        return observacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeronf(int numeronf) {
        this.numeronf = numeronf;
    }

    public void setDatahoraCompra(String datahoraCompra) {
        this.datahoraCompra = datahoraCompra;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", numeronf=" + numeronf + ", datahoraCompra=" + datahoraCompra + ", valorDesconto=" + valorDesconto + ", flagTipoDesconto=" + flagTipoDesconto + ", status=" + status + ", observacao=" + observacao + ", fornecedor=" + fornecedor + ", itemCompra=" + itemCompra + '}';
    }
    
}
