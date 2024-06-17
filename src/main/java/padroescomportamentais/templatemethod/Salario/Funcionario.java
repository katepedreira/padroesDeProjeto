package padroescomportamentais.templatemethod.Salario;

public abstract class Funcionario {

    protected double salarioBase;
    private String nome;
    private String nivel;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public final double calcularSalarioLiquido() {
        double salario = salarioBase;
        salario = aplicarDeducoes(salario);
        salario = aplicarBonus(salario);
        return salario;
    }

    public abstract double calcularSalario();

    public String getTipo() {
        return "Funcionario";
    }

    protected abstract double aplicarDeducoes(double salario);
    protected abstract double aplicarBonus(double salario);

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + nome + '\'' +
                ", nivel='" + nivel + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

