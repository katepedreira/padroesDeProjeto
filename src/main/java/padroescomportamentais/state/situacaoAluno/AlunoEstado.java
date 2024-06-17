package padroescomportamentais.state.situacaoAluno;

import padroescomportamentais.state.Aluno;

public abstract class AlunoEstado {
    
    public abstract String getEstado();

    public boolean matricular(padroescomportamentais.state.Aluno aluno) {
        return false;
    }

    public boolean formar(padroescomportamentais.state.Aluno aluno) {
        return false;
    }

    public boolean trancar(padroescomportamentais.state.Aluno aluno) {
        return false;
    }

    public boolean jubilar(padroescomportamentais.state.Aluno aluno) {
        return false;
    }

    public boolean evadir(padroescomportamentais.state.Aluno aluno) {
        return false;
    }

    public boolean transferir(Aluno aluno) {
        return false;
    }
    
}
