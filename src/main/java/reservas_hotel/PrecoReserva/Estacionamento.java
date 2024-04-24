package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;

public class Estacionamento extends ReservaDecorator {

    private static final float precoEstacionamentoDia = 20.0f;

    public Estacionamento(ReservaInterface reservaInterface) {
        super(reservaInterface);
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
