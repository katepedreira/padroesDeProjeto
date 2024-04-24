package reservas_hotel.PrecoReserva;

import reservas_hotel.Tarifario.Tarifario;

public class AcessoSpa extends ReservaDecorator {

    private static final float precoAcessoSpa = Tarifario.getInstance().getPrecoAcessoSpa();

    public AcessoSpa(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return precoAcessoSpa;
    }

    @Override
    public String getNomeEstrutura() {
        return "Acesso ao Spa";
    }
}
