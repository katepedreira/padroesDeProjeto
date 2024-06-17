package padroesestruturais.facade.Restaurante;

public class Contabilidade extends Setor {

    private static Contabilidade contabilidade = new Contabilidade();

    private Contabilidade() {};

    public static Contabilidade getInstancia() {
        return contabilidade;
    }

}
