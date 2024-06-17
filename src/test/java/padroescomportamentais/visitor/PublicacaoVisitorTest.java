package padroescomportamentais.visitor.Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacaoVisitorTest {

    private PublicacaoVisitor visitor;
    private Livro livro;
    private Revista revista;
    private Jornal jornal;

    @BeforeEach
    public void setUp() {
        visitor = new PublicacaoVisitor();
        livro = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 480);
        revista = new Revista("Super Interessante", 150);
        jornal = new Jornal("Tribuna de Minas", "2024-06-14");
    }

    @Test
    public void deveExibirLivro() {
        String expectedOutput = "Livro:\nTítulo: Memórias Póstumas de Brás Cubas\nAutor: Machado de Assis\nPáginas: 480\n";
        assertEquals(expectedOutput, visitor.exibir(livro));
    }

    @Test
    public void deveExibirRevista() {
        String expectedOutput = "Revista:\nTítulo: Super Interessante\nEdição: 150\n";
        assertEquals(expectedOutput, visitor.exibir(revista));
    }

    @Test
    public void deveExibirJornal() {
        String expectedOutput = "Jornal:\nTítulo: Tribuna de Minas\nData: 2024-06-14\n";
        assertEquals(expectedOutput, visitor.exibir(jornal));
    }
}
