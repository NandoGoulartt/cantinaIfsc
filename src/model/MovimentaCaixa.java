package model;

public class MovimentaCaixa {
    
    private Caixa caixa;
    private Contas contas;
    private int id;
    private String dataHoraMovimento, observacao;
    private float valorMovimento;

    public MovimentaCaixa() {
    }

    
    
    public MovimentaCaixa(Caixa caixa, Contas contas, int id, String dataHoraMovimento, String observacao, float valorMovimento) {
        this.caixa = caixa;
        this.contas = contas;
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.observacao = observacao;
        this.valorMovimento = valorMovimento;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Contas getContas() {
        return contas;
    }

    public void setContas(Contas contas) {
        this.contas = contas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(String dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    @Override
    public String toString() {
        return "MovimentaCaixa{" + "caixa=" + caixa + ", contas=" + contas + ", id=" + id + ", dataHoraMovimento=" + dataHoraMovimento + ", observacao=" + observacao + ", valorMovimento=" + valorMovimento + '}';
    }
    
    
}
