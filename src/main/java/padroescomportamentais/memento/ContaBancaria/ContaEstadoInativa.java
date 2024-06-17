package padroescomportamentais.memento.ContaBancaria;

public class ContaEstadoInativa implements ContaEstado {
    private static ContaEstadoInativa instance = new ContaEstadoInativa();

    private ContaEstadoInativa() {}

    public static ContaEstadoInativa getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Inativa";
    }
}
