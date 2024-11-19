package listaExercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
        // Criando um objeto Funcionario com salário base de 3000
        Funcionario funcionario = new Funcionario(3000);
        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario()); // Esperado: 3000

        // Criando um objeto Gerente com salário base de 5000 e bônus de 1500
        Gerente gerente = new Gerente(5000, 1500);
        System.out.println("Salário do Gerente: " + gerente.calcularSalario()); // Esperado: 6500
    }
}
