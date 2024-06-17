package padroescomportamentais.mediator.Pagamento;

public class CarteiraDigital {

    private static CarteiraDigital instancia = new CarteiraDigital();

    private CarteiraDigital() {}

    public static CarteiraDigital getInstancia() {
        return instancia;
    }

    public String receberPagamentoComprador(float valor) {
        return Vendedor.getInstancia().receberPagamento(valor);
    }

    public String recusarPagamentoComprador(float valor) {
        return Vendedor.getInstancia().recusarPagamento(valor);
    }
    
}
