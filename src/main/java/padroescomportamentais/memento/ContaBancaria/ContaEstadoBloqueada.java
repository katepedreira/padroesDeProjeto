package padroescomportamentais.memento.ContaBancaria;

public class ContaEstadoBloqueada implements ContaEstado {
    private static ContaEstadoBloqueada instance = new ContaEstadoBloqueada();

    private ContaEstadoBloqueada() {}

    public static ContaEstadoBloqueada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Bloqueada";
    }
}
