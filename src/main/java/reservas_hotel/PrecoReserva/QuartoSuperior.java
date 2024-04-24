package reservas_hotel.PrecoReserva;

import reservas_hotel.Tarifario.Tarifario;

public class QuartoSuperior extends ReservaDecorator {

    private static final float precoQuartoSuperiorDia = Tarifario.getInstance().getPrecoQuartoSuperior();

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