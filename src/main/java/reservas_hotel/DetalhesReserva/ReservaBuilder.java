package reservas_hotel.DetalhesReserva;

public class ReservaBuilder {

    private Reserva reserva;

    public ReservaBuilder() {
        reserva = new Reserva();
    }

    public Reserva build() {
        if (!reserva.getCategoriaHospede().equals("Regular") &&
                !reserva.getCategoriaHospede().equals("Vip")) {
            throw new IllegalArgumentException("Categoria inválida");
        }
        if (!reserva.getTipoRefeicao().equals("Café da Manhã") &&
                !reserva.getTipoRefeicao().equals("All Inclusive")) {
            throw new IllegalArgumentException("Tipo de refeição inválido");
        }
        if (reserva.getNomeHospede().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (reserva.getTipoQuarto().equals("")) {
            throw new IllegalArgumentException("Tipo de quarto inválido");
        }
        if (reserva.getDiarias() == 0) {
            throw new IllegalArgumentException("Número de diárias inválido");

        }
        return reserva;
    }


    public ReservaBuilder setNomeHospede(String nomeHospede) {
        reserva.setNomeHospede(nomeHospede);
        return this;
    }



    public ReservaBuilder setTipoQuarto(String tipoQuarto) {
        reserva.setTipoQuarto(tipoQuarto);
        return this;
    }


    public ReservaBuilder setDiarias(Integer diarias) {
        reserva.setDiarias(diarias);
        return this;
    }


    public ReservaBuilder setEstacionamento(boolean estacionamento) {
        reserva.setEstacionamento(estacionamento);
        return this;
    }

    public ReservaBuilder setTransfer(boolean transfer) {
        reserva.setTransfer(transfer);
        return this;
    }


    public ReservaBuilder setAcessoSpa(boolean acessoSpa) {
        reserva.setAcessoSpa(acessoSpa);
        return this;
    }


    public ReservaBuilder setCategoriaHospede(String categoriaHospede) {
        reserva.setCategoriaHospede(categoriaHospede);
        return this;
    }


    public ReservaBuilder setTipoRefeicao(String tipoRefeicao) {
        reserva.setTipoRefeicao(tipoRefeicao);
        return this;
    }
}


