package Pessoas;

import javax.swing.JOptionPane;

public class SistemaCliente {

	public static String msg, titulo;
	public static String[] simNao = { "Sim", "Não" };
	public static int naoSim;
	public static String[] opcao = { "Conta poupança", "Conta especial", "Conta corrente", 
			                         "Conta empresa", "Conta estudantil","Sair" };
	public static int Opcao;

	public static void main(String[] args) {

		msg = "Generation Brasil";
		titulo = "Sistema Banco G9";

		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);

		do { 

			msg = "Selecione o botão da opção desejada";
			Opcao = JOptionPane.showOptionDialog(null, msg, titulo, 1, 
					JOptionPane.QUESTION_MESSAGE, null, opcao, null);

			switch(Opcao) {
			case 0:

				System.out.println("CONTA POUPANÇA");
				break;

			case 1:
				System.out.println("CONTA ESPECIAL");
				break;

			case 2:
				System.out.println("CONTA CORRENTE");
				break;

			case 3:
				System.out.println("CONTA EMPRESA");
				break;
				
			case 4:
				System.out.println("CONTA ESTUDANTIL");
				break;
				
			case 5:
				msg = "Deseja sair ?";

				naoSim =  JOptionPane.showOptionDialog(null, msg, titulo, 1, 
						JOptionPane.QUESTION_MESSAGE, null, simNao, null);

				if(naoSim == 1) 
					Opcao =- 1;
				System.out.println("Volte sempre, e obrigado pela preferência");
				break;
			}
		} while(Opcao != 5);
		System.exit(0);
	}
}


