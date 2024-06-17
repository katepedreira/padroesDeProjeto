package padroesestruturais.flyweight.Empresa;

public class Profissao {

    private String titulo;
    private String area;

    public Profissao(String titulo, String area) {
        this.titulo = titulo;
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArea() {
        return area;
    }
}
