package padroesestruturais.decorator.FastFood;

public class Sorvete extends ComboDecorator {

    public Sorvete(Combo combo) {
        super(combo);
    }

    public float getPrecoItemAdicional() {
        return 10.0f;
    }

    public String getNomeItens() {
        return "Sorvete";
    }
}
