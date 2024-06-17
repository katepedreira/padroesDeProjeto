package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class OrgaoCartorio extends Orgao {

    public OrgaoCartorio(Orgao superior) {
        listaSolicitacoes.add(TipoSolicitacaoAnaliseDeDocumentos.getTipoSolicitacaoAnaliseDeDocumentos());
        setOrgaoSuperior(superior);
    }

    public String getDescricaoSolicitacao() {
        return "Cartório";
    }
}
