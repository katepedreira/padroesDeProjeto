package padroescomportamentais.command.AutomacaoResidencial;

import java.util.List;

import java.util.ArrayList;

public class ControladorAutomacao {
    private List<Comando> historicoComandos = new ArrayList<>();
    private int indiceAtual = -1;

    public void executarComando(Comando comando) {
        if (indiceAtual != historicoComandos.size() - 1) {
            historicoComandos.subList(indiceAtual + 1, historicoComandos.size()).clear();
        }
        historicoComandos.add(comando);
        indiceAtual++;
        comando.executar();
    }

    public void cancelarUltimoComando() {
        if (indiceAtual >= 0) {
            Comando comando = historicoComandos.get(indiceAtual);
            indiceAtual--;
            comando.desfazer();
        }
    }
}
