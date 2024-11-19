package listaExercicios;

public class Memoria {
    private String tipo;
    private int capacidade; // em GB
    private int velocidade; // em MHz

    public Memoria(String tipo, int capacidade, int velocidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public String getDetalhes() {
        return "Memória:\n" +
               "  Tipo: " + tipo + "\n" +
               "  Capacidade: " + capacidade + " GB\n" +
               "  Velocidade: " + velocidade + " MHz\n";
    }
}

