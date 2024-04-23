package padroescriacao.abstractfactory;
import org.junit.jupiter.api.Test;
import padroescriacao.abstractfactoryMontadora.FabricaAbstrataVeiculo;
import padroescriacao.abstractfactoryMontadora.FabricaCarro;
import padroescriacao.abstractfactoryMontadora.FabricaMoto;
import padroescriacao.abstractfactoryMontadora.Veiculo;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTeste {
    @Test
    void deveEmitirTipoCarro() {
        FabricaAbstrataVeiculo fabrica = new FabricaCarro();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Carro", veiculo.atribuirTipo());
    }

    @Test
    void deveEmitirTipoMoto() {
        FabricaAbstrataVeiculo fabrica = new FabricaMoto();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Moto", veiculo.atribuirTipo());
    }

    @Test
    void deveEmitirQtdRodasCarro() {
        FabricaAbstrataVeiculo fabrica = new FabricaCarro();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals(4, veiculo.atribuirQuantidadeRodas());
    }

    @Test
    void deveEmitirQtdRodasMoto() {
        FabricaAbstrataVeiculo fabrica = new FabricaMoto();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals(2, veiculo.atribuirQuantidadeRodas());
    }
}
