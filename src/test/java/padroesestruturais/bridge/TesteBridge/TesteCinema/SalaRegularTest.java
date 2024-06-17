package padroesestruturais.bridge.TesteBridge.TesteCinema;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.Cinema.*;

import static org.junit.jupiter.api.Assertions.*;

public class SalaRegularTest {

    @Test
    void deveRetornarPrecoSalaRegularComIngressoInteira() {
        Ingresso ingresso = new IngressoInteira();
        SalaRegular salaRegular = new SalaRegular(40.0f);
        salaRegular.setIngresso(ingresso);
        assertEquals(40.0f, salaRegular.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSalaRegularComIngressoMeia() {
        Ingresso ingresso = new IngressoMeia();
        SalaRegular salaRegular = new SalaRegular(40.0f);
        salaRegular.setIngresso(ingresso);
        assertEquals(20.0f, salaRegular.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoSalaRegularComIngressoItau() {
        Ingresso ingresso = new IngressoItau();
        SalaRegular salaRegular = new SalaRegular(40.0f);
        salaRegular.setIngresso(ingresso);
        assertEquals(32.0f, salaRegular.calcularPrecoFinal(), 0.01f);
    }

}