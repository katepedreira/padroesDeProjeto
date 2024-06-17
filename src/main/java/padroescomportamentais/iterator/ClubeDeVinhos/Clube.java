package padroescomportamentais.iterator.ClubeDeVinhos;

import java.util.*;

public class Clube implements  Iterable<Assinante>{

    private List<Assinante> assinantes = new ArrayList<Assinante>();

    public Clube(Assinante... assinantes) {
        this.assinantes = Arrays.asList(assinantes);
    }

    @Override
    public Iterator<Assinante> iterator() {
        return assinantes.iterator();
    }

}
