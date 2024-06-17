package padroescomportamentais.strategy.CalculoFrete;

public class FreteJadLog implements MetodoFrete {
    @Override
    public double calcular(double peso) {
        return peso * 6;
    }
}
