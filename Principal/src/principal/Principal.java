/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;

/**
 * Classe para execucao do sistema
 * @author regisnumata
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	// Exemplo para chamar uma funcao qdo existe um metodo irmao abaixo do main
    	//calcularDistancia();
    	    	        
        //Array com opcoes menu
        String[] opcoes = 
        {"Progressao Aritmetica",
         "Distancia", 
         "Media Aritmetica",
         "Media Ponderada", 
         "Media Harmonica",
         "Converter Temperatura",
         "Volume",
         "Consumo",
         "Montante"};
        
        
        boolean continuar = true;
        
        do {
           
            System.out.println("\n");
            int opcao = Console.mostrarMenu(opcoes, "Lista");
            System.out.println("Op��o:" + opcao);
            
            switch (opcao) {
            case 1:
            	calcularPA();
            	break;
            case 2:
            	calcularDistancia ();
            	break;
            case 3:    
                calcularMediaAritmetica();
                break;
            case 4: 
                calcularMediaPonderada();
                break;
            case 5:
                calcularMediaHarmonica();
                break;
            case 6:
                converterTemp();
                break;
            case 7:
                calcularVolume();
                break;
            case 8:
                calcularConsumo();
                break;
            case 9:
                calcularMontante();
                break;
            case -1:
            	System.out.println("Fim de execu��o");
            	continuar = false;
            	break;
            } 
        } while(continuar);
        
        
    } // --- Fim Main ---
    
        
        // Lista 01 - Ex 01
        /**
         * Operacao de tela para calculo da Prograssao Aritmetica
         */
        public static void calcularPA() {
            int a1 = Console.recuperaInteiro("Informe 1o termo: ");
            int n = Console.recuperaInteiro("Informe n-esimo termo: ");
            int r = Console.recuperaInteiro("Informe razao: ");
            double an = Exercicios.calcularPA(a1, n, r);
            System.out.println("A Progressao aritmetica e: " + an);
        }
    
    
    	// Lista 01 - Ex 02
    	/**
    	 * Opera��o de tela para c�lculo de dist�ncia entre dois pontos 
    	 */
    	public static void calcularDistancia () {
            int x1 = Console.recuperaInteiro("Informe x1: ");
            int x2 = Console.recuperaInteiro("Informe x2: ");
            int y1 = Console.recuperaInteiro("Informe y1: ");
            int y2 = Console.recuperaInteiro("Informe y2: ");
            double distancia = Exercicios.calcularDistancia(x1, y1, x2, y2);
            System.out.println("A distancia � -> " + distancia);
    	}
        
        
        // Lista 01 - Ex 03
        /**
         * Operacao de tela para calculo da media aritmetica
         */
        public static void calcularMediaAritmetica() {
            double n1 = Console.recuperaDecimal("Informe 1a nota: ");
            double n2 = Console.recuperaDecimal("Informe 2a nota");
            double n3 = Console.recuperaDecimal("Informe 3a nota");
            double med = Exercicios.calcularMediaAritmetica(n1, n2, n3);
            System.out.println("A Media Aritmetica e: " + med);
        }
        
    	
    	// Lista 01 - Ex 04
    	/**
    	 * Opera��o de tela para c�lculo da media ponderada
    	 */
    	public static void calcularMediaPonderada () {
            double np1 = Console.recuperaDecimal("Informe np1: ");
            double np2 = Console.recuperaDecimal("Informe np2: ");
            double np3 = Console.recuperaDecimal("Informe np3: ");
            double pp1 = Console.recuperaDecimal("Informe pp1: ");
            double pp2 = Console.recuperaDecimal("Informe pp2: ");
            double pp3 = Console.recuperaDecimal("Informe pp3: ");
            double ponderada = Exercicios.calcularMediaPonderada(np1, np2, np3, pp1, pp2, pp3);
            System.out.println("A Media Ponderada � -> " + ponderada);
    	}

        
    	// Lista 01 - Ex 05
        /**
         * Operacao de tela para calculo da media harmonica
         */
        public static void calcularMediaHarmonica() {
            double nh1 = Console.recuperaDecimal("Informe 1a nota: ");
            double nh2 = Console.recuperaDecimal("Informe 2a nota: ");
            double nh3 = Console.recuperaDecimal("Informe 3a nota: ");
            double mediaHarmonica = Exercicios.calcularMediaHarmonica(nh1, nh2, nh3);
            System.out.println("A Media Harmonica e: " + mediaHarmonica);
        }   
    
        
        // Lista 01 - Ex 06
        /**
         * Operacao de tela para conversao de temp Celsius em Farenheit
         */
        public static void converterTemp() {
            double tC = Console.recuperaDecimal("Informe temperatura em Celsius: ");
            double farenheit = Exercicios.converterTemp(tC);
            System.out.println("A temp em Farenheit e: " + farenheit);
        }
        
        
        // Lista 01 - Ex 07
        /**
         * Operacao de tela para calcula volume de um cilindro
         */
        public static void calcularVolume(){
            double raio = Console.recuperaDecimal("Informe raio: ");
            double altura = Console.recuperaDecimal("Informe altura: ");
            double volumeCilindro = Exercicios.calcularVolume(raio, altura);
            System.out.println("O Volume e: " + volumeCilindro);
        }
        
        
        // Lista 01 - Ex 08
        /**
         * Operacao de tela para calcular consumo do veiculo
         */
        public static void calcularConsumo(){
            double tempo = Console.recuperaDecimal("Informe tempo: ");
            double velocidade = Console.recuperaDecimal("Informe velocidade: ");
            double qtdLitros = Exercicios.calcularConsumo(tempo, velocidade);
            System.out.println("O Consumo/litro e: " + qtdLitros);
        }
        
        
        // Lista 01 - Ex 09
        /**
         * Operacao de tela para calcular valor com juros
         */
        public static void calcularMontante(){
            double valorEntrada = Console.recuperaDecimal("Informe entrada: ");
            double juros = Console.recuperaDecimal("Informe juros: ");
            double valorFinal = Exercicios.calcularMontante(valorEntrada, juros);
            System.out.println("O Valor final é: " + valorFinal);
        }
        
        
} // ------- Fim Classe ---------
