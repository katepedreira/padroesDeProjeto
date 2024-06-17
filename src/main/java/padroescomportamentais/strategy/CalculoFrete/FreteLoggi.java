package padroescomportamentais.strategy.CalculoFrete;

public class FreteLoggi implements MetodoFrete {
    @Override
    public double calcular(double peso) {
        return peso * 7;
    }
}
