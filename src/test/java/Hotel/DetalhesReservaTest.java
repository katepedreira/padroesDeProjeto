package Hotel;

import org.junit.jupiter.api.Test;
import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.DetalhesReserva.ReservaBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class DetalhesReservaTest {

    @Test
    void deveRetornarExcecaoParaHospedeSemNome() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setCategoriaHospede("Regular")
                    .setTipoRefeicao("Café da Manhã")
                    .setDiarias(7)
                    .setTipoQuarto("Quarto Standard")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemCategoria() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setNomeHospede("Katherine Pedreira")
                    .setTipoRefeicao("All Inclusive")
                    .setDiarias(10)
                    .setTipoQuarto("Quarto Superior")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Categoria inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemTipoRefeicao() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setNomeHospede("Julia Alves")
                    .setCategoriaHospede("Vip")
                    .setDiarias(15)
                    .setTipoQuarto("Quarto Superior")
                    .setAcessoSpa(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de refeição inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemDiarias() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setNomeHospede("Fulano")
                    .setCategoriaHospede("Regular")
                    .setTipoRefeicao("Café da Manhã")
                    .setTipoQuarto("Quarto Standard")
                    .setEstacionamento(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de diárias inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHospedeSemTipoQuarto() {
        try {
            Reserva detalhesReserva = new ReservaBuilder()
                    .setNomeHospede("Ciclano")
                    .setCategoriaHospede("Vip")
                    .setTipoRefeicao("All Inclusive")
                    .setTransfer(true)
                    .setDiarias(5)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de quarto inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarReservaValida() {
        Reserva reserva = new ReservaBuilder()
                .setNomeHospede("Beltrano")
                .setCategoriaHospede("Vip")
                .setTipoRefeicao("All Inclusive")
                .setDiarias(15)
                .setTipoQuarto("Quarto Superior")
                .setAcessoSpa(true)
                .build();

        assertNotNull(reserva);
    }
}

