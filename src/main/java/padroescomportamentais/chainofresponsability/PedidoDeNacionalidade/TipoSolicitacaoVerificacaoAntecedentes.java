package padroescomportamentais.chainofresponsability.PedidoDeNacionalidade;

public class TipoSolicitacaoVerificacaoAntecedentes implements TipoSolicitacao {

    private static TipoSolicitacaoVerificacaoAntecedentes tipoSolicitacaoVerificacaoAntecedentes = new TipoSolicitacaoVerificacaoAntecedentes();

    private TipoSolicitacaoVerificacaoAntecedentes() {};

    public static TipoSolicitacaoVerificacaoAntecedentes getTipoSolicitacaoVerificacaoAntecedentes() {
        return tipoSolicitacaoVerificacaoAntecedentes;
    }

}
