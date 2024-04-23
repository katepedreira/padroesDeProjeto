package reservas_hotel.PrecoReserva;

public class QuartoStandard extends ReservaDecorator {

    private static final float precoQuartoStandardDia = 50.0f;

    public QuartoStandard(Reserva reserva) {
        super(reserva);
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
