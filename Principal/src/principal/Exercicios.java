
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.lang.Math;

/**
 * Data: 10/03/20 
 * Versão 1
 * @author regisnumata
 */
public class Exercicios {
    
    // Lista 01 - Ex 1
    int a1, n, r;
    /**
     *  Metodo que calcula a Progressão Aritmética
     * @param a1 é o 1o termo da PA
     * @param n é o n-ésimo termo
     * @param r é a razão
     * @return um valor inteiro
     */
    public static int calcularPA (int a1, int n, int r){
        int an = a1 + ( n - 1) * r;
        return an;
    }
    
    
    // Lista 01 - Ex 2
    int x1, y1, x2, y2;
    /**
     * Método que calcula a distância entre dois pontos
     * @param x1 parametro 1
     * @param y1 parametro 2
     * @param x2 parametro 3
     * @param y2 parametro 4
     * @return a raiz quadrada da soma dos quadrados da diferença
     */
    public static double calcularDistancia (int x1, int y1, int x2, int y2){
        double dist = Math.sqrt ( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }
    
    
    // Lista 01 - Ex 3
    double n1, n2, n3;
    /**
     * Metodo que recebe 3 notas de um aluno e calcula a media aritmetica
     * @param n1 primeira nota
     * @param n2 segunda nota
     * @param n3 terceira nota
     * @return um double com a media aritmetica
     */
    public static double calcularMediaAritmetica(double n1, double n2, double n3){
        double med = (n1 + n2 + n3)/3;
        return med;
    }
    
    
    // Lista 01 - EX 04
    double np1, np2, np3, pp1, pp2, pp3;
    /**
     * Método que recebe 3 notas e 3 pesos e calcula a media ponderada
     * @param np1 1a nota
     * @param np2 2a nota
     * @param np3 3a noa
     * @param pp1 peso 1a nota
     * @param pp2 peso 2a nota
     * @param pp3 peso 3a nota
     * @return um double como media ponderada
     */
    public static double calcularMediaPonderada(double np1,double np2,double np3,double pp1, double pp2,double pp3){
        double mediaPonderada = ((np1 * pp1) + (np2 * pp2) + (np3 * pp3))/(pp1 + pp2 + pp3);
        return mediaPonderada;
    }
    
    
    // Lista 01 - Ex 05
    double nh1, nh2, nh3;
    /**
     * Método que recebe 3 notas e calcula a media Harmonica
     * @param nh1 1a nota
     * @param nh2 2a nota
     * @param nh3 3a nota
     * @return um double como a media harmonica
     */
    public static double calcularMediaHarmonica (double nh1, double nh2, double nh3){
        double mediaHarmonica = 3/((1.0/nh1) + (1.0/nh2) + (1.0/nh3));
        return mediaHarmonica;
    }
    
    
    // Lista 01 - Ex 06
    double tC;
    /**
     * Método que converte temperatura em Celsius para Fahrenheit 
     * @param tC Temperatura em Celsius
     * @return um double com a temperatura em Fahrenheit
     */
    public static double converterTemp (double tC){
        double farenheit = (9 * tC + 160)/5;
        return farenheit;
    }
    
    
    // Lista 01 - Ex 07
    double raio, altura;
    /**
     * Método para calcular o volme de um cilindro
     * @param raio do cilindro
     * @param altura do cilindro
     * @return um double com o volume
     */
    public static double calcularVolume (double raio, double altura){
        double volumeCilindro = (3.14 * Math.pow(raio, 2) * altura);
        return volumeCilindro;
    }
    
    
    // Lista 01 - Ex 08
    double tempo, velocidade;
    /**
     * Método para calcular o consumo em litros de um veiculo
     * Sendo 12 uma constante de consumo/litro
     * @param tempo tempo da viagem
     * @param velocidade velocidade media da viagem
     * @return um double com o consumo em litros
     */
    public static double calcularConsumo (double tempo, double velocidade){
        double qtdLitros = (velocidade / tempo) / 12;
        return qtdLitros;
    }
    
    
    // Lista 01 - Ex 09
    double valorEntrada, juros;
    /**
     * Metodo para acrescentar juros ao valor de entrada
     * @param valorEntrada valor de entrada
     * @param juros juros para acrescimo
     * @return um double com o valor de entrada + juros.
     */
    public static double calcularMontate ( double valorEntrada, double juros){
        double valorFinal = valorEntrada + ( valorEntrada * ( juros / 100.0));
        return valorFinal;
    }
    
    
    
    
}
