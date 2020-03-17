/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal02;

import java.util.ArrayList;
import java.util.Arrays;

        


/**
 * Data 13/03/20
 * Versão 1
 * @author regisnumata
 */


public class Lista02 {
    
    
    // Lista 02 - Ex 01
    /**
     * Metodo para calcular o peso ideal Masc e Fem.
     * @param sexo parâmetro se 'F'ou'M'
     * @param altura parâmetro altura da pessoa
     * @return um double com o peso ideal conforme genero
     */
    public static double calcularPesoIdeal (String sexo, double altura){
        if ( sexo.equalsIgnoreCase("F") ) {
            return (62.1 * altura) - 44.7;
        } else {
            return (72.7 * altura) - 58;
        }
    }
    
    
    // Lista 02 - Ex 02
    double a, b, c, delta;
    /**
     * Metodo para calcular Baskara.
     * @param a coeficiente angular
     * @param b coeficiente linear
     * @param c coeficiente constante
     * @return duas raizes reais e diferentes
     */
    /*
    public static double calcularBaskara (double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;  
        return (-b - (Math.sqrt(delta))) / (2 * a);
    }*/
    
    public static double[] calcularBaskara (double a, double b, double c) {
    	// Calculo de Delta
    	double delta = Math.pow(b, 2) - 4 * a * c;
    	
    	// Verificando se nao existem raizes reais
    	if (delta < 0) {
    		double [] semraizesreais = {}; //retorna um array vazio {}
    		return semraizesreais;
    	}
    	// Verificando se existe aoenas uma raiz real
     	if (delta == 0) {
     		double x1 = -b / 2 * a;
     		double [] umaraizreal = {x1};
     		return umaraizreal;
    	}
     	// Verificando se existem duas raizes reais
       		double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
     		double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
     		double [] duasraizesreais = {x1, x2};
     		return duasraizesreais;  	
    }
    
    
    // Lista 02 - Ex 03
    double preco;
    int condicao;
    /**
     * Metodo para calcular o preco final
     * @param condicao parametro da condicao de pagamento
     * @param preco parametro do preco do produto
     * @return um double preco
     */
    public static double calcularPreco (int condicao, double preco){
    	
        switch (condicao) {
            case 1:
                preco = preco * 0.9;
                break;
            case 2:
                preco = preco * 0.95;
                break;
            case 3:
                preco = preco;
                break;
            case 4:
                preco = preco * 1.10;
                break;
        }
        return preco;
    }
    
    
    // Lista 02 - Ex 04
    /**
     * Metodo para calcular uma operacao aritmetica de dois termos
     * @param operacao parametro da opercacao aritmetica
     * @param num1 1o termo
     * @param num2 2o termo
     * @return um double com o resultado
     */
    public static double calcularOperacao(int operacao, double num1, double num2) {
    	double res = 0;
    	switch(operacao) {
    	case 1:
    		res = num1 + num2;
    		break;
    	case 2:
    		res = num1 - num2;
    		break;
    	case 3:
    		res = num1 * num2;
    		break;
    	case 4:
    		res = num1 / num2;
    		break;
    	}
    	return res;
    }
    
    
    // Lista 02 - Ex 05
    /**
     * Metodo que calcula duas hipotenusas para ter dois lados do triangulo. Terceiro lado é a base.
     * @param x1 coordenada x1
     * @param y1 coordenada y1
     * @param x2 coordenada x2
     * @param y2 coordenada y2
     * @param x3 coordenada x3
     * @param y3 coordenada y3
     * @return retorna uma String com o resultado se eh um triangulo e qual triangulo
     */
    public static String calcularTriangulo (double x1, double y1, double x2, double y2, double x3, double y3){
        double lado1 = Math.sqrt((Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2)));
        double lado2 = Math.sqrt((Math.pow(y2 - y3, 2) + Math.pow(x3 - x2, 2)));
        double lado3 = x3 - x1;
        
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {  // if verifica se é triangulo
                if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
                return "Triangulo Equilatero";
                } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                    return "Triangulo Isoceles";
                } else {
                    return "Triangulo escaleno";
                }
        } else {
            return "Não eh um triangulo";
        }
    }
    
    
    // Lista 02 - Ex 06
    /**
     * Metodo que calcula o fatorial de um numero
     * @param fat valor a ser calculado o fatorial
     * @return um int com o fatorial
     */
    public static int calcularFatorial (int fat){
        int acum = 1;
        for (int i = 1; i <= fat; i++) {
            acum = acum * i;
        }
        return acum;
    }
    
    
    // Lista 02 - Ex 07
    /**
     * Metodo recebe um numero do usuario.Se o resto da divisao pelo i for 0 soma o i na variavel acum.  
     * @param numero inteiro informado pelo usuario
     * @return um inteiro com o valor do acum
     */
    public static int calcularNumPerfeito (int numero){
        int acum = 0;
        for (int i = 1; i < numero; i++) {
            int res = numero % i;
            if (res == 0) {
                acum = acum + i;
            }
        }
        return acum;
    }
    
    
    // Lista 02 - Ex 08
    /**
     * Metodo recebe um int do usuario. Se resto da divisao por i eh zero acumula no acum. Se o acum for maior que 2 significa que nao eh primo.
     * @param numero
     * @return 
     */
    public static String calcularNumPrimo (int numero){
        int acum = 0;
        String resultado = "Primo";
        for (int i = 1; i <= numero; i++) {
            int res = numero % i;
            if (res == 0) {
                acum = acum + 1;
                if (acum == 2) {
                    resultado = "Primo";
                } else {
                    resultado = "NAO primo";
                }
            }
        }
        return resultado;
    }
    
    
    // Lista 02 - Ex 09
    /**
     * Metodo instancia uma ArrayList e popula com o metodo .add()
     * @param numero valor para o total do loop
     * @return um ArrayList com a sequencia fibonacci
     */
     public static ArrayList calcularFibonacci (int numero){
        ArrayList fibo = new ArrayList();
        int atual = 0;
        int anterior = 0;
         for (int i = 1 ; i < numero; i++) {
             if (i == 1) {
                 atual = 1;
                 anterior = 0;
                 fibo.add(atual);
             } else {
                 atual = atual + anterior;
                 anterior = atual - anterior;
                 fibo.add(atual);
             }
         }
        return fibo;
    }
    
     
    // Lista 02 - Ex 10     !!! NAO CONSEGUI ORDENAR O ARRAYLIST DE TRÁS PARA FRENTE  !!!
     
    public static ArrayList calcularBase8 (int numero){
        ArrayList base = new ArrayList(); // instanciacao do array de nome base
        int quociente = 1, resto; // variavel para entrar no while
        while (quociente > 0){
            quociente = numero / 8;
            resto = numero % 8;
            base.add(resto);
            numero = quociente;
        }
        return base;
    } 
     
     
    // Lista 02 - Ex 11
    /**
     * Metodo recebe int numero para definir qtde de for.Segundo for eh para popular o ArrayList repetidamente cfe o valor de i
     * @param numero valor que define a qdte do loop
     * @return um ArrayList populado
     */
    public static ArrayList calcularSeq1 (int numero){
        ArrayList seq = new ArrayList();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                seq.add(i);
            }
        }
        return seq;
    }
    
    
    // Lista 02 - Ex 12
    
    public static ArrayList calcularSeq2 (int numero){
        ArrayList seq = new ArrayList();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                seq.add(j);
            }
        }
        return seq;
    }
    
    
    
    
    
} // Fim Classe
