package reservas_hotel.TipoHospede;

public class Hospede {
    private Designacao designacao;
    private Documento documento;

    public Hospede (FabricaAbstrataHospede fabrica) {
        this.designacao = fabrica.criarDesignacao();
        this.documento = fabrica.criarDocumento();

    }

    public String atribuirDesignacao() {
        return this.designacao.atribuir();
    }

    public String atribuirDocumento() {
        return this.documento.atribuir();
    }
}
