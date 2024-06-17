package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import padroescomportamentais.command.AutomacaoResidencial.*;

class ControladorAutomacaoTest {

    private ControladorAutomacao controlador;
    private Cortinas cortinas;
    private ArCondicionado arCondicionado;

    @BeforeEach
    void setUp() {
        controlador = new ControladorAutomacao();
        cortinas = new Cortinas();
        arCondicionado = new ArCondicionado();
    }

    @Test
    void deveAbrirCortinas() {
        Comando abrirCortinas = new AbrirCortinasComando(cortinas);
        controlador.executarComando(abrirCortinas);

        assertEquals(true, cortinas.isAbertas());
    }

    @Test
    void deveFecharCortinas() {
        Comando fecharCortinas = new FecharCortinasComando(cortinas);
        controlador.executarComando(fecharCortinas);

        assertEquals(false, cortinas.isAbertas());
    }

    @Test
    void deveLigarArCondicionado() {
        Comando ligarArCondicionado = new LigarArCondicionadoComando(arCondicionado);
        controlador.executarComando(ligarArCondicionado);

        assertEquals(true, arCondicionado.isLigado());
    }

    @Test
    void deveDesligarArCondicionado() {
        Comando desligarArCondicionado = new DesligarArCondicionadoComando(arCondicionado);
        controlador.executarComando(desligarArCondicionado);

        assertEquals(false, arCondicionado.isLigado());
    }

    @Test
    void deveDesfazerDesligarArCondicionado() {
        Comando ligarArCondicionado = new LigarArCondicionadoComando(arCondicionado);
        Comando desligarArCondicionado = new DesligarArCondicionadoComando(arCondicionado);

        controlador.executarComando(ligarArCondicionado);
        controlador.executarComando(desligarArCondicionado);

        controlador.cancelarUltimoComando();

        assertEquals(true, arCondicionado.isLigado());
    }

    @Test
    void deveDesfazerAbrirCortinas() {
        Comando fecharCortinas = new FecharCortinasComando(cortinas);
        Comando abrirCortinas = new AbrirCortinasComando(cortinas);

        controlador.executarComando(fecharCortinas);
        controlador.executarComando(abrirCortinas);

        controlador.cancelarUltimoComando();

        assertEquals(false, cortinas.isAbertas());
    }

}