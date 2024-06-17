package padroesestruturais.bridge.TesteBridge.TesteCinema;
import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.Cinema.*;

import static org.junit.jupiter.api.Assertions.*;

public class SalaIMAXTest {

    @Test
    void deveRetornarPrecoSalaIMAXComIngressoInteira() {
        Ingresso ingresso = new IngressoInteira();
        SalaIMAX salaIMAX = new SalaIMAX(60.0f);
        salaIMAX.setIngresso(ingresso);
        assertEquals(60.0f, salaIMAX.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSalaIMAXComIngressoMeia() {
        Ingresso ingresso = new IngressoMeia();
        SalaIMAX salaIMAX = new SalaIMAX(60.0f);
        salaIMAX.setIngresso(ingresso);
        assertEquals(30.0f, salaIMAX.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSalaIMAXComIngressoItau() {
        Ingresso ingresso = new IngressoItau();
        SalaIMAX salaIMAX = new SalaIMAX(60.0f);
        salaIMAX.setIngresso(ingresso);
        assertEquals(48.0f, salaIMAX.calcularPrecoFinal(), 0.01f);
    }
}
