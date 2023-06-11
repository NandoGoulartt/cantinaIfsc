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
public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private char status;
    private String complementoEndereco;
    private Endereco endereco;
    
    public Pessoa(){
        
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone1() {
        return fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        if (status == 'a') {
            return "Ativo";
        }
        
        return "Inativo";
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email + ", status=" + status + ", complementoEndereco=" + complementoEndereco + ", endereco=" + endereco + '}';
    }


    
    
}
