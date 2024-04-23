package Hotel;

import org.junit.jupiter.api.Test;
import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.DetalhesReserva.ReservaOld;
import reservas_hotel.DetalhesReserva.ReservaBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class DetalhesReservaTest {

    @Test
    void deveRetornarExcecaoParaHospedeSemNumDeDias() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setPrecoBaseDiaria(100)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemPreco() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setNumeroDeDias(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarReservaValida() {
        Reserva reserva = new ReservaBuilder()
                .setNumeroDeDias(7)
                .setPrecoBaseDiaria(80)
                .build();

        assertNotNull(reserva);
    }
}

