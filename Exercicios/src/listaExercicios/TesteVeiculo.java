package listaExercicios;

public class TesteVeiculo {
    public static void main(String[] args) {
        // Instanciando objetos de Carro e Bicicleta
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        // Chamando o método mover para cada objeto
        meuCarro.mover();          // Exibe: O carro está dirigindo na estrada.
        minhaBicicleta.mover();    // Exibe: A bicicleta está pedalando no caminho.
    }
}
