package listaExercicios;

public class TesteLivro {
    public static void main(String[] args) {
        // Criando objetos da classe Livro
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("1984", "George Orwell", 328);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        // Exibindo detalhes dos livros
        System.out.println("Detalhes do Livro 1:");
        livro1.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes do Livro 2:");
        livro2.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes do Livro 3:");
        livro3.exibirDetalhes();
    }
}
