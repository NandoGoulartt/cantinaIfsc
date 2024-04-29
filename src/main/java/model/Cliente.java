/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente extends Pessoa{

    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "rg", length = 12, nullable = false)
    private String rg;

    @Column(name = "matricula", length = 50, nullable = false)
    private String matricula;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataNascimento;
    
    public Cliente(){
    }


    public Cliente(String cpf, String rg, String matricula, Date dataNascimento, int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", rg=" + rg + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
    
}
