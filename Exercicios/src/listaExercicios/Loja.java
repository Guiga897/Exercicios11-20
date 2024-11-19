package listaExercicios;

public class Loja {
	  // Método para calcular o preço considerando o preço base e a quantidade
    public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    // Método sobrecarregado para calcular o preço considerando preço base, quantidade e desconto
    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double precoTotal = precoBase * quantidade;
        double desconto = precoTotal * (descontoPercentual / 100);
        return precoTotal - desconto;
    }
}