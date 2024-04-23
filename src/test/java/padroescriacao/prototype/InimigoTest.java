package padroescriacao.prototype;
import org.junit.jupiter.api.Test;
import padroescriacao.prototype_inimigo.Arma;
import padroescriacao.prototype_inimigo.Inimigo;

import static org.junit.jupiter.api.Assertions.*;

public class InimigoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Inimigo inimigo = new Inimigo("Coringa", 10, new Arma("Verde", 10));

        Inimigo inimigoClone = inimigo.clone();
        inimigoClone.setNome("Pinguim");
        inimigoClone.setNivelMaldade(8);
        inimigoClone.getArma().setQtdBalas(10);
        inimigoClone.getArma().setCor("Preta");

        assertEquals("Inimigo{nome='Coringa', nivelMaldade=10, arma=Arma{cor='Verde', qtdBalas=10}}", inimigo.toString());
        assertEquals("Inimigo{nome='Pinguim', nivelMaldade=8, arma=Arma{cor='Preta', qtdBalas=10}}", inimigoClone.toString());


    }}
