package CONTA;

public class ContaCorrente extends Conta {
	private int contadorTalao = 3;
	
	public ContaCorrente(int contadorTalao,String cpf) {
		super(cpf);
		this.contadorTalao = contadorTalao;
	}
	
	
	public int getContadorTalao (){
		return contadorTalao;
	}	
	
	void setContadorTalao() {
		this.contadorTalao = contadorTalao;
	}
}
