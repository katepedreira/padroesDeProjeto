package padroescomportamentais.command.AutomacaoResidencial;

public class Cortinas {
    private boolean abertas;

    public void abrir() {
        abertas = true;
    }

    public void fechar() {
        abertas = false;
    }

    public boolean isAbertas() {
        return abertas;
    }
}

