package listaExercicios;

public class TesteNivelPrioridade {
    public static void main(String[] args) {
        // Criando objetos de NivelPrioridade
        NivelPrioridade prioridadeBaixa = new NivelPrioridade("BAIXO", 1);
        NivelPrioridade prioridadeMedia = new NivelPrioridade("MEDIO", 2);
        NivelPrioridade prioridadeAlta = new NivelPrioridade("ALTO", 3);
        NivelPrioridade prioridadeUrgente = new NivelPrioridade("URGENTE", 4);

        // Exibindo informações de cada nível de prioridade
        prioridadeBaixa.exibirInfo();   // Esperado: Nível: BAIXO - Código: 1
        prioridadeMedia.exibirInfo();   // Esperado: Nível: MEDIO - Código: 2
        prioridadeAlta.exibirInfo();    // Esperado: Nível: ALTO - Código: 3
        prioridadeUrgente.exibirInfo(); // Esperado: Nível: URGENTE - Código: 4
    }
}