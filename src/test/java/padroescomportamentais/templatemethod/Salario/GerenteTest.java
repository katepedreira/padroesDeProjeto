package padroescomportamentais.templatemethod.Salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenteTest {

    @Test
    public void testCalcularSalarioLiquido() {
        Gerente gerente = new Gerente(8000.00);
        double salarioLiquido = gerente.calcularSalarioLiquido();
        assertEquals(8280.00, salarioLiquido);
    }

    @Test
    void deveRetornarInformacoes() {
        Gerente gerente = new Gerente(8000.00);
        gerente.setNome("Ana");
        gerente.setNivel("Senior");
        assertEquals("Funcionario{nome='Ana', nivel='Senior'}", gerente.getInfo());
    }
}


