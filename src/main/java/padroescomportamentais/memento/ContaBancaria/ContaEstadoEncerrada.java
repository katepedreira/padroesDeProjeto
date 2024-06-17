package padroescomportamentais.memento.ContaBancaria;

public class ContaEstadoEncerrada implements ContaEstado {
    private static ContaEstadoEncerrada instance = new ContaEstadoEncerrada();

    private ContaEstadoEncerrada() {}

    public static ContaEstadoEncerrada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Encerrada";
    }
}
