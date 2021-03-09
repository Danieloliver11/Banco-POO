// Douglas//
package Contas;

public class ContaEmpresa extends Conta {
	
	private double emprestimoEmpresa = 10000;
	 private int movimento = 10;
	
	

	public ContaEmpresa(double emprestimoEmpresa,int movimento){
		super();
		this.emprestimoEmpresa = emprestimoEmpresa;
		this.movimento = movimento;
	}
	
	
	
	
	
		public ContaEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}





	public ContaEmpresa(int numero, String cpf, double saldo, boolean ativa) {
		super(numero, cpf, saldo, ativa);
		// TODO Auto-generated constructor stub
	}





	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}





		public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}




	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	




		public void setMovimento(int movimento) {
		this.movimento = movimento;
	}
		
		@Override
		public void debito(double valor) {
			if (this.saldo>=valor) {
				this.saldo = this.saldo - valor;
			} else if (valor>saldo) {
				System.out.println("VOCÊ NÃO TEM SALDO PARA ESSA OPERAÇÃO.\n");
			}
		}
	  @Override
	  public void credito(double credito) {
			this.saldo = saldo + credito;
		}


	
	public void limite(double credito) {
		if (credito <= emprestimoEmpresa) {
			emprestimoEmpresa = (emprestimoEmpresa - credito);	
			saldo = (this.saldo + credito);						
		} else if (credito> emprestimoEmpresa) {
			System.out.println("ESSE VALOR EXCEDE SEU LIMITE DE CREDITO!\n");
		}
	}
	
	  
	
	public int getMovimento() {
        return movimento;
    }
	
    void setMovimento() {
        this.movimento = movimento - 1;

        if (movimento <= 0) {
            System.out.println("Suas movimentações diarias acabaram! ");

        }
    }
}
