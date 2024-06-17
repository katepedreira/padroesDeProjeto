package padroesestruturais.composite.Videogame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveRetornarEstruturaJogo() {
        Fase fase1 = new Fase("Início da Aventura");

        Fase fase2 = new Fase("Floresta Sombria");
        Desafio desafio21 = new Desafio("Encontrar a Espada Perdida", "Baixa");
        fase2.addComponente(desafio21);

        Fase fase3 = new Fase("Montanhas Congeladas");
        Desafio desafio31 = new Desafio("Sobreviver ao Frio Extremo", "Média");
        Desafio desafio32 = new Desafio("Derrotar o Guardião das Neves", "Alta");
        fase3.addComponente(desafio31);
        fase3.addComponente(desafio32);

        Jogo jogo = new Jogo();
        jogo.setEnredo(fase1);
        fase1.addComponente(fase2);
        fase1.addComponente(fase3);

        String saidaEsperada = "Fase: Início da Aventura\n" +
                "Fase: Floresta Sombria\n" +
                "Desafio: Encontrar a Espada Perdida - Dificuldade: Baixa\n" +
                "Fase: Montanhas Congeladas\n" +
                "Desafio: Sobreviver ao Frio Extremo - Dificuldade: Média\n" +
                "Desafio: Derrotar o Guardião das Neves - Dificuldade: Alta\n";

        assertEquals(saidaEsperada, jogo.getComponente());
    }


    @Test
    void deveRetornarExcecaoParaJogoSemEnredo() {
        try {
            Jogo jogo = new Jogo();
            jogo.getComponente();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Jogo sem enredo", e.getMessage());
        }
    }
}
