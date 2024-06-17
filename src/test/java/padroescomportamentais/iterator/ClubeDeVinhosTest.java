package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import padroescomportamentais.iterator.ClubeDeVinhos.Assinante;
import padroescomportamentais.iterator.ClubeDeVinhos.Clube;
import padroescomportamentais.iterator.ClubeDeVinhos.Estatisticas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClubeDeVinhosTest {

    @Test
    void deveContarAssinantesAtivosClube() {
        Clube clube = new Clube(
                new Assinante("Marco", true),
                new Assinante("Antonio", true),
                new Assinante("Jose", false),
                new Assinante("Maria", true)
        );
        assertEquals(3, Estatisticas.contarAssinantesAtivos(clube));
    }

    @Test
    void deveContarTotalAssinantesClube() {
        Clube clube = new Clube(
                new Assinante("Marco", true),
                new Assinante("Antonio", true),
                new Assinante("Jose", false),
                new Assinante("Maria", true)
        );
        assertEquals(4, Estatisticas.contarTotalAssinantes(clube));
    }
}
