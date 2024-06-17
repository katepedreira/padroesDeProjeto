package padroescomportamentais.command.AutomacaoResidencial;

public class LigarArCondicionadoComando implements Comando {
    private ArCondicionado arCondicionado;

    public LigarArCondicionadoComando(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        this.arCondicionado.ligar();
    }

    @Override
    public void desfazer() {
        this.arCondicionado.desligar();
    }
}

