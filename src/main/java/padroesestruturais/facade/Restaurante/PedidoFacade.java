package padroesestruturais.facade.Restaurante;

public class PedidoFacade {
    public static boolean verificarPendenciasDeEnvio(Pedido pedido) {
        if (Cozinha.getInstancia().verificarPendenciasDeEnvio(pedido)) {
            return false;
        }
        if (Contabilidade.getInstancia().verificarPendenciasDeEnvio(pedido)) {
            return false;
        }
        if (Entrega.getInstancia().verificarPendenciasDeEnvio(pedido)) {
            return false;
        }
        return true;
    }
}

