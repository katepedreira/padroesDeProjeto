package reservas_hotel.PrecoReserva;

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
