package reservas_hotel.PrecoReserva;

public class Transfer extends ReservaDecorator{

    private static final float precoTransfer = 60.0f;

    public Transfer(Reserva reserva) {
        super(reserva);
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
