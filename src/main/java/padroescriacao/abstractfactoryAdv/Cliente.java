package padroescriacao.abstractfactoryAdv;

public class Cliente {

    private Designacao designacao;
    private Documento documento;

    public Cliente (FabricaAbstrataAdv fabrica) {
        this.designacao = fabrica.createDesignacao();
        this.documento = fabrica.createDocumento();

}

    public String definirDesignacao() {
        return this.designacao.definir();
    }

    public String definirDocumento() {
        return this.documento.definir();
    }

}
