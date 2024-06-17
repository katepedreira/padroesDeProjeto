package padroesestruturais.decorator.FastFood;

public abstract class ComboDecorator implements Combo {

    private Combo combo;
    private String itens;

    public ComboDecorator(Combo combo) {this.combo = combo; }

    public Combo getCombo() {return combo;}

    public void setCombo(Combo combo) { this.combo = combo; }

    public abstract float getPrecoItemAdicional();

    public float getPreco() {
        return this.combo.getPreco() + this.getPrecoItemAdicional();
    }

    public abstract String getNomeItens();

    public String getItens() {
        return this.combo.getItens() + "/" + this.getNomeItens();
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}