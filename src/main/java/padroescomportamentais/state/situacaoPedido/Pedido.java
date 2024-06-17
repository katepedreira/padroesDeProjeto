package padroescomportamentais.state.situacaoPedido;

public class Pedido {
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void proximoEstado() {
        estado.proximoEstado(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }
}
