/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal02;

public class Principal02 {

    /**
     * Classe com o metodo main
     * @autor Regis Numata
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        calcularPesoIdeal();
        calcularBaskara();
        calcularPreco();
        calcularOperacao();
        
        
        
    } // -- Fim main --
    
    
	// Declaraçao dos metodos para operacao de tela
    
    
    // Lista 02 - Ex 01
    /**
     * Operacao de tela para calcular peso ideal
     */
    public static void calcularPesoIdeal(){
        String sexo = "F";
        double altura = 1.8;
        double pesoIdeal = Lista02.calcularPesoIdeal(sexo, altura);
        System.out.println("O Peso ideal e: " + pesoIdeal);
    }

    
    // Lista 02 - Ex 02
   /**
    * Operacao de tela para calcular baskara
    */
    public static void calcularBaskara() {
        double a = 1.0;
        double b = 12.0;
        double c = -13.0;
        double [] baskara = Lista02.calcularBaskara(a, b, c);
        System.out.println("A Raiz da equação e: " + baskara [0]);
    }
      
    
    // Lista 02 - Ex 03
    /**
     * Operacao de tela para calcular preco
     */
    public static void calcularPreco(){
        int condicao = 4;
        double preco = 100.0;
        double precoFinal = Lista02.calcularPreco(condicao, preco);
        System.out.println("O Valor final é de R$ " + precoFinal);
    }
    
    
    // Lista 02 - Ex 04
    /**
     * Operacao de tela para calcular operacao
     */
    public static void calcularOperacao() {
    	int operacao = 1;
    	double num1 = 10;
    	double num2 = 10;
    	double res = Lista02.calcularOperacao(operacao, num1, num2);
    	System.out.println("A Operacao e: " + res);
    }
    
    
    
    
} // -- Fim Classe -- 
