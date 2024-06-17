package padroescomportamentais.mediator.Pagamento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PagamentoOnlineTest {

    @Test
    void deveConfirmarPagamento() {
        Comprador comprador = new Comprador();
        Assertions.assertEquals("Vendedor recebeu o pagamento de: R$ 1000.0", Vendedor.getInstancia().receberPagamento(1000.f));
    }

    @Test
    void deveRecusarPagamento() {
        Comprador comprador = new Comprador();
        Assertions.assertEquals("Vendedor não recebeu o pagamento de: R$ 1000.0", Vendedor.getInstancia().recusarPagamento(1000.f));
    }

}
