/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.MovimentoCaixa;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.Venda;



/**
 *
 * @author aluno
 */
@Entity
public class Contas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataHoraEmissao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataVencimento;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataQuitacao;
    @Column
    private float valorEmitido;
    @Column
    private float valorAcrescimo;
    @Column
    private float valorDesconto;
    @Column
    private float valorQuitado;
    @Column
    private String observacao;
    @Column
    private char flagTipoConta;
    @Column
    private char status;

    @JoinColumn (name = "venda_id", nullable = true)
    @OneToOne 
    private Venda venda;
    
    @JoinColumn (name = "movimentocaixa_id", nullable = true)
    @OneToOne
    private MovimentoCaixa movimentoCaixa;//ver
    
    public Contas() {
    }

    public Contas(int id, Date dataHoraEmissao, Date dataVencimento, Date dataQuitacao, float valorEmitido, float valorAcrescimo, float valorDesconto, float valorQuitado, String observacao, char flagTipoConta, char status) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.valorEmitido = valorEmitido;
        this.valorAcrescimo = valorAcrescimo;
        this.valorDesconto = valorDesconto;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public MovimentoCaixa getMovimentoCaixa() {
        return movimentoCaixa;
    }

    public void setMovimentoCaixa(MovimentoCaixa movimentoCaixa) {
        this.movimentoCaixa = movimentoCaixa;
    }


    public char getStatus() {
        return status;
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

    public Date getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(Date dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(Date dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    @Override
    public String toString() {
        return this.getId() +" "+
                this.getDataHoraEmissao() +" "+
                this.getDataVencimento() + " "+
                this.getDataQuitacao() + " "+
                this.getValorEmitido() + " "+ 
                this.getValorDesconto() + " "+
                this.getValorAcrescimo() + " "+
                this.getValorQuitado() + " "+ 
                this.getObservacao() + " "+
                this.getFlagTipoConta() + " "+
                this.getStatus() + " " +
                this.venda.getId() + " " +
                this.venda.getFlagTipoDesconto()+ " "+
                this.venda.getObservacao() + " " +
                this.venda.getStatus() + " ";
    }
    
    
    
}
