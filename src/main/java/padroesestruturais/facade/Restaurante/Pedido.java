package padroesestruturais.facade.Restaurante;

public class Pedido {

    public boolean enviar() {
        return PedidoFacade.verificarPendenciasDeEnvio(this);
    }
}
