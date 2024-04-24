package reservas_hotel.PrecoReserva;

import reservas_hotel.Tarifario.Tarifario;

public class DescontoHospedeVip extends ReservaDecorator {

    private static final float descontoVip = -(Tarifario.getInstance().getDescontoHospedeVip());

    public DescontoHospedeVip(ReservaInterface reservaInterface) {
        super(reservaInterface);
    }

    @Override
    public float getAlteracaoPrecoReserva() {
        return getNumeroDeDias() * descontoVip;
    }

    @Override
    public String getNomeEstrutura() {
        return "Desconto Hospede Vip";
    }

}
