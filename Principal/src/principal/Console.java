package principal;

import java.util.Scanner;


/**
 * Classe específica para realizar operações de entrada e saída de dados no
 * Console.
 * 
 * @author Andre Pimenta
 * 
 */
public class Console {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Método para monstar menu para seleção de opções.
	 * 
	 * @param opcoes
	 * @param titulo
	 * @return A opção escolhida no menu pelo usuário. Exemplo: se o usuário escolher a opção 1, o método retornará o inteiro 1. Se o usuário escolher a opção 5, o método retornará 5.
	 */
	public static int mostrarMenu(String[] opcoes, String titulo) {
		int opcaoEscolhida = 0;
		if (titulo == null) {
			System.out.println("Por favor selecione uma opção:");
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
					"Você selecionou um opção inválida, por favor tente novamente.");
		}
		return opcaoEscolhida;
	}

	/**
	 * Método específico para realizar a captura de dados decimais no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usuário.
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
	 * Método específico para realizar a captura de dados inteiros no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usuário.
	 * @return um valor inteiro informado pelo usuário.
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
	 * Método específico para realizar a captura de dados texto no console.
	 * 
	 * @param descricao
	 *            textual do valor a ser informado pelo usuário.
	 * @return um texto informado pelo usuário.
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
