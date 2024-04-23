package padroescriacao.abstractfactoryAdv;

public class FabricaPJ implements FabricaAbstrataAdv {

    @Override
    public Designacao createDesignacao() {
        return new DesignacaoPJ();

    }

    @Override
    public Documento createDocumento() {
        return new DocumentoPJ();

    }
}
