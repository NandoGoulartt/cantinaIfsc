package model;

class Carteirinha {
    private String codigoBarra, dataGeracao, dataCancelamento;
    private Cliente cliente;
    private int id;

    public Carteirinha() {
    }

    
    public Carteirinha(String codigoBarra, String dataGeracao, String dataCancelamento, Cliente cliente, int id) {
        this.codigoBarra = codigoBarra;
        this.dataGeracao = dataGeracao;
        this.dataCancelamento = dataCancelamento;
        this.cliente = cliente;
        this.id = id;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Carteirinha{" + "codigoBarra=" + codigoBarra + ", dataGeracao=" + dataGeracao + ", dataCancelamento=" + dataCancelamento + ", cliente=" + cliente + ", id=" + id + '}';
    }
    
    
}
