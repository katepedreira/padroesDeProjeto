package padroescomportamentais.state.situacaoAluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveFormarAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.formar();
        assertEquals("Formado", aluno.getEstado());

    }

    @Test
    void deveEvadirAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.evadir();
        assertEquals("Evadido", aluno.getEstado());

    }

    @Test
    void deveTrancarAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.trancar();
        assertEquals("Trancado", aluno.getEstado());

    }

    @Test
    void deveTransferirAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.transferir();
        assertEquals("Transferido", aluno.getEstado());

    }

    @Test
    void deveJubilarAlunoMatriculado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Matriculado");
        aluno.jubilar();
        assertEquals("Jubilado", aluno.getEstado());

    }

    @Test
    void deveTransferirAlunoTrancado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.transferir();
        assertEquals("Transferido", aluno.getEstado());

    }

    @Test
    void deveEvadirAlunoTrancado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.evadir();
        assertEquals("Evadido", aluno.getEstado());

    }

    @Test
    void deveJubilarAlunoTrancado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.jubilar();
        assertEquals("Jubilado", aluno.getEstado());

    }

    @Test
    void deveMatricularAlunoTrancado() {

        Aluno aluno = new Aluno();
        aluno.setEstado("Trancado");
        aluno.matricular();
        assertEquals("Matriculado", aluno.getEstado());

    }

    @Test
    void naoDeveFormarAlunoTrancado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Trancado");
            aluno.formar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveFormarAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.formar();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveFormarAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.formar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveFormarAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.formar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTransferirAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.transferir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveTransferirAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.transferir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTransferirAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.transferir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveJubilarAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.jubilar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveJubilarAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.jubilar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveJubilarAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.jubilar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveEvadirAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.evadir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveEvadirAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.evadir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveEvadirAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.evadir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveMatricularAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.matricular();
            fail();
        }
        catch (IllegalArgumentException e) {
              assertEquals("Erro", e.getMessage());
            }

    }

    @Test
    void naoDeveMatricularAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.matricular();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveMatricularAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.matricular();
            fail();
        }
       catch (IllegalArgumentException e) {
           assertEquals("Erro", e.getMessage());
       }

    }

    @Test
    void naoDeveMatricularAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.matricular();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTrancarAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.trancar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTrancarAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.trancar();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTrancarAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.trancar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTrancarAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.trancar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveTrancarAlunoTrancado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Trancado");
            aluno.trancar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveMatricularAlunoMatriculado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Matriculado");
            aluno.matricular();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveFormarAlunoFormado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Formado");
            aluno.formar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveJubilarAlunoJubilado() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Jubilado");
            aluno.jubilar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }

    @Test
    void naoDeveEvadirAlunoEvadido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Evadido");
            aluno.evadir();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

    @Test
    void naoDeveTransferirAlunoTransferido() {
        try {
            Aluno aluno = new Aluno();
            aluno.setEstado("Transferido");
            aluno.transferir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }

    }






}