package padroesestruturais.proxy.Streaming;

public class StreamingProxy implements IStreaming {
    private Streaming streaming;
    private Usuario usuario;

    public StreamingProxy(Usuario usuario) {
        this.streaming = new Streaming();
        this.usuario = usuario;
    }

    @Override
    public String reproduzirFilme(String filmeId) {
        Filme filme = BDFilmes.getFilme(filmeId);
        if (filme.getClassificacaoEtaria() > usuario.getIdade()) {
            throw new IllegalArgumentException("Acesso Negado: Este filme é restrito para maiores de " + filme.getClassificacaoEtaria() + " anos.");
        } else {
            return streaming.reproduzirFilme(filmeId);
        }
    }
}


