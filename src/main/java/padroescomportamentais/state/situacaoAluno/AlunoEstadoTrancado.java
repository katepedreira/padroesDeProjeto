package padroescomportamentais.state.situacaoAluno;

import padroescomportamentais.state.Aluno;

public class AlunoEstadoTrancado extends AlunoEstado {

    private AlunoEstadoTrancado() {};
    private static AlunoEstadoTrancado instance = new AlunoEstadoTrancado();
    public static AlunoEstadoTrancado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Trancado";
    }

    public boolean matricular(padroescomportamentais.state.Aluno aluno) {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        return true;
    }

    public boolean jubilar(padroescomportamentais.state.Aluno aluno) {
        aluno.setEstado(AlunoEstadoJubilado.getInstance());
        return true;
    }

    public boolean evadir(Aluno aluno) {
        aluno.setEstado(AlunoEstadoEvadido.getInstance());
        return true;
    }

}
