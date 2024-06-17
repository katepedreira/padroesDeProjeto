package padroescomportamentais.memento.Escola;

public class AlunoEstadoFormado implements AlunoEstado {

    private AlunoEstadoFormado() {};
    private static AlunoEstadoFormado instance = new AlunoEstadoFormado();
    public static AlunoEstadoFormado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Formado";
    }

}
