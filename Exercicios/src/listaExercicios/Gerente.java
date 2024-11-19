package listaExercicios;

public class Gerente extends Funcionario {

	// Atributo para o bônus do gerente
    private double bonus;

    // Construtor para inicializar o salário base e o bônus
    public Gerente(double salarioBase, double bonus) {
        super(salarioBase); // Chama o construtor da classe base
        this.bonus = bonus;
    }

    // Sobrescrita do método calcularSalario para incluir o bônus
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}