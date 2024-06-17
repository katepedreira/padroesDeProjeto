package padroesestruturais.facade.Escola;

public class Aluno {

    public boolean formar() {
        return AlunoFacade.verificarPendenciasFormatura(this);
    }
}
