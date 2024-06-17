package padroesestruturais.facade.Restaurante;


public class Entrega extends Setor {

    private static Entrega entrega = new Entrega();

    private Entrega() {};

    public static Entrega getInstancia() {
        return entrega;
    }

}
