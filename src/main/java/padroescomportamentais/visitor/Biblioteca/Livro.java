package padroescomportamentais.visitor.Biblioteca;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String aceitar(BibliotecaVisitor bibliotecaVisitor) {
        return bibliotecaVisitor.exibirLivro(this);
    }
}
