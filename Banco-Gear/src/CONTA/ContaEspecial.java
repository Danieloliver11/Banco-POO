package CONTA;

public class ContaEspecial extends Conta {

	int saldoInicial = 0;
	int movimento = 10;
	int saldoTotal = 0;
	int saque = 0;
	String niverDaContaPoupanca = "05/01/1991";

	public ContaEspecial(int saldoInicial, int movimento) {
		super();
		this.saldoInicial = saldoInicial;
		this.movimento = movimento;
	}

	public int getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public int getMovimento() {
		return movimento;
	}

	public void setMovimento(int movimento) {
		this.movimento = movimento;
	}

	public int getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(int saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void depositoBancario(int deposito) {
		this.saldoTotal = saldoTotal + deposito;
	}

	public void saqueBancario(int saque) {
		if (saque < saldoTotal) {
			saldoTotal = saldoTotal - saque;
			
		} else {
			System.err.println("Saque maior que saldo total");
		}

		if (saque == saldoTotal) {
			saque = saldoTotal - saque;
		}
	}

	public void aniversarioDaConta(String niverDaConta) {
		
		if(niverDaContaPoupanca.equalsIgnoreCase(niverDaConta)) {
			saldoTotal = (saldoTotal*5/100) + saldoTotal;
		} else {
			System.err.println("A data não bate, deixou de ganhar 5%");
		}
	}
}
