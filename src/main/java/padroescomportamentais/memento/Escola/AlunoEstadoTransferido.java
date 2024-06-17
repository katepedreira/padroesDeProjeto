package padroescomportamentais.memento.Escola;

public class AlunoEstadoTransferido implements AlunoEstado {

    private AlunoEstadoTransferido() {};
    private static AlunoEstadoTransferido instance = new AlunoEstadoTransferido();
    public static AlunoEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}
