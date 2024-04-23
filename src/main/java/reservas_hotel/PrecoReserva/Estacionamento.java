package reservas_hotel.PrecoReserva;

public class Estacionamento extends ReservaDecorator {

    private static final float precoEstacionamentoDia = 20.0f;

    public Estacionamento(Reserva reserva) {
        super(reserva);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * precoEstacionamentoDia;
    }

    @Override
    public String getNomeEstrutura() {
        return "Estacionamento";
    }

}
