package padroescriacao.abstractfactoryMontadora;

public class FabricaMoto implements FabricaAbstrataVeiculo {
    @Override
    public Tipo createTipo() {
        return new TipoMoto();

    }

    @Override
    public QuantidadeRodas createQuantidadeRodas() {
        return new QuantidadeRodasMoto();

    }
}
