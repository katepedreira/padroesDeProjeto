package padroescriacao.factoryMethodSalaoDeBeleza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCorteCabeloTest {

    @Test
    void deveMarcarHorarioCorteCabelo() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("CorteCabelo");
        assertEquals("Corte de Cabelo marcado", servico.marcarHorario());
    }

    @Test
    void deveCancelarCorteCabelo() {
        IServico servico = ServicoFactorySalaoDeBeleza.obterServico("CorteCabelo");
        assertEquals("Corte de Cabelo desmarcado", servico.desmarcarHorario());
    }
}
