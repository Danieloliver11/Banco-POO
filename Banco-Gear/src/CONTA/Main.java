package CONTA;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char question1, cont = '.', pertalao;
		int mov = 0;
		int deposito;
		int saque;
		String niver;
		//String pegaresposta;
 
		ContaCorrente pessoa = new ContaCorrente();
		ContaEspecial ce = new ContaEspecial(mov, mov);
		do {
			System.out.println("[BANCO G-9]\n[SLOGAN]\n");
			System.out.println("1-CONTA POUPANÇA\n " 
			+ "2-CONTA CORRENTE\n " 
					+ "3-CONTA ESPECIAL\n "
					+ "4-CONTA EMPRESA\n " 
					+ "5-CONTA ESTUDANTIL\n " 
					+ "6-SAIR");
			question1 = leia.next().toUpperCase().charAt(0);

			// conta corrente
			if (question1 == '2') {
				while (cont != 'N') {
					System.out.println("[BANCO G-9]\n[SLOGAN]");
					System.out.println("\nCONTA[CONTA CORRENTE]\n");
					System.out.println("Saldo atual R$ " + pessoa.getSaldo());
					System.out.println("MOVIMENTOS-CREDITO " + pessoa.getMovimento());

					System.out.println("\nDeseja um talÃ£o? S/N ?");
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

			// Conta poupança
			if (question1 == '1') {
				while (cont != 'N') {
					System.out.println("[BANCO G-9]\n[SLOGAN]");
					System.out.println("\n CONTA[CONTA POUPANÇA] \n");		
					

						System.out.println("Para deposito digite a quantia aqui: ");
						deposito = leia.nextInt();
						ce.depositoBancario(deposito);

						System.out.println("Saldo atual: " + ce.getSaldoTotal() + "R$ \n");

						System.out.println("Para sacar digite a quantia aqui: ");
						saque = leia.nextInt();
						ce.saqueBancario(saque);

						System.out.println("Saldo atual: " + ce.getSaldoTotal() + "R$ \n");

						System.out.println("Para continuar, digite, s/n \n");
						String sair = leia.next();
						
						if(sair.equalsIgnoreCase("sim")) {
							break;
						}
						
						System.out.println("Para promoções informe o dia da criação da conta");
						System.out.println("Digite nesse modelo Dia/Mês/Ano");
						niver = leia.next();
						ce.aniversarioDaConta(niver);

						System.out.println("Saldo atual com o ajuste de 5%: " + ce.getSaldoTotal() + "R$ \n");
					
					System.out.println("MOVIMENTOS-CREDITO " + ce.getMovimento());
					System.out.println("\n Deseja um talão ? S/N ?");
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

		} while (mov != 6);

		System.out.println("CAIXA FECHADO!!!\n não esqueça de tirar o cartão da maquina!");
		leia.close();
	}

}
