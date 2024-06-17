package padroesestruturais.facade.Restaurante;

public class Cozinha extends Setor {

    private static Cozinha cozinha = new Cozinha();

    private Cozinha() {};

    public static Cozinha getInstancia() {
        return cozinha;
    }
}
