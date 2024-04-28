
package model;

import java.util.Date;

public class Carteirinha {

    private int id;
    private String codBarra;
    private int idcliente;
    private Date dataGeracao;
    private String dataCancelamento;

    public Carteirinha() {
    }

    public Carteirinha(int id, String codBarra, int idcliente, Date dataGeracao, String dataCancelamento) {
        this.id = id;
        this.codBarra = codBarra;
        this.idcliente = idcliente;
        this.dataGeracao = dataGeracao;
        this.dataCancelamento = dataCancelamento;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public int getId() {
        return id;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return "Carteirinha{" + "id=" + id + ", codBarra=" + codBarra + ", idCliente=" + idcliente + ", dataGeracao="
                + dataGeracao + ", dataCancelamento=" + dataCancelamento + '}';
    }
}
