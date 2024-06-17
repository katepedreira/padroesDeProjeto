package padroesestruturais.decorator.FastFood;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FastFoodTest {

    @Test
    void deveRetornarPrecoCombo() {
        Combo combo = new ComboCheeseBurguer(20.0f);

        assertEquals(20.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComBatataFrita() {
        Combo combo = new BatataFrita(new ComboCheeseBurguer(20.0f));

        assertEquals(28.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComMilkShake() {
        Combo combo = new MilkShake(new ComboCheeseBurguer(20.0f));

        assertEquals(35.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComRefrigerante() {
        Combo combo = new Refrigerante(new ComboCheeseBurguer(20.0f));

        assertEquals(27.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComSorvete() {
        Combo combo = new Sorvete(new ComboCheeseBurguer(20.0f));

        assertEquals(30.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComSuco() {
        Combo combo = new Suco(new ComboCheeseBurguer(20.0f));

        assertEquals(29.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComBatataFritaMaisMilkShake() {
        Combo combo = new MilkShake(new BatataFrita(new ComboCheeseBurguer(20.0f)));

        assertEquals(43.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComBatataFritaMaisMilkShakeMaisRefrigerante() {
        Combo combo = new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer(20.0f))));

        assertEquals(50.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComBatataFritaMaisMilkShakeMaisRefrigeranteMaisSorvete() {
        Combo combo = new Sorvete(new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer(20.0f)))));

        assertEquals(60.0f, combo.getPreco());
    }

    @Test
    void deveRetornarPrecoComboComBatataFritaMaisMilkShakeMaisRefrigeranteMaisSorveteMaisSuco() {
        Combo combo = new Suco(new Sorvete(new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer(20.0f))))));

        assertEquals(69.0f, combo.getPreco());
    }


    @Test
    void deveRetornarItensCombo() {
        Combo combo = new ComboCheeseBurguer();

        assertEquals("CheeseBurguer", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComBatataFrita() {
        Combo combo = new BatataFrita(new ComboCheeseBurguer());

        assertEquals("CheeseBurguer/Batata-Frita", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComMilkShake() {
        Combo combo = new MilkShake(new ComboCheeseBurguer());

        assertEquals("CheeseBurguer/MilkShake", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComRefrigerante() {
        Combo combo = new Refrigerante(new ComboCheeseBurguer());

        assertEquals("CheeseBurguer/Refrigerante", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComSorvete() {
        Combo combo = new Sorvete(new ComboCheeseBurguer());

        assertEquals("CheeseBurguer/Sorvete", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComSuco() {
        Combo combo = new Suco(new ComboCheeseBurguer());

        assertEquals("CheeseBurguer/Suco", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComBatataFritaMaisMilkShake() {
        Combo combo = new MilkShake(new BatataFrita(new ComboCheeseBurguer()));

        assertEquals("CheeseBurguer/Batata-Frita/MilkShake", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComBatataFritaMaisMilkShakeMaisRefrigerante() {
        Combo combo = new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer())));

        assertEquals("CheeseBurguer/Batata-Frita/MilkShake/Refrigerante", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComBatataFritaMaisMilkShakeMaisRefrigeranteMaisSorvete() {
        Combo combo = new Sorvete(new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer()))));

        assertEquals("CheeseBurguer/Batata-Frita/MilkShake/Refrigerante/Sorvete", combo.getItens());
    }

    @Test
    void deveRetornarItensComboComBatataFritaMaisMilkShakeMaisRefrigeranteMaisSorveteMaisSuco() {
        Combo combo = new Suco(new Sorvete(new Refrigerante(new MilkShake(new BatataFrita(new ComboCheeseBurguer())))));

        assertEquals("CheeseBurguer/Batata-Frita/MilkShake/Refrigerante/Sorvete/Suco", combo.getItens());
    }

}
