package reservas_hotel.PrecoReserva;

public class RefeicaoAllInclusive extends ReservaDecorator {

    private static final float precoAllInclusiveDia = 100.0f;

    public RefeicaoAllInclusive(Reserva reserva) {
        super(reserva);
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
