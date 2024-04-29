/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @Column(name = "fone1", length = 50, nullable = false)
    private String fone1;

    @Column(name = "fone2", length = 50, nullable = true)
    private String fone2;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "status", length = 1, nullable = false)
    private char status;

    @Column(name = "complementoEndereco", length = 50, nullable = true)
    private String complementoEndereco;

    @JoinColumn
    @ManyToOne
    private Endereco endereco;

    public Pessoa() {

    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, char status,
            String complementoEndereco, Endereco endereco) {
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

    public String getStatusChar() {
        if (this.status == 'a') {
            return "a";
        }

        return "i";
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getEnderecoId() {
        return endereco.getId();
    }

    public void setEnderecoId(int id) {
        Endereco endereco = service.EnderecoService.carregar(id);
        this.endereco = endereco;
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
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email
                + ", status=" + status + ", complementoEndereco=" + complementoEndereco + ", endereco=" + endereco
                + '}';
    }

}
