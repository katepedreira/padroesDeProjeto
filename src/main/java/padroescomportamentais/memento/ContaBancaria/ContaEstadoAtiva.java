package padroescomportamentais.memento.ContaBancaria;

public class ContaEstadoAtiva implements ContaEstado {
    private static ContaEstadoAtiva instance = new ContaEstadoAtiva();

    private ContaEstadoAtiva() {}

    public static ContaEstadoAtiva getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativa";
    }
}
