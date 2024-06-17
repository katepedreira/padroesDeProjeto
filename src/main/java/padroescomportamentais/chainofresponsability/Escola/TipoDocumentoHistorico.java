package padroescomportamentais.chainofresponsability.Escola;

public class TipoDocumentoHistorico implements TipoDocumento {

    private static TipoDocumentoHistorico tipoDocumentoHistorico = new TipoDocumentoHistorico();

    private TipoDocumentoHistorico() {};
    
    public static TipoDocumentoHistorico getTipoDocumentoHistorico() {
        return tipoDocumentoHistorico;
    }

}
