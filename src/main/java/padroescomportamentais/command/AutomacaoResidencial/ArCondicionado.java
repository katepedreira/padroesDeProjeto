package padroescomportamentais.command.AutomacaoResidencial;

public class ArCondicionado {
    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}

