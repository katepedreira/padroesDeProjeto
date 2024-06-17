package padroescomportamentais.state.situacaoPedido;

public class PedidoEstadoProcessando implements PedidoEstado {

    private static PedidoEstadoProcessando instance = new PedidoEstadoProcessando();

    private PedidoEstadoProcessando() {}

    public static PedidoEstadoProcessando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Processando";
    }

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
    }
}
