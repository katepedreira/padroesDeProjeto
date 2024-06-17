package padroescomportamentais.templatemethod.Salario;

public class Consultor extends Funcionario {
    public Consultor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    protected double aplicarDeducoes(double salario) {
        double inss = salario * 0.10;
        return salario - inss;
    }

    @Override
    protected double aplicarBonus(double salario) {
        return salario;
    }

    @Override
    public double calcularSalario() {
        return calcularSalarioLiquido();
    }
}

