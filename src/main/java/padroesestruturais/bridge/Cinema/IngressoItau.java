package padroesestruturais.bridge.Cinema;

public class IngressoItau implements Ingresso {

    @Override
    public float percentualDesconto() {
        return 0.2f;
    }
}
