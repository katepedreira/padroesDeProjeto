package padroesestruturais.facade.Restaurante;

import padroesestruturais.facade.Escola.Aluno;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Pedido> pedidosComPendencia = new ArrayList<Pedido>();

    public void addPedidoPendente(Pedido pedido) {
        this.pedidosComPendencia.add(pedido);
    }

    public boolean verificarPendenciasDeEnvio(Pedido pedido) {
        return this.pedidosComPendencia.contains(pedido);
    }
}
