package padroescomportamentais.command.AutomacaoResidencial;

public class DesligarArCondicionadoComando implements Comando {
    private ArCondicionado arCondicionado;

    public DesligarArCondicionadoComando(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        this.arCondicionado.desligar();
    }

    @Override
    public void desfazer() {
        this.arCondicionado.ligar();
    }
}

