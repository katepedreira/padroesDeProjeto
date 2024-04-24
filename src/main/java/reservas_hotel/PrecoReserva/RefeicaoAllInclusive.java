package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.Tarifario.Tarifario;

public class RefeicaoAllInclusive extends ReservaDecorator {

    private static final float precoAllInclusiveDia = Tarifario.getInstance().getPrecoRefeicaoAllInclusive();

    public RefeicaoAllInclusive(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * precoAllInclusiveDia;
    }

    @Override
    public String getNomeEstrutura() {
        return "Refeição All Inclusive";
    }

}
