package padroescriacao.abstractfactoryAdv;

public class FabricaPF implements FabricaAbstrataAdv {

    @Override
    public Designacao createDesignacao() {
        return new DesignacaoPF();

    }

    @Override
    public Documento createDocumento() {
        return new DocumentoPF();

    }
}


