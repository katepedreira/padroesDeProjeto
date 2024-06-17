package padroescomportamentais.state.situacaoPedido;

public class PedidoEstadoEntregue implements PedidoEstado {

    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();

    private PedidoEstadoEntregue() {}

    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }

    @Override
    public void proximoEstado(Pedido pedido) {
        throw new IllegalArgumentException("Erro");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalArgumentException("Erro");
    }
}
