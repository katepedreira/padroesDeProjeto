package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class TipoSolicitacaoAnaliseDeDocumentos implements TipoSolicitacao {

    private static TipoSolicitacaoAnaliseDeDocumentos tipoSolicitacaoAnaliseDeDocumentos = new TipoSolicitacaoAnaliseDeDocumentos();

    private TipoSolicitacaoAnaliseDeDocumentos() {};

    public static TipoSolicitacaoAnaliseDeDocumentos getTipoSolicitacaoAnaliseDeDocumentos() {
        return tipoSolicitacaoAnaliseDeDocumentos;
    }

}
