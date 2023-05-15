package model;

public class MovimentacaoEstoque {
    private Funcionario funcionario;
    private Produto produto;
    private ItemVenda itemVenda;
    private ItemCompra itemCompra;
    private int id;
    private String dataHoraMovimento, obcervacaoMovimento;
    private float qntMovimentada;
    private char flag, status;

    public MovimentacaoEstoque() {
    }

    
    
    public MovimentacaoEstoque(Funcionario funcionario, Produto produto, ItemVenda itemVenda, ItemCompra itemCompra, int id, String dataHoraMovimento, String obcervacaoMovimento, float qntMovimentada, char flag, char status) {
        this.funcionario = funcionario;
        this.produto = produto;
        this.itemVenda = itemVenda;
        this.itemCompra = itemCompra;
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.obcervacaoMovimento = obcervacaoMovimento;
        this.qntMovimentada = qntMovimentada;
        this.flag = flag;
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemVenda getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }

    public ItemCompra getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(ItemCompra itemCompra) {
        this.itemCompra = itemCompra;
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

    public String getObcervacaoMovimento() {
        return obcervacaoMovimento;
    }

    public void setObcervacaoMovimento(String obcervacaoMovimento) {
        this.obcervacaoMovimento = obcervacaoMovimento;
    }

    public float getQntMovimentada() {
        return qntMovimentada;
    }

    public void setQntMovimentada(float qntMovimentada) {
        this.qntMovimentada = qntMovimentada;
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

    @Override
    public String toString() {
        return "MovimentacaoEstoque{" + "funcionario=" + funcionario + ", produto=" + produto + ", itemVenda=" + itemVenda + ", itemCompra=" + itemCompra + ", id=" + id + ", dataHoraMovimento=" + dataHoraMovimento + ", obcervacaoMovimento=" + obcervacaoMovimento + ", qntMovimentada=" + qntMovimentada + ", flag=" + flag + ", status=" + status + '}';
    }   
}
