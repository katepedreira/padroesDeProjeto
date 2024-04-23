package padroescriacao.singleton;

public class Configuracoes {

    private Configuracoes() {};
    private static Configuracoes instance = new Configuracoes();
    public static Configuracoes getInstance() {
        return instance;
    }

    private String idioma;
    private String nivel;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
