package model;

public class Contas {
    private Vendas vendas;
    private Compra compra;
    private int id;
    private float valorEmitido, valorDesc, valorAcrescimo, valorQuitado;
    private String obcervacao, dataVencimento, dataQuitacao;
    private char flagTipo, status;

    
    public Contas(){
        
    }
    public Contas(Vendas vendas, Compra compra, int id, float valorEmitido, float valorDesc, float valorAcrescimo, float valorQuitado, String obcervacao, String dataVencimento, String dataQuitacao, char flagTipo, char status) {
        this.vendas = vendas;
        this.compra = compra;
        this.id = id;
        this.valorEmitido = valorEmitido;
        this.valorDesc = valorDesc;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.obcervacao = obcervacao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.flagTipo = flagTipo;
        this.status = status;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(float valorDesc) {
        this.valorDesc = valorDesc;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public String getObcervacao() {
        return obcervacao;
    }

    public void setObcervacao(String obcervacao) {
        this.obcervacao = obcervacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(String dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public char getFlagTipo() {
        return flagTipo;
    }

    public void setFlagTipo(char flagTipo) {
        this.flagTipo = flagTipo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contas{" + "vendas=" + vendas + ", compra=" + compra + ", id=" + id + ", valorEmitido=" + valorEmitido + ", valorDesc=" + valorDesc + ", valorAcrescimo=" + valorAcrescimo + ", valorQuitado=" + valorQuitado + ", obcervacao=" + obcervacao + ", dataVencimento=" + dataVencimento + ", dataQuitacao=" + dataQuitacao + ", flagTipo=" + flagTipo + ", status=" + status + '}';
    }
    
    
    
}
