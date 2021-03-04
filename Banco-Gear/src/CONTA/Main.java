package CONTA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char question1, cont = '.', pertalao;
		int mov = 0;

		ContaCorrente pessoa = new ContaCorrente();
		do {
			System.out.println("[BANCO G-9]\n[SLOGAN]\n");
			System.out.println(
					"1-CONTA POUPANÇA\n2-CONTA CORRENTE\n3-CONTA ESPECIAL\n4-CONTA EMPRESA\n5-CONTA ESTUDANTIL\n6-SAIR");
			question1 = leia.next().toUpperCase().charAt(0);

			// conta corrente
			if (question1 == '2') {
				while (cont != 'N') {
					System.out.println("[BANCO G-9]\n[SLOGAN]");
					System.out.println("\nCONTA[CONTA CORRENTE]\n");
					System.out.println("Saldo atual R$ " + pessoa.getSaldo());
					System.out.println("MOVIMENTOS-CREDITO " + pessoa.getMovimento());

					System.out.println("\nDeseja um talão? S/N ?");
					pertalao = leia.next().toUpperCase().charAt(0);
					if (pertalao == 'S') {
						pessoa.setContadorTalao();
						pessoa.setMovimento();
					}

					System.out.println("Continuar S/N ?");
					cont = leia.next().toUpperCase().charAt(0);
				}
			} else if (question1 == '6') {
				mov = 2;
			}

		} while (mov != 2);

		System.out.println("CAIXA FECHADO!!!\nNão esqueça de tirar o cartão da maquina!");

		/*
		 * ContaCorrente pessoa = new ContaCorrente(1111,"000.000.000",1000);
		 * System.out.println(pessoa.getContadorTalao()); pessoa.setContadorTalao();
		 * pessoa.setContadorTalao();
		 * 
		 * 
		 * pessoa.setContadorTalao(); pessoa.setContadorTalao();
		 */

	}

}
