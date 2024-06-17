package padroesestruturais.decorator.FastFood;

public class Suco extends ComboDecorator {

    public Suco(Combo combo) {
        super(combo);
    }

    public float getPrecoItemAdicional() {
        return 9.0f;
    }

    public String getNomeItens() {
        return "Suco";
    }

}
