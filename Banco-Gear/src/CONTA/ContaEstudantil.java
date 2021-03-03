package CONTA;

public class ContaEstudantil extends Conta {
		private double limiteEstudantil;

		public ContaEstudantil(int numero, String cpf, boolean ativa, double limiteEstudantil) {
			super(numero, cpf, ativa);
			this.limiteEstudantil = limiteEstudantil;
		}

		public double getLimiteEstudantil() {
			return limiteEstudantil;
		}

		public void setLimiteEstudantil(double limiteEstudantil) {
			this.limiteEstudantil = limiteEstudantil;
		}	
}
