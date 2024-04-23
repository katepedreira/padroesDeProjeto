package reservas_hotel.DetalhesReserva;
import reservas_hotel.Checkin.Checkin;

public class ReservaOld {

    private String categoriaHospede;
    private String tipoRefeicao;
    private Checkin checkin;
    private String tipoQuarto;
    private Integer diarias;
    private boolean transfer;
    private boolean estacionamento;
    private boolean acessoSpa;


    public ReservaOld() {
        this.categoriaHospede = "";
        this.tipoRefeicao= "";
        this.tipoQuarto = "";
        this.diarias = 0;
        this.checkin = new Checkin();
    }


    public String getNomeHospede() {
        return checkin.getNomeHospede();
    }

    public void setNomeHospede(String nomeHospede) {
        checkin.setNomeHospede(nomeHospede);
    }


    public String getDocumentoHospede() {
        return checkin.getDocumentoHospede();
    }

    public void setDocumentoHospede(String documentoHospede) {
        checkin.setDocumentoHospede(documentoHospede);
    }

    public String getQuartoAtribuido() {
        return checkin.getQuartoAtribuido();
    }

    public void setQuartoAtribuido(String quartoAtribuido) {
        checkin.setQuartoAtribuido(quartoAtribuido);
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

