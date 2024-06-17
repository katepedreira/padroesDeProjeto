package padroescomportamentais.command.AutomacaoResidencial;

public class FecharCortinasComando implements Comando {
    private Cortinas cortinas;

    public FecharCortinasComando(Cortinas cortinas) {
        this.cortinas = cortinas;
    }

    @Override
    public void executar() {
        this.cortinas.fechar();
    }

    @Override
    public void desfazer() {
        this.cortinas.abrir();
    }
}

