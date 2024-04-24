package reservas_hotel.PrecoReserva;

import reservas_hotel.Tarifario.Tarifario;

public class Estacionamento extends ReservaDecorator {

    private static final float precoEstacionamentoDia = Tarifario.getInstance().getPrecoEstacionamento();

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
