package listaExercicios;

public class Computador {
    private String marca;
    private String modelo;
    private Processador processador;
    private Memoria memoria;

    public Computador(String marca, String modelo, Processador processador, Memoria memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoria = memoria;
    }

    public void exibirCaracteristicas() {
        System.out.println("Computador:");
        System.out.println("  Marca: " + marca);
        System.out.println("  Modelo: " + modelo);
        System.out.println();
        System.out.println(processador.getDetalhes());
        System.out.println(memoria.getDetalhes());
    }
}
