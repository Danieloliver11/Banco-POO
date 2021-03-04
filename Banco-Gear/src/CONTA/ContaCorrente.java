package CONTA;

public class ContaCorrente extends Conta {
	private int contadorTalao = 3;
	private int movimento = 10;

	public ContaCorrente() {

	}

	public ContaCorrente(int contadorTalao, int movimento) {
		super();
		this.contadorTalao = contadorTalao;
		this.movimento = movimento;
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	void setContadorTalao() {
		if (contadorTalao <= 0) {
			System.out.println("Desculpe você não tem mais talão para ser usado!");
		} else {
			this.contadorTalao = this.contadorTalao - 1;
			System.out.println("Você solicitou um talão.\nVocê tem " + contadorTalao + " Talões restantes");
		}
	}

	// movimentos
	public int getMovimento() {
		return movimento;
	}

	void setMovimento() {
		this.movimento = movimento - 1;

		if (movimento <= 0) {
			System.out.println("Suas movimentações diarias acabaram! ");

		}
	}
	/*
	 * Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja
	 * solicitar cheque, limitando em apenas 3 cheques.
	 * 
	 * public int movimentos() { int movimento = 10; return movimento; }
	 */

}
