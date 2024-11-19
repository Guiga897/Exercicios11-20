package listaExercicios;

public class TesteAnimal {
    public static void main(String[] args) {
        // Criando objetos das classes derivadas
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        // Chamando o método fazerSom() de cada objeto
        meuCachorro.fazerSom(); // Exibe: O cachorro late: Au Au!
        meuGato.fazerSom();      // Exibe: O gato mia: Miau!
    }
}
