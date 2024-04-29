/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static utilities.Utilities.getCharStatusFromString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "logradouro", length = 100, nullable = false)
    private String logradouro;

    @Column(name = "status", nullable = false)
    private char status;

    @JoinColumn
    @ManyToOne
    private Cidade cidade;

    @JoinColumn
    @ManyToOne
    private Bairro bairro;

    public Endereco() {

    }

    public Endereco(int id, String cep, String logradouro, char status, Cidade cidade, Bairro bairro) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.status = status;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
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

    public Cidade getCidade() {
        return cidade;
    }

    public int getCidadeId() {
        return cidade.getId();
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setCidadeId(int id) {
        Cidade cidade = service.CidadeService.carregar(id);
        this.cidade = cidade;
    }

    public int getBairroId() {
        return bairro.getId();
    }

    public void setBairroId(int id) {
        Bairro bairro = service.BairroService.carregar(id);
        this.bairro = bairro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setStatus(String status) {
        this.status = getCharStatusFromString(status);
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", status=" + status
                + ", cidade=" + cidade + ", bairro=" + bairro + '}';
    }

}
