package CONTA;

import java.util.Scanner;

public class SistemaCliente {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao;
		long x;
		System.out.print("\n Ola seja bem vindo ao Banco G9");
		do {
			System.out.print("\n-------------------//------------------");
			System.out.print("\nEntre com a opcao:");
			System.out.print("\n ----1: CONTA POUPANÇA");
			System.out.print("\n ----2: CONTA ESPECIAL");
			System.out.print("\n ----3: CONTA CORRENTE");
			System.out.print("\n ----4: CONTA EMPRESA");
			System.out.print("\n ----5: CONTA ESTUDANTIL");
			System.out.print("\n ----6: Sair do programa");
			System.out.print("\n ------------------//------------------");
			System.out.print("\n-> ");

			opcao = teclado.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("CONTA POUPANÇA");

				break;
			}
			case 2: {
				System.out.println("CONTA ESPECIAL");

				break;
			}
			case 3: {
				System.out.println("CONTA CORRENTE");
				//ContaCorrente cc =  new ContaCorrente(20, "Bruno", 150);
				//cc.credito(52);

				break;
			}
			case 4: {
				System.out.println("CONTA EMPRESA");
				break;
			}
			case 5: {
				System.out.println("CONTA ESTUDANTIL");

				break;
			}
			}
		} while (opcao != 6);
		System.out.println("Obrigado pela preferencia, volte sempre :)");
		System.exit(0);
		teclado.close();
	}
}
