package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;
import reservas_hotel.Tarifario.Tarifario;

public class Transfer extends ReservaDecorator{

    private static final float precoTransfer = Tarifario.getInstance().getPrecoTransfer();

    public Transfer(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return precoTransfer;
    }

    @Override
    public String getNomeEstrutura() {
        return "Transfer";
    }

}
