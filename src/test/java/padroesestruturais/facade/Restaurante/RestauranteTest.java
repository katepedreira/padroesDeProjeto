package padroesestruturais.facade.Restaurante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestauranteTest {

    @Test
    void deveRetornarPendenciaCozinhaEnvio() {
        Pedido pedido = new Pedido();
        Cozinha.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.enviar());
    }

    @Test
    void deveRetornarPendenciaContabilidadeEnvio() {
        Pedido pedido = new Pedido();
        Contabilidade.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.enviar());
    }

    @Test
    void deveRetornarPendenciaEntregaEnvio() {
        Pedido pedido = new Pedido();
        Entrega.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.enviar());
    }

    @Test
    void deveRetornarPedidoSemPendenciaEnvio() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.enviar());
    }

}

