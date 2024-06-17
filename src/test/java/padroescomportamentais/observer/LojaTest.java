package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import padroescomportamentais.observer.Loja.Produto;
import padroescomportamentais.observer.Loja.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {


    @Test
    void deveNotificarUmUsuario() {
        Produto produto = new Produto("PlayStation 5", 5000.0f);
        Usuario usuario = new Usuario("Maria");
        usuario.cadastrarAviseMe(produto);
        produto.estocar();
        assertEquals("Maria, produto voltou ao estoque: nome = PlayStation 5, preco = 5000.0", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Produto produto = new Produto("PlayStation 5", 5000.0f);
        Usuario usuario1 = new Usuario("Carla");
        Usuario usuario2 = new Usuario("Lucas");
        usuario1.cadastrarAviseMe(produto);
        usuario2.cadastrarAviseMe(produto);
        produto.estocar();
        assertEquals("Carla, produto voltou ao estoque: nome = PlayStation 5, preco = 5000.0", usuario1.getUltimaNotificacao());
        assertEquals("Lucas, produto voltou ao estoque: nome = PlayStation 5, preco = 5000.0", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Produto produto = new Produto("PlayStation 5", 5000.0f);
        Usuario usuario = new Usuario("Mateus");
        produto.estocar();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

}