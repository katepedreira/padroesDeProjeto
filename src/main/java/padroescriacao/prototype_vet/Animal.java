package padroescriacao.prototype_vet;

public class Animal implements Cloneable{

    private String nome;

    private String especie;

    private Tutor tutor;

    public Animal(String nome, String especie, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.tutor = tutor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal animalClone = (Animal) super.clone();
        animalClone.tutor = (Tutor) animalClone.tutor.clone();
        return animalClone;
    }


    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", tutor=" + tutor.toString() +
                '}';
    }
}
