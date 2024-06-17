package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class OrgaoPoliciaCivil extends Orgao {

    public OrgaoPoliciaCivil(Orgao superior) {
        listaSolicitacoes.add(TipoSolicitacaoVerificacaoAntecedentes.getTipoSolicitacaoVerificacaoAntecedentes());
        setOrgaoSuperior(superior);
    }

    public String getDescricaoSolicitacao() {
        return "Polícia Civil";
    }

}
