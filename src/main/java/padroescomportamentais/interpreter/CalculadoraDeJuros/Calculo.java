package padroescomportamentais.interpreter.CalculadoraDeJuros;

import padroescomportamentais.interpreter.Escola.InterpretadorExpressao;
import padroescomportamentais.interpreter.Escola.InterpretadorExpressoesAritmeticas;

public class Calculo {
    public static String formula = "principal * taxa * tempo";

    public static double calcularJurosSimples(float principal, float taxa, int tempo) {
        String expressao;
        expressao = formula.replace("principal", Float.toString(principal));
        expressao = expressao.replace("taxa", Float.toString(taxa));
        expressao = expressao.replace("tempo", Integer.toString(tempo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
