package padroescriacao.abstractfactory;
import org.junit.jupiter.api.Test;
import padroescriacao.abstractfactoryAdv.Cliente;
import padroescriacao.abstractfactoryAdv.FabricaAbstrataAdv;
import padroescriacao.abstractfactoryAdv.FabricaPF;
import padroescriacao.abstractfactoryAdv.FabricaPJ;

import static org.junit.jupiter.api.Assertions.*;

public class AdvTeste {
    @Test
    void deveDefinirDesignacaoPF() {
        FabricaAbstrataAdv fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Nome", cliente.definirDesignacao());
    }

    @Test
    void deveDefinirDesignacaoPJ() {
        FabricaAbstrataAdv fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Razão Social", cliente.definirDesignacao());
    }

    @Test
    void deveDefinirDocumentoPF() {
        FabricaAbstrataAdv fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("CPF", cliente.definirDocumento());
    }

    @Test
    void deveDefinirDocumentoPJ() {
        FabricaAbstrataAdv fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("CNPJ", cliente.definirDocumento());
    }


}


