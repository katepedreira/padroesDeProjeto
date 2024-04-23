package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;

public class DescontoHospedeVip extends ReservaDecorator {

    private static final float descontoVip = -10.0f;

    public DescontoHospedeVip(Reserva reserva) {
        super(reserva);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * descontoVip;
    }

    @Override
    public String getNomeEstrutura() {
        return "Desconto Hospede Vip";
    }

}
