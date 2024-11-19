package listaExercicios;

public class Animal {
    // Método que será sobrescrito nas classes derivadas
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Classe derivada Cachorro que herda de Animal
class Cachorro extends Animal {
    // Sobrescrevendo o método fazerSom() para o som específico do cachorro
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Classe derivada Gato que herda de Animal
class Gato extends Animal {
    // Sobrescrevendo o método fazerSom() para o som específico do gato
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}