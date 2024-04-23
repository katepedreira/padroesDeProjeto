package padroescriacao.factoryMethodSalaoDeBeleza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoDesignSobrancelhaTest {

    @Test
    void deveMarcarHorarioDesignSobrancelha() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("DesignSobrancelha");
        assertEquals("Design de Sobrancelha marcado", servico.marcarHorario());
    }

    @Test
    void deveCancelarDesignSobrancelha() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("DesignSobrancelha");
        assertEquals("Design de Sobrancelha desmarcado", servico.desmarcarHorario());
    }


}
