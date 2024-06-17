package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import padroescomportamentais.memento.ContaBancaria.*;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveArmazenarEstados() {
        Conta conta = new Conta();
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertEquals(2, conta.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Conta conta = new Conta();
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        conta.restauraEstado(0);
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Conta conta = new Conta();
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        conta.setEstado(ContaEstadoAtiva.getInstance());
        conta.setEstado(ContaEstadoInativa.getInstance());
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        conta.restauraEstado(2);
        assertEquals(ContaEstadoInativa.getInstance(), conta.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Conta conta = new Conta();
            conta.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
