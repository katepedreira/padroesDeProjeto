package reservas_hotel.DetalhesReserva;

import reservas_hotel.TipoHospede.Hospede;

public class ReservaBuilder {

    private Hospede hospede = null;
    private float precoBaseDiaria = 0f;
    private int numeroDeDias = 0;
    private String estrutura = "Reserva Base";

    public ReservaBuilder() {
    }

    public ReservaBuilder setHospede(Hospede hospede) {
        if (hospede == null) {
            throw new IllegalArgumentException("Hospede não pode ser nulo");
        }
        this.hospede = hospede;
        return this;
    }

    public Reserva build() {
        if (hospede == null) {
            throw new IllegalStateException("Reserva não pode ser criada sem um Hospede");
        }
        if (numeroDeDias <= 0) {
            throw new IllegalArgumentException("Número de dias inválido");
        }
        if (precoBaseDiaria <= 0.0f) {
            throw new IllegalArgumentException("Preço inválido");
        }

        Reserva reserva = new Reserva();
        reserva.setHospede(hospede);
        reserva.setPrecoBaseDiaria(precoBaseDiaria);
        reserva.setNumeroDeDias(numeroDeDias);
        reserva.setEstrutura(estrutura);
        return reserva;
    }

    public ReservaBuilder setPrecoBaseDiaria(float precoBaseDiaria) {
        this.precoBaseDiaria = precoBaseDiaria;
        return this;
    }

    public ReservaBuilder setNumeroDeDias(int numeroDeDias) {
        this.numeroDeDias = numeroDeDias;
        return this;
    }

    public ReservaBuilder setEstrutura(String estrutura) {
        this.estrutura = estrutura;
        return this;
    }

}
