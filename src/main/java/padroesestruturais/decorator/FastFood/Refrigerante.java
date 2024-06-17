package padroesestruturais.decorator.FastFood;

public class Refrigerante extends ComboDecorator {

    public Refrigerante(Combo combo) {
        super(combo);
    }

    public float getPrecoItemAdicional() {
        return 7.0f;
    }

    public String getNomeItens() {
        return "Refrigerante";
    }
}
