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

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperior() {
        ReservaInterface reserva = new QuartoSuperior(new Reserva(100f, 10));

        assertEquals(2000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComRefeicaoAllInclousive() {
        ReservaInterface reserva = new RefeicaoAllInclusive(new Reserva(100f, 10));

        assertEquals(2000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComRefeicaoCafeDaManha() {
        ReservaInterface reserva = new RefeicaoCafeDaManha(new Reserva(100f, 10));

        assertEquals(1300.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComAcessoSpa() {
        ReservaInterface reserva = new AcessoSpa(new Reserva(100f, 10));

        assertEquals(1200.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComEstacionamento() {
        ReservaInterface reserva = new Estacionamento(new Reserva(100f, 10));

        assertEquals(1200.0f, reserva.getPrecoReserva());
    }
    @Test
    void deveRetornarPrecoReservaBaseComTransfer() {
        ReservaInterface reserva = new Transfer(new Reserva(100f, 10));

        assertEquals(1060.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComDescontoHospedeVip() {
        ReservaInterface reserva = new DescontoHospedeVip(new Reserva(100f, 10));

        assertEquals(900.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpa() {
        ReservaInterface reserva = new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10)));

        assertEquals(2200.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamento() {
        ReservaInterface reserva = new Estacionamento(new AcessoSpa(new QuartoSuperior(
                new Reserva(100f, 10))));
        assertEquals(2400.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusive() {
        ReservaInterface reserva = new RefeicaoAllInclusive(new Estacionamento(new AcessoSpa(
                new QuartoSuperior(new Reserva(100f, 10)))));

        assertEquals(3400.0f, reserva.getPrecoReserva());
    }
    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransfer() {
        ReservaInterface reserva = new Transfer(new RefeicaoAllInclusive(new Estacionamento(
                new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10))))));

        assertEquals(3460.0f, reserva.getPrecoReserva());
    }
    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransferComDescontoHospedeVip() {
        ReservaInterface reserva = new DescontoHospedeVip(new Transfer(new RefeicaoAllInclusive(
                new Estacionamento(new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10)))))));

        assertEquals(3360.0f, reserva.getPrecoReserva());
    }
    @Test
    void deveRetornarEstruturaReserva() {
        ReservaInterface reserva = new Reserva(100f, 10);

        assertEquals("Reserva Base", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoStandard() {
        ReservaInterface reserva = new QuartoStandard(new Reserva(100f, 10));

        assertEquals("Reserva Base/Quarto Standard", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperior() {
        ReservaInterface reserva = new QuartoSuperior(new Reserva(100f, 10));

        assertEquals("Reserva Base/Quarto Superior", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComRefeicaoAllInclusive() {
        ReservaInterface reserva = new RefeicaoAllInclusive(new Reserva(100f, 10));

        assertEquals("Reserva Base/Refeição All Inclusive", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComRefeicaoCafeDaManha() {
        ReservaInterface reserva = new RefeicaoCafeDaManha(new Reserva(100f, 10));

        assertEquals("Reserva Base/Refeição Café da Manhã", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComAcessoSpa() {
        ReservaInterface reserva = new AcessoSpa(new Reserva(100f, 10));

        assertEquals("Reserva Base/Acesso ao Spa", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComEstacionamento() {
        ReservaInterface reserva = new Estacionamento(new Reserva(100f, 10));

        assertEquals("Reserva Base/Estacionamento", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComTransfer() {
        ReservaInterface reserva = new Transfer(new Reserva(100f, 10));

        assertEquals("Reserva Base/Transfer", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComDescontoHospedeVip() {
        ReservaInterface reserva = new DescontoHospedeVip(new Reserva(100f, 10));

        assertEquals("Reserva Base/Desconto Hospede Vip", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpa() {
        ReservaInterface reserva = new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10)));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamento() {
        ReservaInterface reserva = new Estacionamento(new AcessoSpa(new QuartoSuperior(
                new Reserva(100f, 10))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento", reserva.getEstrutura());
    }
    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusive() {
        ReservaInterface reserva = new RefeicaoAllInclusive(new Estacionamento(new AcessoSpa(
                new QuartoSuperior(new Reserva(100f, 10)))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive",
                reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransfer() {
        ReservaInterface reserva = new Transfer(new RefeicaoAllInclusive(new Estacionamento(
                new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10))))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive/Transfer",
                reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransferComDescontoHospedeVip() {
        ReservaInterface reserva = new DescontoHospedeVip(new Transfer(new RefeicaoAllInclusive(
                new Estacionamento(new AcessoSpa(new QuartoSuperior(new Reserva(100f, 10)))))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive/Transfer/Desconto Hospede Vip",
                reserva.getEstrutura());
    }

}