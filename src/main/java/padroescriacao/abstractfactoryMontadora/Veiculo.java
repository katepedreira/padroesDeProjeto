package padroescriacao.abstractfactoryMontadora;

public class Veiculo {

    private Tipo tipo;
    private QuantidadeRodas quantidadeRodas;

    public Veiculo (FabricaAbstrataVeiculo fabrica) {
        this.tipo = fabrica.createTipo();
        this.quantidadeRodas = fabrica.createQuantidadeRodas();

    }

    public String atribuirTipo() {
        return this.tipo.atribuir();
    }

    public Integer atribuirQuantidadeRodas() {
        return this.quantidadeRodas.atribuir();
    }
}
