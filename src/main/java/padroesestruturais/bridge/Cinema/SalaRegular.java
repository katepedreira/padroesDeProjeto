package padroesestruturais.bridge.Cinema;

public class SalaRegular extends Sala{

    public SalaRegular(float precoIngressoBase) {
        super(precoIngressoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoIngressoBase - (this.precoIngressoBase * this.ingresso.percentualDesconto());
    }
}
