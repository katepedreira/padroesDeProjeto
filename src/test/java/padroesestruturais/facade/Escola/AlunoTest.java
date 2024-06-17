package padroesestruturais.facade.Escola;

import org.junit.jupiter.api.Test;
import padroesestruturais.facade.Escola.Aluno;
import padroesestruturais.facade.Escola.Biblioteca;
import padroesestruturais.facade.Escola.Financeiro;
import padroesestruturais.facade.Escola.Secretaria;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarPendenciaBibliotecaFormatura() {
        Aluno aluno = new Aluno();
        Biblioteca.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarPendenciaSecretariaFormatura() {
        Aluno aluno = new Aluno();
        Secretaria.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroFormatura() {
        Aluno aluno = new Aluno();
        Financeiro.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarAlunoSemPendenciaFormatura() {
        Aluno aluno = new Aluno();

        assertEquals(true, aluno.formar());
    }

}