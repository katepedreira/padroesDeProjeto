package padroescomportamentais.state.situacaoPedido;

public class PedidoEstadoEnviado implements PedidoEstado {

    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();

    private PedidoEstadoEnviado() {}

    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Enviado";
    }

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalArgumentException("Erro");
    }
}
