package padroesestruturais.bridge.Cinema;

public abstract class Sala {

    protected Ingresso ingresso;
    protected float precoIngressoBase;

    public Sala(float precoIngressoBase) {
        this.precoIngressoBase = precoIngressoBase;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public void setPrecoIngressoBase(float precoIngressoBase) {
        this.precoIngressoBase = precoIngressoBase;
    }

    public abstract float calcularPrecoFinal();
}
