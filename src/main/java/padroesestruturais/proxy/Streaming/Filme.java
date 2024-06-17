package padroesestruturais.proxy.Streaming;

public class Filme {
    private String idFilme;
    private String titulo;
    private int classificacaoEtaria;

    public Filme(String idFilme, String titulo, int classificacaoEtaria) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getIdFilme() {
        return idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }
}


