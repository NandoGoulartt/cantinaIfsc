
package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Carteirinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "codigoBarra", length = 50, nullable = false)
    private String codBarra;

    @Column(name = "cliente_id", nullable = false)
    private int idcliente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date dataGeracao;

    @Column
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
