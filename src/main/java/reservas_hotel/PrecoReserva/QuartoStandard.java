package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.Tarifario.Tarifario;

public class QuartoStandard extends ReservaDecorator {

    private static final float precoQuartoStandardDia = Tarifario.getInstance().getPrecoQuartoStandard();

    public QuartoStandard(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * precoQuartoStandardDia;
    }

    @Override
    public String getNomeEstrutura() {
        return "Quarto Standard";
    }

}
