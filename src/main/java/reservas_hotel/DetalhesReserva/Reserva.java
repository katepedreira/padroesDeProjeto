package reservas_hotel.DetalhesReserva;

import reservas_hotel.PrecoReserva.ReservaInterface;

public class Reserva implements ReservaInterface {
    private float precoBaseDiaria;
    private int numeroDeDias;
    private String estrutura;

    public Reserva() {
        this.precoBaseDiaria = 0;
        this.numeroDeDias = 0;
        this.estrutura = "Reserva Base";
    }

    public Reserva(float precoBaseDiaria, int numeroDeDias) {
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

    public void setPrecoBaseDiaria(float precoBaseDiaria) {
        this.precoBaseDiaria = precoBaseDiaria;
    }

    public void setNumeroDeDias(int numeroDeDias) {
        this.numeroDeDias = numeroDeDias;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


