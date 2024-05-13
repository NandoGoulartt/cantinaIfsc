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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.Funcionario;



/**
 *
 * @author aluno
 */
@Entity
public class Caixa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataHoraAbertura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataHoraFechamento;
    @Column
    private float valorAbertura;
    @Column
    private float valorFechamento;
    @Column
    private String observacao;
    @Column
    private char status;
    
    @JoinColumn
    @ManyToOne
    private Funcionario funcionario;
    
    public Caixa() {
    }

    public Caixa(int id, Date dataHoraAbertura, Date dataHoraFechamento, float valorAbertura, float valorFechamento, String observacao, char status) {
        this.id = id;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.valorAbertura = valorAbertura;
        this.valorFechamento = valorFechamento;
        this.observacao = observacao;
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public Date getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(Date dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public Date getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(Date dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return this.getId() + " "+
                this.getDataHoraAbertura() + " " +
                this.getDataHoraFechamento() + " "+
                this.getValorAbertura() +  " "+
                this.getValorFechamento() + " "+
                this.getObservacao() + " "+
                this.getStatus() + " " +
                this.funcionario.getCpf()+" "+
                this.funcionario.getRg()+" "+
                this.funcionario.getUsuario()+" "+
                this.funcionario.getSenha()+" ";        
                
    }
    
    
    
}
