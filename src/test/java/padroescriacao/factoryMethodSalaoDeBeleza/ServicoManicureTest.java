package padroescriacao.factoryMethodSalaoDeBeleza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoManicureTest {

    @Test
    void deveMarcarHorarioManicure() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("Manicure");
        assertEquals("Manicure marcado", servico.marcarHorario());
    }

    @Test
    void deveCancelarManicure() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("Manicure");
        assertEquals("Manicure desmarcado", servico.desmarcarHorario());
    }
}
