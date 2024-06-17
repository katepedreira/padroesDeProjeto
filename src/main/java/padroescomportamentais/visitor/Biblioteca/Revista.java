package padroescomportamentais.visitor.Biblioteca;

public class Revista implements Publicacao {

    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public String aceitar(BibliotecaVisitor bibliotecaVisitor) {
        return bibliotecaVisitor.exibirRevista(this);
    }
}
