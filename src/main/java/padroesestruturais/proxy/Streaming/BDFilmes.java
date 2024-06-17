package padroesestruturais.proxy.Streaming;

import java.util.HashMap;
import java.util.Map;

public class BDFilmes {
    private static Map<String, Filme> filmes = new HashMap<>();

    public static Filme getFilme(String idFilme) {
        return filmes.get(idFilme);
    }

    public static void addFilme(Filme filme) {
        filmes.put(filme.getIdFilme(), filme);
    }
}

