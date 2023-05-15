package model;

public class ItemVenda {
    private Produto produto;
    private Vendas vendas;
    private int id;
    private float qntProduto, valorUnitario;
    private char status;

    public ItemVenda(Produto produto, Vendas vendas, int id, float qntProduto, float valorUnitario, char status) {
        this.produto = produto;
        this.vendas = vendas;
        this.id = id;
        this.qntProduto = qntProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(float qntProduto) {
        this.qntProduto = qntProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "produto=" + produto + ", vendas=" + vendas + ", id=" + id + ", qntProduto=" + qntProduto + ", valorUnitario=" + valorUnitario + ", status=" + status + '}';
    }
    
    
}
