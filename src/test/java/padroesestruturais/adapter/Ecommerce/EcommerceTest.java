package padroesestruturais.adapter.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EcommerceTest {

        @Test
        void deveRetornarTamanhoChinaCalçado() {
            Calçado calçado = new Calçado();
            calçado.setTamanho("CH38");

            assertEquals("CH38", calçado.getTamanho());
        }

        @Test
        void deveRetornarTamanhoBrasilCalçado() {
            Calçado calçado = new Calçado();
            calçado.setTamanho("CH40");

            assertEquals("BR38", calçado.getTamanhoBrasil());
        }

    @Test
    void deveRetornarExcecaoParaTamanhoInexistenteChina() {
        try {
            Calçado calçado = new Calçado();
            calçado.setTamanho("CH50");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Tamanho inexistente", e.getMessage());
        }
    }

}

