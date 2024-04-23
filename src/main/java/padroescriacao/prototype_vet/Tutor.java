package padroescriacao.prototype_vet;

public class Tutor implements Cloneable {

    private String nome;
    private String documento;

    public Tutor(String nome, String documento) {
        super();
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';

    }
}
