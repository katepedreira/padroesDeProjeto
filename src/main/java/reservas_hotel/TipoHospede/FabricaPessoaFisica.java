package reservas_hotel.TipoHospede;

public class FabricaPessoaFisica implements FabricaAbstrataHospede {

    @Override
    public Designacao criarDesignacao() {
        return new DesignacaoPessoaFisica();

    }

    @Override
    public Documento criarDocumento() {
        return new DocumentoPessoaFisica();

    }
}
