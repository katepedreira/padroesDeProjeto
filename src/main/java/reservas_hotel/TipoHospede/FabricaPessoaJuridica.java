package reservas_hotel.TipoHospede;

public class FabricaPessoaJuridica implements FabricaAbstrataHospede {

    @Override
    public Designacao criarDesignacao() {
        return new DesignacaoPessoaJuridica();

    }

    @Override
    public Documento criarDocumento() {
        return new DocumentoPessoaJuridica();

    }

}
