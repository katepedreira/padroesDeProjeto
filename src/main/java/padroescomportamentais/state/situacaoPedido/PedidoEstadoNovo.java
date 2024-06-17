package padroescomportamentais.state.situacaoPedido;

public class PedidoEstadoNovo implements PedidoEstado {

    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();

    private PedidoEstadoNovo() {}

    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Novo";
    }

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoProcessando.getInstance());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
    }
}
