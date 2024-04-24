package reservas_hotel.PrecoReserva;

public abstract class ReservaDecorator implements ReservaInterface {
    private ReservaInterface reservaInterface;
    public String estrutura;

    public ReservaDecorator(ReservaInterface reservaInterface) {
        this.reservaInterface = reservaInterface;
    }

    public ReservaInterface getReservaInterface() {return reservaInterface;}

    public void setReservaInterface(ReservaInterface reservaInterface) {
        this.reservaInterface = reservaInterface;
    }

    public abstract float getAlteracaoPrecoReserva();

    @Override
    public float getPrecoReserva() {
        return reservaInterface.getPrecoReserva() + getAlteracaoPrecoReserva();
    }

    public abstract String getNomeEstrutura();

    @Override
    public String getEstrutura() {
        return this.reservaInterface.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    @Override
    public int getNumeroDeDias() {
        return this.reservaInterface.getNumeroDeDias();
    }

}


