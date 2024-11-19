package listaExercicios;

public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma conta bancária com número 1234 e saldo inicial de 500.00
        ContaBancaria conta = new ContaBancaria(1234, 500.00);

        // Exibindo o saldo inicial
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realizando um depósito de 200.00
        conta.depositar(200.00);

        // Exibindo o saldo após o depósito
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        // Tentando depositar um valor inválido (-50.00)
        conta.depositar(-50.00);
    }
}