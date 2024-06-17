package padroesestruturais.bridge.TesteBridge.TesteCinema;
import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.Cinema.*;

import static org.junit.jupiter.api.Assertions.*;

public class SalaVipTest {

        @Test
        void deveRetornarPrecoSalaVipComIngressoInteira() {
            Ingresso ingresso = new IngressoInteira();
            SalaVIP salaVip = new SalaVIP(100.0f);
            salaVip.setIngresso(ingresso);
            assertEquals(100.0f, salaVip.calcularPrecoFinal(), 0.01f);
        }

        @Test
        void deveRetornarPrecoSalaVipComIngressoMeia() {
            Ingresso ingresso = new IngressoMeia();
            SalaVIP salaVip = new SalaVIP(100.0f);
            salaVip.setIngresso(ingresso);
            assertEquals(50.0f, salaVip.calcularPrecoFinal(), 0.01f);
        }

        @Test
        void deveRetornarPrecoSalaVipComIngressoItau() {
            Ingresso ingresso = new IngressoItau();
            SalaVIP salaVip = new SalaVIP(100.0f);
            salaVip.setIngresso(ingresso);
            assertEquals(80.0f, salaVip.calcularPrecoFinal(), 0.01f);
        }

}

