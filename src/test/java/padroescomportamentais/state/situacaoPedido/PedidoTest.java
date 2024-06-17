package padroescomportamentais.state.situacaoPedido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    private Pedido pedido;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
    }

    @Test
    void deveProcessarPedidoNovo() {
        pedido.proximoEstado();
        assertEquals("Processando", pedido.getEstado());
    }

    @Test
    void deveEnviarPedidoProcessando() {
        pedido.proximoEstado();
        pedido.proximoEstado();
        assertEquals("Enviado", pedido.getEstado());
    }

    @Test
    void deveEntregarPedidoEnviado() {
        pedido.proximoEstado();
        pedido.proximoEstado();
        pedido.proximoEstado();
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    void deveCancelarPedidoNovo() {
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstado());
    }

    @Test
    void deveCancelarPedidoProcessando() {
        pedido.proximoEstado();
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstado());
    }

    @Test
    void naoDeveCancelarPedidoEnviado() {
        pedido.proximoEstado();
        pedido.proximoEstado();
        try {
            pedido.cancelar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveCancelarPedidoEntregue() {
        pedido.proximoEstado();
        pedido.proximoEstado();
        pedido.proximoEstado();
        try {
            pedido.cancelar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveMudarEstadoPedidoCancelado() {
        pedido.cancelar();
        try {
            pedido.proximoEstado();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveProcessarPedidoEntregue() {
        pedido.proximoEstado();
        pedido.proximoEstado();
        pedido.proximoEstado();
        try {
            pedido.proximoEstado();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }
}
