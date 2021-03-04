package Pessoas;

import java.util.Scanner;

public class Cliende {
	public static void main(String[] args) {

		int saldo;
		int deposito;
		int saque;
		int consultaDeJuros;
		int sair;

		try {
			while (true) {
				Scanner teclado = new Scanner(System.in);

				System.out.println("BEM VINDO AO BANCO G9");

				System.out.println("Digite 1 para ver sua conta poupança");
				saldo = teclado.nextInt();

				System.out.println("Digite 2 para conta especial");
				deposito = teclado.nextInt();

				System.out.println("Digite 3 para conta corrente");
				saque = teclado.nextInt();

				System.out.println("Digite 4 para conta empresa");
				consultaDeJuros = teclado.nextInt();

				System.out.println("Digite 5 para conta estudantil");
				sair = teclado.nextInt();

				if (sair == 0) {
					System.out.println("Tenha uma boa tarde");
					break;
				}
			}

		} catch (Exception e) {
			System.err.println("ERRO NO SISTEMA");
		}
	}
}
