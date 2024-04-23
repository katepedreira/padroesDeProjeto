package padroescriacao.factoryMethodSalaoDeBeleza;

public class CorteCabelo implements IServico{

    public String marcarHorario() {
        return "Corte de Cabelo marcado";
    }

    public String desmarcarHorario() {
        return "Corte de Cabelo desmarcado";
    }
}
