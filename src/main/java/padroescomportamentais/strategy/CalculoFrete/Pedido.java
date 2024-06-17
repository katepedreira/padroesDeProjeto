package padroescomportamentais.strategy.CalculoFrete;

public class Pedido {
    private double peso;
    private MetodoFrete metodoFrete;

    public Pedido(double peso) {
        this.peso = peso;
    }

    public void setMetodoFrete(MetodoFrete metodoFrete) {
        this.metodoFrete = metodoFrete;
    }

    public double calcularFrete() {
        if (metodoFrete == null) {
            throw new IllegalStateException("Método de frete não definido");
        }
        return metodoFrete.calcular(peso);
    }
}
