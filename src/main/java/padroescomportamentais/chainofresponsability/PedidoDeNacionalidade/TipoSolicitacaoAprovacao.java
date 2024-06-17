package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class TipoSolicitacaoAprovacao implements TipoSolicitacao {

    private static TipoSolicitacaoAprovacao tipoSolicitacaoAprovacao = new TipoSolicitacaoAprovacao();

    private TipoSolicitacaoAprovacao() {};

    public static TipoSolicitacaoAprovacao getTipoSolicitacaoAprovacao() {
        return tipoSolicitacaoAprovacao;
    }
}
