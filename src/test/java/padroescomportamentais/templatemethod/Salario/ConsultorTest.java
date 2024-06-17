package padroescomportamentais.templatemethod.Salario;

import org.junit.jupiter.api.Test;
import padroescomportamentais.templatemethod.Escola.AlunoEnsinoMedio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultorTest {

    @Test
    void deveRetonarSalarioLiquido() {
        Consultor consultor = new Consultor(5000.00);
        double salarioLiquido = consultor.calcularSalarioLiquido();
        assertEquals(4500.00, salarioLiquido);
    }


    @Test
    void deveRetornarInformacoes() {
        Consultor consultor = new Consultor(5000.00);
        consultor.setNome("Marcelo");
        consultor.setNivel("Pleno");
        assertEquals("Funcionario{nome='Marcelo', nivel='Pleno'}", consultor.getInfo());
    }
}
