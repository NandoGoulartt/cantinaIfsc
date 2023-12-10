/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author viniciusblazius
 */
public class Venda {
    private int id;
    private String observacao;
    private char status;
    private Funcionario funcionario;
    private Carteirinha carteirinha;
    private String flagTipoDesconto;
    private Date dataHoraVenda;

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

    public char getStatus() {
        return status;
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
