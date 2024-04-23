package reservas_hotel.PrecoReserva;

public abstract class ReservaDecorator implements Reserva {
    private Reserva reserva;
    public String estrutura;

    public ReservaDecorator(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {return reserva;}

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public abstract float getAlteracaoPrecoReserva();

    @Override
    public float getPrecoReserva() {
        return reserva.getPrecoReserva() + getAlteracaoPrecoReserva();
    }

    public abstract String getNomeEstrutura();

    @Override
    public String getEstrutura() {
        return this.reserva.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    @Override
    public int getNumeroDeDias() {
        return this.reserva.getNumeroDeDias();
    }

}


