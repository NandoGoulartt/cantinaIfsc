package model;

public class Produto {
    private String descricao, codigoBarra;
    private int id;
    private char status;

    public Produto() {
    }

    
    
    public Produto(String descricao, String codigoBarra, int id, char status) {
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.id = id;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
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
        return "Produto{" + "descricao=" + descricao + ", codigoBarra=" + codigoBarra + ", id=" + id + ", status=" + status + '}';
    }
    
}
