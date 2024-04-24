package Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reservas_hotel.TipoHospede.FabricaPessoaFisica;
import reservas_hotel.TipoHospede.Hospede;
import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.DetalhesReserva.ReservaBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class DetalhesReservaTest {

    private Hospede hospede;

    @BeforeEach
    void setUp() {
        hospede = new Hospede(new FabricaPessoaFisica());
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemNumDeDias() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setHospede(hospede)
                    .setPrecoBaseDiaria(100f)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeNulo() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setHospede(null)
                    .setPrecoBaseDiaria(100f)
                    .setNumeroDeDias(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Hospede não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaReservaSemHospede() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setPrecoBaseDiaria(100f)
                    .setNumeroDeDias(10)
                    .build();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Reserva não pode ser criada sem um Hospede", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemPreco() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setHospede(hospede)
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
                .setHospede(hospede)
                .setNumeroDeDias(7)
                .setPrecoBaseDiaria(80)
                .build();

        assertNotNull(reserva);
    }
}
