package padroescriacao.abstractfactoryMontadora;

public class FabricaCarro implements FabricaAbstrataVeiculo {
    @Override
    public Tipo createTipo() {
        return new TipoCarro();

    }

    @Override
    public QuantidadeRodas createQuantidadeRodas() {
        return new QuantidadeRodasCarro();

    }
}
