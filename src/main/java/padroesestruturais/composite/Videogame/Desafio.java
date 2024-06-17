package padroesestruturais.composite.Videogame;

public class Desafio extends Componente {
    private String dificuldade;

    public Desafio(String sinopse, String dificuldade) {
        super(sinopse);
        this.dificuldade = dificuldade;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getComponente() {
        return "Desafio: " + this.getSinopse() + " - Dificuldade: " + this.dificuldade + "\n";
    }
}
