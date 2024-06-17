package padroescomportamentais.memento.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private ContaEstado estado;
    private final List<ContaEstado> memento = new ArrayList<ContaEstado>();


    public ContaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ContaEstado> getEstados() {
        return this.memento;
    }
}
