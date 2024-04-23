package Hotel;
import org.junit.jupiter.api.Test;
import reservas_hotel.Checkin.Checkin;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckinTest {
    @Test
    public void deveRetornarDocumentoHospede() {
        Checkin.getInstance().setDocumentoHospede("Documento 1");
        assertEquals("Documento 1", Checkin.getInstance().getDocumentoHospede());
    }

    @Test
    public void deveRetornarNomeHospede() {
        Checkin.getInstance().setNomeHospede("Ana");
        assertEquals("Ana", Checkin.getInstance().getNomeHospede());
    }

    @Test
    public void deveRetornarQuartoAtribuido() {
        Checkin.getInstance().setQuartoAtribuido("102");
        assertEquals("102", Checkin.getInstance().getQuartoAtribuido());
    }

}
