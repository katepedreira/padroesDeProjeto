package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

import java.util.ArrayList;

public abstract class Orgao {
    protected ArrayList listaSolicitacoes = new ArrayList();
    private Orgao orgaoSuperior;

    public Orgao getOrgaoSuperior() {
        return orgaoSuperior;
    }

    public void setOrgaoSuperior(Orgao orgaoSuperior) {
        this.orgaoSuperior = orgaoSuperior;
    }

    public abstract String getDescricaoSolicitacao();

    public String deferir(Solicitacao solicitacao) {
        if (listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())) {
            return getDescricaoSolicitacao();
        }
        else {
            if (orgaoSuperior != null) {
                return orgaoSuperior.deferir(solicitacao);
            }
            else
            {
                return "Deferição Automática";
            }
        }
    }
}
