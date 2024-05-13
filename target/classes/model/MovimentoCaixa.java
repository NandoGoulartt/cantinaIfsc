/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.Caixa;


/**
 *
 * @author aluno
 */
@Entity
public class MovimentoCaixa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataHoraMovimento;
    @Column
    private float valorMovimento;
    @Column
    private String observacao;
    @Column
    private char flagTipoMovimento;
    @Column
    private char status;

    
    //private Contas contas; ver
    @JoinColumn
    @ManyToOne
    private Caixa caixa;
    
    
    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, Date dataHoraMovimento, float valorMovimento, String observacao, char flagTipoMovimento, char status) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.valorMovimento = valorMovimento;
        this.observacao = observacao;
        this.flagTipoMovimento = flagTipoMovimento;
        this.status = status;
    }

    public char getStatus() {
        return status;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(Date dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    @Override
    public String toString() {
        return this.getId() + " "+
                this.getDataHoraMovimento() + " "+
                this.getValorMovimento() + " "+
                this.getObservacao() + " "+
                this.getFlagTipoMovimento() + " "+
                this.getStatus() + " "+
                this.getId() +" "+
                /*this.contas.getDataHoraEmissao() +" "+
                this.contas.getDataVencimento() + " "+
                this.contas.getDataQuitacao() + " "+
                this.contas.getValorEmitido() + " "+ 
                this.contas.getValorDesconto() + " "+
                this.contas.getValorAcrescimo() + " "+
                this.contas.getValorQuitado() + " "+ 
                this.contas.getObservacao() + " "+
                this.contas.getFlagTipoConta() + " "+
                this.contas.getStatus() + " " +*/
                this.caixa.getId() + " "+
                this.caixa.getDataHoraAbertura() + " " +
                this.caixa.getDataHoraFechamento() + " "+
                this.caixa.getValorAbertura() +  " "+
                this.caixa.getValorFechamento() + " "+
                this.caixa.getObservacao() + " "+
                this.caixa.getStatus() + " ";
       
    }
    
    
    
}
