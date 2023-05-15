package model;

public class ItemCompra {
    private int id;
    private float qntProduto, valorUnitario;
    private char status;
    private Compra compra;
    private Produto produto;

    public ItemCompra() {
    }

    public ItemCompra(int id, float qntProduto, float valorUnitario, char status, Compra compra, Produto produto) {
        this.id = id;
        this.qntProduto = qntProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.compra = compra;
        this.produto = produto;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemCompra{" + "id=" + id + ", qntProduto=" + qntProduto + ", valorUnitario=" + valorUnitario + ", status=" + status + ", compra=" + compra + ", produto=" + produto + '}';
    }
    
    
    
    
}
