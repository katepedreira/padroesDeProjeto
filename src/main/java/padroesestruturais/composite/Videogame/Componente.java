package padroesestruturais.composite.Videogame;

public abstract class Componente {
    private String sinopse;

    public Componente(String sinopse) { this.sinopse = sinopse; }

    public String getSinopse() {
        return sinopse;
    }

    public abstract String getComponente();

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
