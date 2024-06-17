package padroesestruturais.flyweight.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Candidato> candidatos = new ArrayList<>();


    public void contratar(String nomeCandidato, String nomeProfissao, String area) {
        Profissao profissao = ProfissaoFactory.getProfissao(nomeProfissao, area);
        Candidato candidato = new Candidato(nomeCandidato, profissao);
        candidatos.add(candidato);
    }

    public List<String> obterCandidatos() {
        List<String> saida = new ArrayList<String>();
        for (Candidato candidato : this.candidatos) {
            saida.add(candidato.obterCandidato());
        }
        return saida;
    }
}

