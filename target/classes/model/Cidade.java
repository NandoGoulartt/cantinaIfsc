package model;

public class Cidade {
    private int id;
    private String descricao;
    private String uf;
    
    public Cidade(){
    }

    public Cidade(int id, String descricao, String uf) {
        this.id = id;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", descricao=" + descricao + ", uf=" + uf + '}';
    }

}
