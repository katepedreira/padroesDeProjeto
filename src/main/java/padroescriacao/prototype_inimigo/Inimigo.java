package padroescriacao.prototype_inimigo;

import padroescriacao.prototype.Aluno;
import padroescriacao.prototype.Endereco;

public class Inimigo implements Cloneable{

    private String nome;

    private Integer nivelMaldade;

    private Arma arma;

    public Inimigo(String nome, Integer nivelMaldade, Arma arma) {
        this.nome = nome;
        this.nivelMaldade = nivelMaldade;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivelMaldade() {
        return nivelMaldade;
    }

    public void setNivelMaldade(Integer nivelMaldade) {
        this.nivelMaldade = nivelMaldade;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public Inimigo clone() throws CloneNotSupportedException {
        Inimigo inimigoClone = (Inimigo) super.clone();
        inimigoClone.arma = (Arma) inimigoClone.arma.clone();
        return inimigoClone;
    }


    public String toString() {
        return "Inimigo{" +
                "nome='" + nome + '\'' +
                ", nivelMaldade=" + nivelMaldade +
                ", arma=" + arma.toString() +
                '}';
    }
}
