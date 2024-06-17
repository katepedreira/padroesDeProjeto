package padroescomportamentais.command.AutomacaoResidencial;

public class AbrirCortinasComando implements Comando {
    private Cortinas cortinas;

    public AbrirCortinasComando(Cortinas cortinas) {
        this.cortinas = cortinas;
    }

    @Override
    public void executar() {
        this.cortinas.abrir();
    }

    @Override
    public void desfazer() {
        this.cortinas.fechar();
    }
}

