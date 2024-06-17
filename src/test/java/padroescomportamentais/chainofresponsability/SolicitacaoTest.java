package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.chainofresponsability.PedidoDeNacionalidade.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitacaoTest {

    OrgaoMinisterioDaJustica ministerioDaJustica;
    OrgaoPoliciaCivil policiaCivil;
    OrgaoCartorio cartorio;

    @BeforeEach
    void setUp() {
        ministerioDaJustica = new OrgaoMinisterioDaJustica(null);
        policiaCivil = new OrgaoPoliciaCivil(ministerioDaJustica);
        cartorio = new OrgaoCartorio(policiaCivil);
    }

    @Test
    void deveRetornarCartorioParaAnaliseDeDocumentos() {
        assertEquals("Cartório", cartorio.deferir(new Solicitacao(TipoSolicitacaoAnaliseDeDocumentos.getTipoSolicitacaoAnaliseDeDocumentos())));
    }

    @Test
    void deveRetornarPoliciaCivilParaVerificacaoAntecedentes() {
        assertEquals("Polícia Civil", policiaCivil.deferir(new Solicitacao(TipoSolicitacaoVerificacaoAntecedentes.getTipoSolicitacaoVerificacaoAntecedentes())));
    }

    @Test
    void deveRetornarMinisterioDaJusticaParaAprovacao() {
        assertEquals("Ministério da Justiça", ministerioDaJustica.deferir(new Solicitacao(TipoSolicitacaoAprovacao.getTipoSolicitacaoAprovacao())));
    }

    @Test
    void deveRetornarDefericaoAutomaticaParaEmissaoDeIdentidade() {
        assertEquals("Deferição Automática", cartorio.deferir(new Solicitacao(TipoSolicitacaoEmissaoDeIdentidade.getTipoSolicitacaoEmissaoDeIdentidade())));
    }
}
