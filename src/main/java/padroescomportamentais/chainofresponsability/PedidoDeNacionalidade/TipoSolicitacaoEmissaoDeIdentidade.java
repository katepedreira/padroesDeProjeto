package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class TipoSolicitacaoEmissaoDeIdentidade implements TipoSolicitacao {

    private static TipoSolicitacaoEmissaoDeIdentidade tipoSolicitacaoEmissaoDeIdentidade = new TipoSolicitacaoEmissaoDeIdentidade();

    private TipoSolicitacaoEmissaoDeIdentidade() {};

    public static TipoSolicitacaoEmissaoDeIdentidade getTipoSolicitacaoEmissaoDeIdentidade() {
        return tipoSolicitacaoEmissaoDeIdentidade;
    }
}
