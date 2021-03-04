package CONTA;

public class Conta {

	private int id;
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
<<<<<<< HEAD

	public Conta(int numero, String cpf, int id) {
		super();
=======
	
	public Conta(String cpf) {
		super(); //?
>>>>>>> 555053b604ecf6dc6a36c8c5e8634fecb60c17e9
		this.numero = numero;
		this.cpf = cpf;
		this.id = id;
	}
<<<<<<< HEAD

	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}
=======
	
	//sobrecarga
	public Conta(int numero,String cpf,int saldo) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		
		}

	
	public Conta(int numero,String cpf,boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
		}
>>>>>>> 555053b604ecf6dc6a36c8c5e8634fecb60c17e9

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

<<<<<<< HEAD
	public double getSaldo() {
		return saldo;
	}

	/*
	 * public void setSaldo(double saldo) { this.saldo = saldo; }
	 */
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void debito(double valor) {
		if (valor >= this.saldo) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Você não tem saldo suficiente!");
		}
	}
}
=======
	/////////////
	//emcapsulamento/ proteção de dados 
	//mostra
	public int getNumero() {
		return numero;
	}//altera
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		
		this.ativa = ativa;
	}
		///////////////
	
	
	
	
	
	//metodo +
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	// -
	public void debito(double valor) {
		if(valor >=this.saldo) {
		this.saldo = this.saldo - valor;
		}else {System.out.println("Você não tem saldo suficiente!");
			}
	}
}

>>>>>>> 555053b604ecf6dc6a36c8c5e8634fecb60c17e9
