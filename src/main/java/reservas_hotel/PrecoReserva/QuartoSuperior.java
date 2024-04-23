package reservas_hotel.PrecoReserva;

public class QuartoSuperior extends ReservaDecorator {

    private static final float precoQuartoSuperiorDia = 100.0f;

    public QuartoSuperior(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * precoQuartoSuperiorDia;
    }

    @Override
    public String getNomeEstrutura() {
        return "Quarto Superior";
    }
}