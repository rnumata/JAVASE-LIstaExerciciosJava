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
        
        
        
        
    } // -- Fim main --
    
    
    // Declaraçao dos metodos para operacao de tela
    
    
    // Lista 02 - Ex 01
    /**
     * Operacao de tela para calcular peso ideal
     */
    public static void calcularPesoIdeal(){
        char sexo = 'F';
        double altura = 1.7;
        double pesoIdeal = Lista02.calcularPesoIdeal(sexo, altura);
        System.out.println("O Peso ideal para o sexo " + sexo + " é: " + altura);
    }

    
    // Lista 02 - Ex 02
   /**
    * Operacao de tela para calcular baskara
    */
    public static void calcularBaskara() {
        double a = 1.0;
        double b = 12.0;
        double c = -13.0;
        double baskara = Lista02.calcularBaskara(a, b, c);
        System.out.println("A Raiz da equação e: " + baskara);
    }
      
    
    // Lista 02 - Ex 03
    
    public static void calcularPreco(){
        int condicao = 4;
        double preco = 10.0;
        double precoFinal = Lista02.calcularPreco(condicao, preco);
        System.out.println("O Valor final é de R$ " + precoFinal);
    }
    
    
    
    
    
} // -- Fim Classe -- 
