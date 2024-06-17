package padroescomportamentais.observer.Loja;

import java.util.Observable;

public class Produto extends Observable {

    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void estocar() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                ", preco = " + preco;

    }
}

