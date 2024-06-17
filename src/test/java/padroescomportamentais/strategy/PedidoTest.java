package padroescomportamentais.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import padroescomportamentais.strategy.CalculoFrete.*;

public class PedidoTest {
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        pedido = new Pedido(3.0);
    }

    @Test
    void deveCalcularFreteCorreioNormal() {
        pedido.setMetodoFrete(new FreteCorreiosPadrao());
        assertEquals(15, pedido.calcularFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        pedido.setMetodoFrete(new FreteCorreiosExpresso());
        assertEquals(30.0, pedido.calcularFrete());
    }

    @Test
    void deveCalcularFreteJadLog() {
        pedido.setMetodoFrete(new FreteJadLog());
        assertEquals(18.0, pedido.calcularFrete());
    }

    @Test
    void deveCalcularFreteLoggi() {
        pedido.setMetodoFrete(new FreteLoggi());
        assertEquals(21.0, pedido.calcularFrete());
    }

    @Test
    void deveLancarExcecaoQuandoMetodoFreteNaoDefinido() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            pedido.calcularFrete();
        });
        assertEquals("Método de frete não definido", exception.getMessage());
    }
}
