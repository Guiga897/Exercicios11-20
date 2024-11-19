package listaExercicios;

public class TesteComputador {

	public static void main(String[] args) {
		 Processador processador = new Processador(
	                "Intel", 
	                "Core i7-11700K", 
	                8, 
	                3.6, 
	                16
	        );

	        // Criação do objeto Memoria
	        Memoria memoria = new Memoria(
	                "DDR4", 
	                16, 
	                3200
	        );

	        // Criação do objeto Computador com Processador e Memoria
	        Computador computador = new Computador(
	                "Dell", 
	                "Inspiron 15", 
	                processador, 
	                memoria
	        );

	        // Exibir características completas do computador
	        computador.exibirCaracteristicas();
	    }
	}
