package padroescomportamentais.mediator.Pagamento;

public abstract class Pessoa {

    public String receberPagamentoComprador(float valor) {
        return CarteiraDigital.getInstancia().receberPagamentoComprador(valor);
    }

    public String recusarPagamentoComprador(float valor) {
        return CarteiraDigital.getInstancia().recusarPagamentoComprador(valor);
    }

}


