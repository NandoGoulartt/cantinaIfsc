/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "observacao", length = 50, nullable = true)
    private String observacao;

    @Column(name = "status", length = 1, nullable = false)
    private char status;

    @JoinColumn
    @ManyToOne
    private Funcionario funcionario;

    @JoinColumn
    @ManyToOne
    private Carteirinha carteirinha;

    @Column(name = "flagTipoDesconto", length = 1, nullable = false)
    private String flagTipoDesconto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataHoraVenda;

    @Column(name = "vlrVenda", nullable = false)
    private double vlrVenda;

    public Venda() {
    }

    public Venda(int id, String observacao, char status, Funcionario funcionario, Carteirinha carteirinha,
            String flagTipoDesconto, Date dataHoraVenda) {
        this.id = id;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcionario;
        this.carteirinha = carteirinha;
        this.flagTipoDesconto = flagTipoDesconto;
        this.dataHoraVenda = dataHoraVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public String getStatus() {
        if (this.status == 'a') {
            return "Ativo";
        }

        return "Inativo";
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int id) {
        Funcionario funcionario = service.FuncionarioService.carregar(id);
        this.funcionario = funcionario;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public String getCliente() {
        int idcliente = carteirinha.getIdcliente();
        Cliente cliente = service.ClienteService.carregar(idcliente);
        return cliente.getNome();
    }

    public void setCarteirinha(int id) {
        Carteirinha carteirinha = service.CarteirinhaService.carregar(id);
        this.carteirinha = carteirinha;
    }

    public String getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(String flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public Date getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(Date dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

}
