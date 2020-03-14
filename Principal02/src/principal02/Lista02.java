/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal02;


/**
 * Data 13/03/20
 * Versão 1
 * @author regisnumata
 */


public class Lista02 {
    
    
    // Lista 02 - Ex 01
    double altura;
    char sexo;
    /**
     * Metodo para calcular o peso ideal Masc e Fem.
     * @param sexo parâmetro se 'F'ou'M'
     * @param altura parâmetro altura da pessoa
     * @return um double com o peso ideal conforme genero
     */
    public static double calcularPesoIdeal (String sexo, double altura){
        if ( sexo.equals("F") ) {
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
    
    
    
    
    
    
}
