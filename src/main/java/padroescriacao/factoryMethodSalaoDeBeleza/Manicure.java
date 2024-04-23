package padroescriacao.factoryMethodSalaoDeBeleza;

public class Manicure implements IServico{

    public String marcarHorario() {
        return "Manicure marcado";
    }

    public String desmarcarHorario() {
        return "Manicure desmarcado";
    }
}
