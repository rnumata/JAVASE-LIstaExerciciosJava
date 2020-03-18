/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal02;

import java.util.ArrayList;

public class Principal02 {

    /**
     * Classe com o metodo main
     * @autor Regis Numata
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // Menu Principal
        String [] menuPrincipal = {
            " Exercicios 1 a 12 ",
            " Exercicio 13",
            " Sair"
        };
       
        int opcao = Lista02.opcaoMenu(menuPrincipal);
        // Fim Menu Principal
        
        // if do Menu Principal
        if (opcao == 1) {
            
            // variavel opcoes do tipo array de string
            String [] opcoes = {
                "Peso Ideal",
                "Equacao 2o grau",
                "Pagamento",
                "Calculadora",
                "Triangulo",
                "Fatorial",
                "Numeros perfeitos",
                "Numeros Primos",
                "Fibonacci",
                "Conversao de bases",
                "Sequencia 1",
                "Sequencia 2",
                "Par - Impar",
            };


            boolean continuar = true;

            do {
                System.out.println("\n");
                int opcaoescolhida = Console.mostrarMenu(opcoes, "Lista de opcoes");
                System.out.println("Opção ->" + opcaoescolhida);

                switch(opcaoescolhida){
                    case 1:
                        calcularPesoIdeal();
                        break;
                    case 2:
                        calcularBaskara();
                        break;
                    case 3:
                        calcularPreco();
                        break;
                    case 4:
                        calcularOperacao();
                        break;
                    case 5:
                        calcularTriangulo();
                        break;
                    case 6:
                        calcularFatorial();
                        break;
                    case 7:
                        calcularNumPerfeito();
                        break;
                    case 8:
                        calcularNumPrimo();
                        break;
                    case 9:
                        calcularFibonacci();
                        break;
                    case 10:
                        calcularBase8();
                        break;
                    case 11:
                        calcularSeq1();
                        break;
                    case 12:
                        calcularSeq2();
                        break;
                    case 13:
                        //
                        break;
                    case -1:
                        System.out.println("Fim de execução");
                        continuar = false;
                }
            } while (continuar);
        
        } else if (opcao == 2) {
            
            String [] menuExercicio13 = {
                "Digitar um numero ímpar",
                "Digitar um numero par",
                "Sair"
            };
            
            int [] list = Lista02.parOuImpar(menuExercicio13);
            System.out.println("Total de Impar ->" + list[0]);
            System.out.println("Total de Par ->" + list[1]);
           
        } else {
            System.out.println("Fim de execuçao");
            
        } // Fim do if do Menu Principal
        
        
        
    } // -- Fim main --
    
    
    // Declaraçao dos metodos para operacao de tela
    
    // Lista 02 - Ex 01
    /**
     * Operacao de tela para calcular peso ideal
     */
    public static void calcularPesoIdeal(){
        String sexo = Console.recuperaTexto("Informe F ou M: ");
        double altura = Console.recuperaDecimal("Informe a altura: ");
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
    
    
    // Lista 02 - Ex 05
    /**
     * Operacao de tela para verificar se coordanadas formam um triangulo e qual tipo
     */
    public static void calcularTriangulo() {
        double x1 = Console.recuperaDecimal("Informe X1");
        double y1 = Console.recuperaDecimal("Informe Y1");
        double x2 = Console.recuperaDecimal("Informe X2");
        double y2 = Console.recuperaDecimal("Informe Y2");
        double x3 = Console.recuperaDecimal("Informe X3");
        double y3 = Console.recuperaDecimal("Infome Y3");
        String resultado = Lista02.calcularTriangulo(x1, y1, x2, y2, x3, y3);
        System.out.println("O Resultado e: " + resultado);
    }
    
    
    // Lista 02 - Ex 06
    /**
     * Operacao de tela para calcular o fatorial de um numero
     */
    public static void calcularFatorial() {
        int fat = Console.recuperaInteiro("Informe o numero: ");
        System.out.println("Fatorial ->" + Lista02.calcularFatorial(fat));
    }

    
    // Lista 02 - Ex 07
    /**
     * Operacao de tela para calcular numero perfeito
     */
    public static void calcularNumPerfeito() {
        int numero = Console.recuperaInteiro("Informar numero: ");
        System.out.println("A Soma dos divisores e: " + Lista02.calcularNumPerfeito(numero));
    }
    
    
    // Lista 02 - Ex 08
    /**
     * Operacao de tela para verificar se um numero eh primo
     */
    public static void calcularNumPrimo() {
        int numero = Console.recuperaInteiro("Informe numero: ");
        System.out.println("O Numero eh: " + Lista02.calcularNumPrimo(numero));
    }
    
    
    // Lista 02 - Ex 09
    /**
     * Operacao de tela para mostrar a sequencia de Fibonacci
     */
    public static void calcularFibonacci() {
        int numero = Console.recuperaInteiro("Infome o numero: ");
        System.out.println("O Fibonacci e: " + Lista02.calcularFibonacci(numero));
    }
    
    
    // Lista 02 - Ex 10
    /**
     * Operacao de tela para mostrar sequencia dos restos das divisoes
     */
    public static void calcularBase8() {
        int numero = Console.recuperaInteiro("Informar um numero: ");
        System.out.println("A conversao em base 8 e:  " + Lista02.calcularBase8(numero));
    }
    
    
    // Lista 02 - Ex 11
    /**
     * Operacao de tela para mostrar uma sequencia de um numero repetido cfe a sua qtde.
     */
    public static void calcularSeq1() {
        int numero = Console.recuperaInteiro("Informe um numero: ");
        System.out.println("A Sequencia eh: " + Lista02.calcularSeq1(numero));
    }
    
    
    // Lista 02 - Ex 12
    /**
     * Operacao de tela para mostrar uma sequencia crescente e repetidamente conforme sua qtde
     */
    public static void calcularSeq2() {
        int numero = Console.recuperaInteiro("Informe o numero: ");
        System.out.println("A Sequencia eh: " + Lista02.calcularSeq2(numero));
    }

    
    // Lista 02 - Ex 13
    
 
    
    
    
    
    
    
} // -- Fim Classe -- 
