package padroesestruturais.bridge.Cinema;

public class SalaIMAX extends Sala {


        public SalaIMAX(float precoIngressoBase) {
            super(precoIngressoBase);
        }

        public float calcularPrecoFinal() {
            return this.precoIngressoBase - (this.precoIngressoBase * this.ingresso.percentualDesconto());
        }

}
