package listaExercicios;

public class Livro {
    // Atributos da classe Livro
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Construtor da classe Livro
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}
