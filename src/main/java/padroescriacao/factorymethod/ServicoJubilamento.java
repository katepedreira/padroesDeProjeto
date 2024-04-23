package padroescriacao.factorymethod;

public class ServicoJubilamento implements IServico {

    public String executar() {
        return "Jubilamento efetivado";
    }

    public String cancelar() {
        return "Jubilamento cancelado";
    }
}
