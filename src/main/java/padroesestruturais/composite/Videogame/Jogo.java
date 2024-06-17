package padroesestruturais.composite.Videogame;

public class Jogo {
    private Componente enredo;

    public void setEnredo(Componente enredo) {
        this.enredo = enredo;
    }

    public String getComponente() {
        if (this.enredo == null) {
            throw new NullPointerException("Jogo sem enredo");
        }
        return this.enredo.getComponente();
    }
}

