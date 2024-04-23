package reservas_hotel.DetalhesReserva;

public class Reserva {

    private String categoriaHospede;
    private String tipoRefeicao;
    private String nomeHospede;
    private String tipoQuarto;
    private Integer diarias;
    private boolean transfer;
    private boolean estacionamento;
    private boolean acessoSpa;


    public Reserva() {
        this.categoriaHospede = "";
        this.tipoRefeicao= "";
        this.nomeHospede = "";
        this.tipoQuarto = "";
        this.diarias = 0;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Integer getDiarias() {
        return diarias;
    }

    public void setDiarias(Integer diarias) {
        this.diarias = diarias;
    }


    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean isEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean isAcessoSpa() {
        return acessoSpa;
    }

    public void setAcessoSpa(boolean acessoSpa) {
        this.acessoSpa = acessoSpa;
    }

    public String getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(String tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    public String getCategoriaHospede() {
        return categoriaHospede;
    }

    public void setCategoriaHospede(String categoriaHospede) {
        this.categoriaHospede = categoriaHospede;
    }
}

