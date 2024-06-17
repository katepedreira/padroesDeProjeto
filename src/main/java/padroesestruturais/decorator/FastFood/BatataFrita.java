package padroesestruturais.decorator.FastFood;

public class BatataFrita extends ComboDecorator {

    public BatataFrita(Combo combo) {
        super(combo);
    }

    public float getPrecoItemAdicional() {
        return 8.0f;
    }

    public String getNomeItens() {
        return "Batata-Frita";
    }
}
