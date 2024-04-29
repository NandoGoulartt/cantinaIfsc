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

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;

    @Column(name = "codigoBarra", length = 50, nullable = false)
    private String codigoBarra;

    @Column(name = "status", length = 1, nullable = false)
    private char status;

    @Column(name = "preco", nullable = false)
    private double preco;

    @Column(name = "estoque", nullable = false)
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
