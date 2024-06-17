package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;
import padroescomportamentais.interpreter.CalculadoraDeJuros.Emprestimo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeJurosTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setPrincipal(1000.0f);
        emprestimo.setTaxa(0.1f);
        emprestimo.setTempo(12);

        assertEquals(1200.0, emprestimo.calcularJurosSimples());
    }
}
