package listaExercicios;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João Silva", 30);
        Pessoa pessoa2 = new Pessoa("Maria Oliveira", 25);
        Pessoa pessoa3 = new Pessoa("Carlos Souza", 40);

        // Exibindo informações das pessoas
        System.out.println("Informações da Pessoa 1:");
        pessoa1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Pessoa 2:");
        pessoa2.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Pessoa 3:");
        pessoa3.exibirInformacoes();
    }
}
