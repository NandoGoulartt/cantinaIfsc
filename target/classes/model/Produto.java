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
public class Produto {

    private int id;
    private String descricao;
    private String codigoBarra;
    private char status;
    private double preco;
    private int estoque = 90;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarra, char status, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.status = status;
        this.preco = preco;
        this.estoque = 90;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getStatus() {
        if (this.status == 'a') {
            return "Ativo";
        }

        return "Inativo";
    }

    public String getStatusChar() {
        if (this.status == 'a') {
            return "a";
        }

        return "i";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    } 

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", codigoBarra=" + codigoBarra + ", status="
                + status + '}';
    }

}
