package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class OrgaoMinisterioDaJustica extends Orgao {

    public OrgaoMinisterioDaJustica(Orgao superior) {
        listaSolicitacoes.add(TipoSolicitacaoAprovacao.getTipoSolicitacaoAprovacao());
        setOrgaoSuperior(superior);
    }

    public String getDescricaoSolicitacao() {
        return "Ministério da Justiça";
    }
}
