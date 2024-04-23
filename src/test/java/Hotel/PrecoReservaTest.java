package Hotel;

import org.junit.jupiter.api.Test;
import reservas_hotel.PrecoReserva.*;

import static org.junit.jupiter.api.Assertions.*;

public class PrecoReservaTest {

    @Test
    void deveRetornarPrecoReservaBase() {
        Reserva reserva = (new ReservaBase(100f, 10));

        assertEquals(1000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoStandard() {
        Reserva reserva = new QuartoStandard(new ReservaBase(100f, 10));

        assertEquals(1500.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperior() {
        Reserva reserva = new QuartoSuperior(new ReservaBase(100f, 10));

        assertEquals(2000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComRefeicaoAllInclousive() {
        Reserva reserva = new RefeicaoAllInclusive(new ReservaBase(100f, 10));

        assertEquals(2000.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComRefeicaoCafeDaManha() {
        Reserva reserva = new RefeicaoCafeDaManha(new ReservaBase(100f, 10));

        assertEquals(1300.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComAcessoSpa() {
        Reserva reserva = new AcessoSpa(new ReservaBase(100f, 10));

        assertEquals(1200.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComEstacionamento() {
        Reserva reserva = new Estacionamento(new ReservaBase(100f, 10));

        assertEquals(1200.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComTransfer() {
        Reserva reserva = new Transfer(new ReservaBase(100f, 10));

        assertEquals(1060.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComDescontoHospedeVip() {
        Reserva reserva = new DescontoHospedeVip(new ReservaBase(100f, 10));

        assertEquals(900.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpa() {
        Reserva reserva = new AcessoSpa(new QuartoSuperior(new ReservaBase(100f, 10)));

        assertEquals(2200.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamento() {
        Reserva reserva = new Estacionamento(new AcessoSpa(new QuartoSuperior(new ReservaBase(100f, 10))));

        assertEquals(2400.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusive() {
        Reserva reserva =
                new RefeicaoAllInclusive(
                    new Estacionamento(
                        new AcessoSpa(
                                new QuartoSuperior(
                                        new ReservaBase(100f, 10)))));

        assertEquals(3400.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransfer() {
        Reserva reserva =
                new Transfer(
                    new RefeicaoAllInclusive(
                            new Estacionamento(
                                    new AcessoSpa(
                                            new QuartoSuperior(
                                                    new ReservaBase(100f, 10))))));

        assertEquals(3460.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarPrecoReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransferComDescontoHospedeVip() {
        Reserva reserva =
                new DescontoHospedeVip(
                    new Transfer(
                            new RefeicaoAllInclusive(
                                    new Estacionamento(
                                            new AcessoSpa(
                                                    new QuartoSuperior(
                                                            new ReservaBase(100f, 10)))))));

        assertEquals(3360.0f, reserva.getPrecoReserva());
    }

    @Test
    void deveRetornarEstruturaReserva() {
        Reserva reserva = new ReservaBase(100f, 10);

        assertEquals("Reserva Base", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoStandard() {
        Reserva reserva = new QuartoStandard(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Quarto Standard", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperior() {
        Reserva reserva = new QuartoSuperior(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Quarto Superior", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComRefeicaoAllInclusive() {
        Reserva reserva = new RefeicaoAllInclusive(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Refeição All Inclusive", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComRefeicaoCafeDaManha() {
        Reserva reserva = new RefeicaoCafeDaManha(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Refeição Café da Manhã", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComAcessoSpa() {
        Reserva reserva = new AcessoSpa(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Acesso ao Spa", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComEstacionamento() {
        Reserva reserva = new Estacionamento(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Estacionamento", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComTransfer() {
        Reserva reserva = new Transfer(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Transfer", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComDescontoHospedeVip() {
        Reserva reserva = new DescontoHospedeVip(new ReservaBase(100f, 10));

        assertEquals("Reserva Base/Desconto Hospede Vip", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpa() {
        Reserva reserva = new AcessoSpa(new QuartoSuperior(new ReservaBase(100f, 10)));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamento() {
        Reserva reserva = new Estacionamento(new AcessoSpa(new QuartoSuperior(new ReservaBase(100f, 10))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusive() {
        Reserva reserva =
                new RefeicaoAllInclusive(
                        new Estacionamento(
                                new AcessoSpa(
                                        new QuartoSuperior(
                                                new ReservaBase(100f, 10)))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransfer() {
        Reserva reserva =
                new Transfer(
                        new RefeicaoAllInclusive(
                                new Estacionamento(
                                        new AcessoSpa(
                                                new QuartoSuperior(
                                                        new ReservaBase(100f, 10))))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive/Transfer", reserva.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaReservaBaseComQuartoSuperiorComAcessoSpaComEstacionamentoComRefeicaoAllInclusiveComTransferComDescontoHospedeVip() {
        Reserva reserva =
                new DescontoHospedeVip(
                        new Transfer(
                                new RefeicaoAllInclusive(
                                        new Estacionamento(
                                                new AcessoSpa(
                                                        new QuartoSuperior(
                                                                new ReservaBase(100f, 10)))))));

        assertEquals("Reserva Base/Quarto Superior/Acesso ao Spa/Estacionamento/Refeição All Inclusive/Transfer/Desconto Hospede Vip", reserva.getEstrutura());
    }
}
