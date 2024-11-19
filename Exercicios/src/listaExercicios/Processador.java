package listaExercicios;

public class Processador {
    private String marca;
    private String modelo;
    private int nucleos;
    private double velocidade; // em GHz
    private int cache; // em MB

    public Processador(String marca, String modelo, int nucleos, double velocidade, int cache) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidade = velocidade;
        this.cache = cache;
    }

    public String getDetalhes() {
        return "Processador:\n" +
               "  Marca: " + marca + "\n" +
               "  Modelo: " + modelo + "\n" +
               "  Núcleos: " + nucleos + "\n" +
               "  Velocidade: " + velocidade + " GHz\n" +
               "  Cache: " + cache + " MB\n";
    }
}
