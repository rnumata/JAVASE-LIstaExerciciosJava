/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author regisnumata
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Lista 01 - Ex 01
        System.out.println("A Progressão aritmética é:  "+ Exercicios.calcularPA(10, 7, 3));
        
       
        // Lista 01 - Ex 02
        System.out.println("A distância é de: " + Exercicios.calcularDistancia(0, 5, 10, 20));
        
        
        // Lista 01 - Ex 03
        System.out.println("A Media aritmética é: " + Exercicios.calcularMediaAritmetica(10.0, 5.5, 8.0));
        
        
        // Lista 01 - Ex 04
        System.out.println("A Media Ponderada é: " + Exercicios.calcularMediaPonderada(10.0, 5.5, 8.0, 5.0, 3.0, 2.0));
        
        
        // Lista 01 - Ex 05
        System.out.println("A Media Harmonica é: " + Exercicios.calcularMediaHarmonica(10.0, 5.5, 8.0));
        
        
        // Lista 01 - Ex 06
        System.out.println("A conversão de Celsius para Farenheit é: " + Exercicios.converterTemp(30));
        
      
        // Lista 01 - Ex 07
        System.out.println("O Volume do cilindro é: " + Exercicios.calcularVolume(10, 15));
        
        
        // Lista 01 - Ex 08
        System.out.println("O Consumo da viagem foi de: " + Exercicios.calcularConsumo(1.0, 12.0) + " litro");
        
        
        // Lista 01 - Ex 09
        System.out.println("O Valor com acrescimo é: " + Exercicios.calcularMontate(100.0, 15.0));
        
    }
    
}
