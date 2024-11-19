package listaExercicios;

public class Funcionario {

	 // Atributo para o salário base do funcionário
    private double salarioBase;

    // Construtor para inicializar o salário base
    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular o salário (não inclui bônus)
    public double calcularSalario() {
        return salarioBase;
    }

    // Getter para obter o salário base
    public double getSalarioBase() {
        return salarioBase;
    }
}