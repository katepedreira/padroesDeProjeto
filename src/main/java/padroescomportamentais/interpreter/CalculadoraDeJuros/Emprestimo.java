package padroescomportamentais.interpreter.CalculadoraDeJuros;

public class Emprestimo {

    private float principal;
    private float taxa;
    private int tempo;

    public float calcularJurosSimples() {
        return (float) Calculo.calcularJurosSimples(this.principal, this.taxa, this.tempo);
    }

    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}