package model;

public class Bairro {
    private int id;
    private String descricao;

    public Bairro(){
    }

    public Bairro(int id, String descricao){
        this.id= id;
        this.descricao = descricao;
    }
    
    public int getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
