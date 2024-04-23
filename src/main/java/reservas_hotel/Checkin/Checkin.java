package reservas_hotel.Checkin;


public class Checkin {
    public Checkin() {};
    private static Checkin instance = new Checkin();

    private String documentoHospede;
    private String nomeHospede;
    private String quartoAtribuido;

    public static Checkin getInstance() {
        return instance;
    }

    public static void setInstance(Checkin instance) {
        Checkin.instance = instance;
    }

    public String getDocumentoHospede() {
        return documentoHospede;
    }

    public Checkin setDocumentoHospede(String documentoHospede) {
        this.documentoHospede = documentoHospede;
        return this;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public Checkin setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
        return this;
    }

    public String getQuartoAtribuido() {
        return quartoAtribuido;
    }

    public Checkin setQuartoAtribuido(String quartoAtribuido) {
        this.quartoAtribuido = quartoAtribuido;
        return this;
    }
}

