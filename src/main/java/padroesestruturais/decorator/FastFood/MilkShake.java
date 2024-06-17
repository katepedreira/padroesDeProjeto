package padroesestruturais.decorator.FastFood;

public class MilkShake extends ComboDecorator{

    public MilkShake(Combo combo) {
        super(combo);
    }

    public float getPrecoItemAdicional() {
        return 15.0f;
    }

    public String getNomeItens() {
        return "MilkShake";
    }
}
