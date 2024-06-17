package padroesestruturais.proxy.Streaming;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StreamingTest {

    @BeforeEach
    void setUp() {
        BDFilmes.addFilme(new Filme("1", "Filme1", 16));
        BDFilmes.addFilme(new Filme("2", "Filme2", 10));
    }

    @Test
    public void deveRetornarUsuarioComAcessoPermitido() {
        Usuario crianca = new Usuario("usuario456", 11);
        IStreaming streamingCrianca = new StreamingProxy(crianca);

        String output = streamingCrianca.reproduzirFilme("2");
        assertEquals("Filme 2 reproduzido com sucesso.", output);
    }

    @Test
    void deveRetonarExcecaoUsuarioComRestricaoDeIdade() {
        try {
            Usuario adolescente = new Usuario("1", 15);
            IStreaming streamingAdolescente = new StreamingProxy(adolescente);

            String output = streamingAdolescente.reproduzirFilme("1");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Acesso Negado: Este filme é restrito para maiores de 16 anos.", e.getMessage());
        }
    }

}

