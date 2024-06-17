package padroescomportamentais.iterator.ClubeDeVinhos;

import java.util.Iterator;

public class Estatisticas {

    public static Integer contarAssinantesAtivos(Clube clube) {
        int quantidade = 0;
        for (Assinante assinante : clube) {
            if (assinante.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAssinantes(Clube clube) {
        int quantidade = 0;
        for (Iterator a = clube.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
