package padroescomportamentais.observer.Loja;

import padroescomportamentais.observer.Escola.Turma;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrarAviseMe(Produto produto) {
        produto.addObserver(this);
    }

    public void update(Observable produto, Object arg1) {
        this.ultimaNotificacao = this.nome + ", produto voltou ao estoque: " + produto.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}