package padroescomportamentais.strategy.CalculoFrete;

public class FreteCorreiosPadrao implements MetodoFrete {
    @Override
    public double calcular(double peso) {
        return peso * 5;
    }
}
