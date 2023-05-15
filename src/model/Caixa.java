package model;

public class Caixa {
    private Funcionario funcionario;
    private String dataHoraAbertura, dataHoraFechamento, observacao;
    private float valorFechamento, valorAbertura;
    private int id;
    private char status;

    
    public Caixa(){
        
    }
    public Caixa(Funcionario funcionario, String dataHoraAbertura, String dataHoraFechamento, String observacao, float valorFechamento, float valorAbertura, int id, char status) {
        this.funcionario = funcionario;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.observacao = observacao;
        this.valorFechamento = valorFechamento;
        this.valorAbertura = valorAbertura;
        this.id = id;
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(String dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public String getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(String dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Caixa{" + "funcionario=" + funcionario + ", dataHoraAbertura=" + dataHoraAbertura + ", dataHoraFechamento=" + dataHoraFechamento + ", observacao=" + observacao + ", valorFechamento=" + valorFechamento + ", valorAbertura=" + valorAbertura + ", id=" + id + ", status=" + status + '}';
    }
    
}
