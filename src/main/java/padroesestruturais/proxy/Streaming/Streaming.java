package padroesestruturais.proxy.Streaming;

public class Streaming implements IStreaming {

    @Override
    public String reproduzirFilme(String filmeId) {
        return "Filme " + filmeId + " reproduzido com sucesso.";
    }
}

