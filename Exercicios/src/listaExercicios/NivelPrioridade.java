package listaExercicios;

public class NivelPrioridade {
    // Atributos para o nome e o código do nível de prioridade
    private String nome;
    private int codigo;

    // Construtor para inicializar o nome e o código
    public NivelPrioridade(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Método para obter o nome do nível de prioridade
    public String getNome() {
        return nome;
    }

    // Método para obter o código do nível de prioridade
    public int getCodigo() {
        return codigo;
    }

    // Método para exibir o nome e o código do nível de prioridade
    public void exibirInfo() {
        System.out.println("Nível: " + this.nome + " - Código: " + this.codigo);
    }
}

