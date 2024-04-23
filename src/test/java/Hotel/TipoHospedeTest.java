package Hotel;

import org.junit.jupiter.api.Test;
import reservas_hotel.TipoHospede.FabricaAbstrataHospede;
import reservas_hotel.TipoHospede.FabricaPessoaFisica;
import reservas_hotel.TipoHospede.FabricaPessoaJuridica;
import reservas_hotel.TipoHospede.Hospede;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoHospedeTest {

    @Test
    void deveAtribuirDesignacaoPessoaFisica() {
        FabricaAbstrataHospede fabrica = new FabricaPessoaFisica();
        Hospede hospede = new Hospede(fabrica);
        assertEquals("Nome", hospede.atribuirDesignacao());
    }

    @Test
    void deveAtribuirDocumentoPessoaFisica() {
        FabricaAbstrataHospede fabrica = new FabricaPessoaFisica();
        Hospede hospede = new Hospede(fabrica);
        assertEquals("CPF", hospede.atribuirDocumento());
    }

    @Test
    void deveAtribuirDesignacaoPessoaJuridica() {
        FabricaAbstrataHospede fabrica = new FabricaPessoaJuridica();
        Hospede hospede = new Hospede(fabrica);
        assertEquals("Razão Social", hospede.atribuirDesignacao());
    }

    @Test
    void deveAtribuirDocumentoPessoaJuridica() {
        FabricaAbstrataHospede fabrica = new FabricaPessoaJuridica();
        Hospede hospede = new Hospede(fabrica);
        assertEquals("CNPJ", hospede.atribuirDocumento());
    }
}
