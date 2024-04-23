package padroescriacao.singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracoesTest {

    @Test
    public void deveRetornarIdioma() {
        Configuracoes.getInstance().setIdioma("PT-BR");
        assertEquals("PT-BR", Configuracoes.getInstance().getIdioma());
    }

    @Test
    public void deveRetornarNivel() {
        Configuracoes.getInstance().setNivel("Dificil");
        assertEquals("Dificil", Configuracoes.getInstance().getNivel());
    }

}
