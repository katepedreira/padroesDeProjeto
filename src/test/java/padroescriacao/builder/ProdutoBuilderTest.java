package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBuilderTest {

    @Test
    void deveRetornarExcecaoParaProdutoSemNome() {
        try {
            Produto produto = new ProdutoBuilder()
                    .setModelo("Smart TV")
                    .setCor("Preto")
                    .setPreco(2399.90)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoSemPreco() {
        try {
            Produto produto = new ProdutoBuilder()
                    .setNome("Geladeira")
                    .setModelo("French")
                    .setCor("Cinza")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoValido() {
        Produto produto = new ProdutoBuilder()
                .setNome("Celular")
                .setModelo("Iphone 15")
                .setCor("Titânio Branco")
                .setPreco(8499.0)
                .build();

        assertNotNull(produto);
    }
}
