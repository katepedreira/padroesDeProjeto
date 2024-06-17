package padroescomportamentais.visitor.Biblioteca;

public class PublicacaoVisitor implements BibliotecaVisitor {

    public String exibir(Publicacao publicacao) {
        return publicacao.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro:\nTítulo: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() +
                "\nPáginas: " + livro.getPaginas() + "\n";
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista:\nTítulo: " + revista.getTitulo() + "\nEdição: " + revista.getEdicao() + "\n";
    }

    @Override
    public String exibirJornal(Jornal jornal) {
        return "Jornal:\nTítulo: " + jornal.getTitulo() + "\nData: " + jornal.getData() + "\n";
    }
}

