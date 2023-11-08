/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static utilities.Utilities.getCharStatusFromString;

/**
 *
 * @author aluno
 */
public class Endereco {
    
    private int id;
    private String cep;
    private String logradouro;
    private char status;
    
    private Cidade cidade;
    private Bairro bairro;
    
    
    public Endereco(){
        
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
            return "A";
        }
        
        return "I";
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
        return "Endereco{" + "id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", status=" + status + ", cidade=" + cidade + ", bairro=" + bairro + '}';
    }
    
    
}
