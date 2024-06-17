package padroescomportamentais.strategy.CalculoFrete;

public class FreteCorreiosExpresso implements MetodoFrete {
    @Override
    public double calcular(double peso) {
        return peso * 10.0;
    }
}
