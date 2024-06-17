package padroescomportamentais.visitor.Biblioteca;

public interface BibliotecaVisitor {

    String exibirLivro(Livro livro);
    String exibirRevista(Revista revista);
    String exibirJornal(Jornal jornal);

}
