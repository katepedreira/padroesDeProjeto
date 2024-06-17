package padroesestruturais.flyweight.Empresa;

import java.util.HashMap;
import java.util.Map;

public class ProfissaoFactory {
    private static Map<String, Profissao> profissoes = new HashMap<>();

    public static Profissao getProfissao(String nome, String area) {
        Profissao profissao = profissoes.get(nome);
        if (profissao == null) {
            profissao = new Profissao(nome, area);
            profissoes.put(nome, profissao);
        }
        return profissao;
    }

    public static int getTotalProfissoes() {
        return profissoes.size();
    }
}
