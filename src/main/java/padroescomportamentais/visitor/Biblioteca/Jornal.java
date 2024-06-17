package padroescomportamentais.visitor.Biblioteca;

public class Jornal implements Publicacao {

    private String titulo;
    private String data;

    public Jornal(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String aceitar(BibliotecaVisitor bibliotecaVisitor) {
        return bibliotecaVisitor.exibirJornal(this);
    }
}
