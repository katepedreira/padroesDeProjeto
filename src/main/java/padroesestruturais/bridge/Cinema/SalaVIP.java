package padroesestruturais.bridge.Cinema;

public class SalaVIP extends Sala {

    public SalaVIP(float precoIngressoBase) {
        super(precoIngressoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoIngressoBase - (this.precoIngressoBase * this.ingresso.percentualDesconto());
    }

}
