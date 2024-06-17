package padroescomportamentais.state.situacaoPedido;

public class PedidoEstadoCancelado implements PedidoEstado {

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    private PedidoEstadoCancelado() {}

    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
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
