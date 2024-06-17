package padroesestruturais.composite.Videogame;

import java.util.List;
import java.util.ArrayList;

public class Fase extends Componente {
    private List<Componente> componentes;

    public Fase(String sinopse) {
        super(sinopse);
        this.componentes = new ArrayList<Componente>();
    }

    public void addComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public String getComponente() {
        String saida = "";
        saida = "Fase: " + this.getSinopse() + "\n";
        for (Componente componente : componentes) {
            saida += componente.getComponente();
        }
        return saida;
    }

}
