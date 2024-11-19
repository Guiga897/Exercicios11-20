package listaExercicios;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Criação do objeto Calculadora
        Calculadora calculadora = new Calculadora();

        // Teste de soma
        double soma = calculadora.somar(10, 5);
        System.out.println("Soma: 10 + 5 = " + soma); // Esperado: 15

        // Teste de subtração
        double subtracao = calculadora.subtrair(10, 5);
        System.out.println("Subtração: 10 - 5 = " + subtracao); // Esperado: 5

        // Teste de multiplicação
        double multiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("Multiplicação: 10 * 5 = " + multiplicacao); // Esperado: 50

        // Teste de divisão
        try {
            double divisao = calculadora.dividir(10, 5);
            System.out.println("Divisão: 10 / 5 = " + divisao); // Esperado: 2
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de divisão por zero (para validar tratamento de erro)
        try {
            double divisaoPorZero = calculadora.dividir(10, 0);
            System.out.println("Divisão: 10 / 0 = " + divisaoPorZero);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao dividir: " + e.getMessage()); // Esperado: erro de divisão por zero
        }
    }
}

