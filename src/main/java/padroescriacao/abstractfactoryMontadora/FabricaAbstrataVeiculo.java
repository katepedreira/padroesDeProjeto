package padroescriacao.abstractfactoryMontadora;

public interface FabricaAbstrataVeiculo {
    Tipo createTipo();
    QuantidadeRodas createQuantidadeRodas();
}
