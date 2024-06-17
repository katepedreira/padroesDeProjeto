package padroescomportamentais.mediator.Pagamento;

public interface Credor {

    String receberPagamento(float valor);
    String recusarPagamento(float valor);
}
