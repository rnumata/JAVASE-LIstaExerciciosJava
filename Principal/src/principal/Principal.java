/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Classe para execução do sistema
 * @author regisnumata
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	// Lista 01 - Ex 02
    	//calcularDistancia();
    	    	        
        //Array com opcoes menu
        String[] opcoes = {"Calcular Distancia", "Calcular Media Ponderada"};
        
        
        boolean continuar = true;
        do {
        	
        	int opcao = Console.mostrarMenu(opcoes, "Lista");
            System.out.println("Opção:" + opcao);
            
            switch (opcao) {
            case 1:
            	calcularDistancia();
            	break;
            case 2:
            	calcularMediaPonderada ();
            	break;
            case -1:
            	System.out.println("Fim de execução");
            	continuar = false;
            	break;
            }
            
            
        } while(continuar);
        
        
        
        
        
    } // --- Fim Main ---
    
             
    	// Lista 01 - Ex 02
    	/**
    	 * Operação de tela para cálculo de distância entre dois pontos 
    	 */
    	public static void calcularDistancia () {
    		int x1 = Console.recuperaInteiro("Informe x1: ");
    		int x2 = Console.recuperaInteiro("Informe x2: ");
    		int y1 = Console.recuperaInteiro("Informe y1: ");
    		int y2 = Console.recuperaInteiro("Informe y2: ");
    		double distancia = Exercicios.calcularDistancia(x1, y1, x2, y2);
    		System.out.println("A distancia é -> " + distancia);
    	}
    	
    	
    	// Lista 01 - Ex 04
    	/**
    	 * Operação de tela para cálculo da media ponderada
    	 */
    	public static void calcularMediaPonderada () {
    		double np1 = Console.recuperaInteiro("Informe np1: ");
    		double np2 = Console.recuperaInteiro("Informe np2: ");
    		double np3 = Console.recuperaInteiro("Informe np3: ");
    		double pp1 = Console.recuperaInteiro("Informe pp1: ");
    		double pp2 = Console.recuperaInteiro("Informe pp2: ");
    		double pp3 = Console.recuperaInteiro("Informe pp3: ");
    		double ponderada = Exercicios.calcularMediaPonderada(np1, np2, np3, pp1, pp2, pp3);
    		System.out.println("A Media Ponderada é -> " + ponderada);
    	}
    	
    
    
    
} // ------- Fim Classe ---------
