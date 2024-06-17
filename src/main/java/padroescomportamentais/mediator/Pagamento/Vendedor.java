package padroescomportamentais.mediator.Pagamento;

public class Vendedor implements Credor {

    private static Vendedor instancia = new Vendedor();

    private Vendedor() {}

    public static Vendedor getInstancia() {
        return instancia;
    }

    public String receberPagamento(float valor) {
        return ("Vendedor recebeu o pagamento de: R$ " + valor);
    }

    public String recusarPagamento(float valor) {
        return ("Vendedor não recebeu o pagamento de: R$ " + valor);
    }

}
