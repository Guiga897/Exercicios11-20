package listaExercicios;

public class TesteLoja {
    public static void main(String[] args) {
        // Criando um objeto da classe Loja
        Loja loja = new Loja();

        // Cálculo do preço sem desconto
        double precoSemDesconto = loja.calcularPreco(50.0, 3); // Preço base de 50.0, quantidade 3
        System.out.println("Preço sem desconto: R$ " + precoSemDesconto);

        // Cálculo do preço com desconto
        double precoComDesconto = loja.calcularPreco(50.0, 3, 10.0); // 10% de desconto
        System.out.println("Preço com 10% de desconto: R$ " + precoComDesconto);
    }
}
