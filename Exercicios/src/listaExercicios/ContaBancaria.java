package listaExercicios;

public class ContaBancaria {
    // Atributos privados para garantir o encapsulamento
    private double saldo;
    private int numero;

    // Construtor para inicializar os atributos
    public ContaBancaria(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo (somente leitura)
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para obter o número da conta
    public int getNumero() {
        return numero;
    }
}