package Hotel;

import org.junit.jupiter.api.Test;
import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.PrecoReserva.*;

import static org.junit.jupiter.api.Assertions.*;

public class PrecoReservaTest {

    @Test
    void deveRetornarPrecoReservaBase() {
        ReservaInterface reserva = (new Reserva(100f, 10));

        assertEquals(1000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoStandard() {
        ReservaInterface reserva = new QuartoStandard(new Reserva(100f, 10));

        assertEquals(1500.0f, reserva.getPrecoReserva());
    }


}