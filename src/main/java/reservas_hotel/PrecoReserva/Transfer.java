package reservas_hotel.PrecoReserva;

import reservas_hotel.DetalhesReserva.Reserva;

public class Transfer extends ReservaDecorator{

    private static final float precoTransfer = 60.0f;

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
