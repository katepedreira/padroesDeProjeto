package padroesestruturais.flyweight.Empresa;

public class Candidato {
    private String nome;
    private Profissao tituloProfissao;

    public Candidato(String nome, Profissao tituloProfissao) {
        this.nome = nome;
        this.tituloProfissao = tituloProfissao;
    }


    public String obterCandidato() {
        return "Candidato{" +
                "nome='" + this.nome + '\'' +
                ", profissao='" + tituloProfissao.getTitulo() + '\'' +
                ", area='" + tituloProfissao.getArea() + '\'' +
                '}';
    }
}

