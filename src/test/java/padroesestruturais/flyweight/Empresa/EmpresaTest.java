package padroesestruturais.flyweight.Empresa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaTest {

    @Test
    void deveRetornarCandidatos() {
        Empresa empresa = new Empresa();
        empresa.contratar("Jose", "Analista de Sistemas", "TI");
        empresa.contratar("Camila", "Analista de Sistemas", "TI");
        empresa.contratar("Maria", "Engenheira de Dados", "TI");
        empresa.contratar("Ana", "Gerente", "Administrativo");
        empresa.contratar("Joao", "Estagiário", "TI");

        List<String> saida = Arrays.asList(
                "Candidato{nome='Jose', profissao='Analista de Sistemas', area='TI'}",
                "Candidato{nome='Camila', profissao='Analista de Sistemas', area='TI'}",
                "Candidato{nome='Maria', profissao='Engenheira de Dados', area='TI'}",
                "Candidato{nome='Ana', profissao='Gerente', area='Administrativo'}",
                "Candidato{nome='Joao', profissao='Estagiário', area='TI'}");

        assertEquals(saida, empresa.obterCandidatos());
    }

    @Test
    void deveRetornarTotalProfissoes() {
        Empresa empresa = new Empresa();
        empresa.contratar("Jose", "Analista de Sistemas", "TI");
        empresa.contratar("Camila", "Analista de Sistemas", "TI");
        empresa.contratar("Maria", "Engenheira de Dados", "TI");
        empresa.contratar("Ana", "Gerente", "Administrativo");
        empresa.contratar("Joao", "Estagiário", "TI");

        assertEquals(4, ProfissaoFactory.getTotalProfissoes());
    }

}