package model;

public class Vendas {
    private Funcionario funcionario;
    private int id;
    private String observacao, dataVenda;
    private char flag, status;
    private float valorDesconto;

    public Vendas() {
    }

    
    
    public Vendas(Funcionario funcionario, int id, String observacao, String dataVenda, char flag, char status, float valorDesconto) {
        this.funcionario = funcionario;
        this.id = id;
        this.observacao = observacao;
        this.dataVenda = dataVenda;
        this.flag = flag;
        this.status = status;
        this.valorDesconto = valorDesconto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "Vendas{" + "funcionario=" + funcionario + ", id=" + id + ", observacao=" + observacao + ", dataVenda=" + dataVenda + ", flag=" + flag + ", status=" + status + ", valorDesconto=" + valorDesconto + '}';
    }
     
}
