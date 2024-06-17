package padroescomportamentais.state.situacaoPedido;

public interface PedidoEstado {
    String getEstado();
    void proximoEstado(Pedido pedido);
    void cancelar(Pedido pedido);
}
