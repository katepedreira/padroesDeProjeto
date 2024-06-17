package padroesestruturais.decorator.FastFood;

public class ComboCheeseBurguer implements Combo {

    public float preco;

    public ComboCheeseBurguer() {

    }

    public ComboCheeseBurguer(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getItens() {
        return "CheeseBurguer";
    }
}
