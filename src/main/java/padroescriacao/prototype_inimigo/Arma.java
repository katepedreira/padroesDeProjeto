package padroescriacao.prototype_inimigo;

public class Arma implements Cloneable{

    private String cor;
    private Integer qtdBalas;

    public Arma(String cor, Integer qtdBalas) {
        super();
        this.cor = cor;
        this.qtdBalas = qtdBalas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQtdBalas() {
        return qtdBalas;
    }

    public void setQtdBalas(Integer qtdBalas) {
        this.qtdBalas = qtdBalas;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Arma{" +
                "cor='" + cor + '\'' +
                ", qtdBalas=" + qtdBalas +
                '}';

    }



}
