package padroescomportamentais.state.situacaoAluno;

public class AlunoEstadoJubilado extends AlunoEstado {

    private AlunoEstadoJubilado() {};
    private static AlunoEstadoJubilado instance = new AlunoEstadoJubilado();
    public static AlunoEstadoJubilado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Jubilado";
    }


}
