package padroescomportamentais.templatemethod.Salario;

public class Gerente extends Funcionario {
    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    protected double aplicarDeducoes(double salario) {
        double inss = salario * 0.10;
        return salario - inss;
    }

    @Override
    protected double aplicarBonus(double salario) {
        double bonus = salario * 0.15;
        return salario + bonus;
    }

    @Override
    public double calcularSalario() {
        return calcularSalarioLiquido();
    }
}

