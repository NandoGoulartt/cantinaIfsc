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

/**
 *
 * @author aluno
 */
@Entity
public class MovimentacaoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Column
    private String datahoraMovimento;
    
    @Column
    private char flagTipoMovimento;
    
    @Column
    private float qtdMovimentada;
    
    @Column
    private String observacaoMovimento;
    
    @Column
    private char status;
    
    @JoinColumn
    @ManyToOne
    private Produto produto;
    
    @JoinColumn
    @ManyToOne
    private Funcionario funcionario;

    
    
    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(int id, String datahoraCompra, char flagTipoMovimento, float qtdMovimentada, String observacaoMovimento, char status, ItemCompra ItemCompra) {
        this.id = id;
        this.datahoraMovimento = datahoraCompra;
        this.flagTipoMovimento = flagTipoMovimento;
        this.qtdMovimentada = qtdMovimentada;
        this.observacaoMovimento = observacaoMovimento;
        this.status = status;
    }

    public Produto getProduto_id() {
        return produto;
    }

    public void setProduto_id(Produto produto_id) {
        this.produto = produto_id;
    }

    public Funcionario getFuncionario_id() {
        return funcionario;
    }

    public void setFuncionario_id(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatahoraCompra() {
        return datahoraMovimento;
    }

    public void setDatahoraCompra(String datahoraCompra) {
        this.datahoraMovimento = datahoraCompra;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public float getQtdMovimentada() {
        return qtdMovimentada;
    }

    public void setQtdMovimentada(float qtdMovimentada) {
        this.qtdMovimentada = qtdMovimentada;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    
}
