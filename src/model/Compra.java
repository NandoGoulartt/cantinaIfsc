package model;

public class Compra {
    private Fornecedor fonrecedor;
    private int id, numeronf;
    private String dataHoraCompra, obcervacao;
    private char flagTipo, status;
    private float valorDesc;

    public Compra() {
    }

    
    
    public Compra(Fornecedor fonrecedor, int id, int numeronf, String dataHoraCompra, String obcervacao, char flagTipo, char status, float valorDesc) {
        this.fonrecedor = fonrecedor;
        this.id = id;
        this.numeronf = numeronf;
        this.dataHoraCompra = dataHoraCompra;
        this.obcervacao = obcervacao;
        this.flagTipo = flagTipo;
        this.status = status;
        this.valorDesc = valorDesc;
    }

    public Fornecedor getFonrecedor() {
        return fonrecedor;
    }

    public void setFonrecedor(Fornecedor fonrecedor) {
        this.fonrecedor = fonrecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeronf() {
        return numeronf;
    }

    public void setNumeronf(int numeronf) {
        this.numeronf = numeronf;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public String getObcervacao() {
        return obcervacao;
    }

    public void setObcervacao(String obcervacao) {
        this.obcervacao = obcervacao;
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

    public float getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(float valorDesc) {
        this.valorDesc = valorDesc;
    }

    @Override
    public String toString() {
        return "Compra{" + "fonrecedor=" + fonrecedor + ", id=" + id + ", numeronf=" + numeronf + ", dataHoraCompra=" + dataHoraCompra + ", obcervacao=" + obcervacao + ", flagTipo=" + flagTipo + ", status=" + status + ", valorDesc=" + valorDesc + '}';
    }
    
}
