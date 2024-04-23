package reservas_hotel.PrecoReserva;

public class ReservaBase implements Reserva {
    private float precoBaseDiaria;
    private int numeroDeDias;
    private String estrutura;

    public ReservaBase(float precoBaseDiaria, int numeroDeDias) {
        this.precoBaseDiaria = precoBaseDiaria;
        this.numeroDeDias = numeroDeDias;
        this.estrutura = "Reserva Base";
    }

    @Override
    public float getPrecoReserva() {
        return precoBaseDiaria * numeroDeDias;
    }

    @Override
    public int getNumeroDeDias() {
        return numeroDeDias;
    }

    @Override
    public String getEstrutura() {
        return estrutura;
    }

}


