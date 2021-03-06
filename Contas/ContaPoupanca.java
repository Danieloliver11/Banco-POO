//	Bruno
package Contas;
	
	public class ContaPoupanca extends Conta{
	
		    int diaAniversarioConta = 5;
		    double saldoAtualizado;
		 
		    public ContaPoupanca() {
	
		     }
	
		    public ContaPoupanca(int numero, String cpf) {
		        super();
		     }
	
		    public ContaPoupanca(int diaAniversarioConta) {
		        super();
		        this.diaAniversarioConta = diaAniversarioConta;
		      }
		    @Override
		    public void debito(double valor) {
				if (valor >= this.saldo) {
					this.saldo = this.saldo - valor;
				} else {
					System.out.println("Você não tem saldo suficiente!");
				}
			}
		    
		    public void saqueBancario(int saque) {
                if (saque < getSaldo()) {
                    System.out.println("O seu saque de: " + saque + " foi efetuado com sucesso");
                    saldoAtualizado = getSaldo() - saque;

                } else {
                    System.err.println("Saque maior que saldo total.");
                }

                if (saque == getSaldo()) {
                    System.out.println("O seu saque de: " + saque + " foi efetuado com sucesso");
                    saldoAtualizado = getSaldo() - saque;
                }
            }

            public void correcao(int niverDaConta) {
                if (diaAniversarioConta == niverDaConta) {
                    System.out.println("-------> Parabéns o ajuste foi dado em 5%.");
                    String texto = "-------> O seu novo saldo R$:  ";
                    System.out.println(texto + (((saldoAtualizado*0.05)) + saldoAtualizado) +"R$");

                } else {
                    System.err.println("-------> A data não bate, deixou de ganhar 5%.");
                }
            }
        }