package principal02;

import java.util.Scanner;


/**
 * Classe espec�fica para realizar opera��es de entrada e sa�da de dados no
 * Console.
 * 
 * @author Andre Pimenta
 * 
 */
public class Console {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * M�todo para monstar menu para sele��o de op��es.
	 * 
	 * @param opcoes
	 * @param titulo
	 * @return A op��o escolhida no menu pelo usu�rio. Exemplo: se o usu�rio escolher a op��o 1, o m�todo retornar� o inteiro 1. Se o usu�rio escolher a op��o 5, o m�todo retornar� 5.
	 */
	public static int mostrarMenu(String[] opcoes, String titulo) {
		int opcaoEscolhida = 0;
		if (titulo == null) {
			System.out.println("Por favor selecione uma op��o:");
		} else {
			System.out.println(titulo);
		}

		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(i + 1 + ") " + opcoes[i]);
		}
		System.out.println(opcoes.length + 1 + ") Para sair.");
		try {
			opcaoEscolhida = scanner.nextInt();
			if (opcaoEscolhida == opcoes.length + 1) {
				return -1;
			}
		} catch (Exception e) {
			scanner.nextLine();
			opcaoEscolhida = mostrarMenu(opcoes,
					"Voc� selecionou um op��o inv�lida, por favor tente novamente.");
		}
		return opcaoEscolhida;
	}

	/**
	 * M�todo espec�fico para realizar a captura de dados decimais no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usu�rio.
	 * @return um valor decimal informado pelo usuario.
	 */
	public static double recuperaDecimal(String descricao) {
		double valor;
		if (descricao == null) {
			System.out.println("Entre com valor decimal:");
		} else {
			System.out.println(descricao);
		}
		try {
			scanner = new Scanner(System.in);
			valor = scanner.nextDouble();
		} catch (Exception e) {
			scanner.nextLine();
			valor = recuperaDecimal(descricao);
		}
		return valor;
	}

	/**
	 * M�todo espec�fico para realizar a captura de dados inteiros no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usu�rio.
	 * @return um valor inteiro informado pelo usu�rio.
	 */
	public static int recuperaInteiro(String descricao) {
		int valor;
		if (descricao == null) {
			System.out.println("Entre com valor inteiro:");
		} else {
			System.out.println(descricao);
		}
		try {
			valor = scanner.nextInt();
		} catch (Exception e) {
			scanner.nextLine();
			valor = recuperaInteiro(descricao);
		}
		return valor;
	}

	/**
	 * M�todo espec�fico para realizar a captura de dados texto no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usu�rio.
	 * @return um texto informado pelo usu�rio.
	 */
	public static String recuperaTexto(String descricao) {
		String valor;
		if (descricao == null) {
			System.out.println("Entre com valor:");
		} else {
			System.out.println(descricao);
		}
		try {
			valor = scanner.next();
		} catch (Exception e) {
			valor = recuperaTexto(descricao);
		}
		return valor;
	}

}
