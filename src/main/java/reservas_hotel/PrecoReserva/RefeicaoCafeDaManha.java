package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.Tarifario.Tarifario;

public class RefeicaoCafeDaManha extends ReservaDecorator {

    private static final float precoCafeDaManhaDia = Tarifario.getInstance().getPrecoRefeicaoCafeDaManha();

    public RefeicaoCafeDaManha(ReservaInterface reservaInterface) {
        super(reservaInterface);
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
