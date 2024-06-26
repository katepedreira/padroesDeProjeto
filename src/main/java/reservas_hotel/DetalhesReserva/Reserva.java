package reservas_hotel.DetalhesReserva;

import reservas_hotel.PrecoReserva.ReservaInterface;
import reservas_hotel.TipoHospede.Hospede;

public class Reserva implements ReservaInterface {

    private Hospede hospede;
    private float precoBaseDiaria;
    private int numeroDeDias;
    private String estrutura;

    public Reserva() {
        this.precoBaseDiaria = 0f;
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

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public float getPrecoBaseDiaria() {
        return precoBaseDiaria;
    }
}


