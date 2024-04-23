package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;

public class RefeicaoCafeDaManha extends ReservaDecorator {

    private static final float precoCafeDaManhaDia = 30.0f;

    public RefeicaoCafeDaManha(Reserva reserva) {
        super(reserva);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * precoCafeDaManhaDia;
    }

    @Override
    public String getNomeEstrutura() {
        return "Refeição Café da Manhã";
    }

}
