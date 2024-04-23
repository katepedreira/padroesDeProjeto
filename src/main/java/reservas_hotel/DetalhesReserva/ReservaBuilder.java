package reservas_hotel.DetalhesReserva;

public class ReservaBuilder {

    private Reserva reserva;

    public ReservaBuilder() {
        this.reserva = new Reserva();
    }

    public Reserva build() {
        if (reserva.getPrecoReserva() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        if (reserva.getNumeroDeDias() <= 0) {
            throw new IllegalArgumentException("Número de dias inválido");
        }

        return reserva;
    }


    public ReservaBuilder setPrecoBaseDiaria(float precoBaseDiaria) {
        reserva.setPrecoBaseDiaria(precoBaseDiaria);
        return this;
    }



    public ReservaBuilder setNumeroDeDias(int numeroDeDias) {
        reserva.setNumeroDeDias(numeroDeDias);
        return this;
    }


    public ReservaBuilder setEstrutura(String estrutura) {
        reserva.setEstrutura(estrutura);
        return this;
    }


}


