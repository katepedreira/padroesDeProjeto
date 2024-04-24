package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;

public class AcessoSpa extends ReservaDecorator {
    private static final float precoAcessoSpa = 200.0f;

    public AcessoSpa(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return precoAcessoSpa;
    }

    @Override
    public String getNomeEstrutura() {
        return "Acesso ao Spa";
    }
}

