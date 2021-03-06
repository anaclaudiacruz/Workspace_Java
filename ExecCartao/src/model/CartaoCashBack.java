package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;
	
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao,nomeTitular,anoValidade,mesValidade,saldo);
		this.tipo = tipo;		
    }

	public String toString() {
	    return "Cartao Caskback: "+numeroCartao+"/"+nomeTitular+"/"+anoValidade+"/"+mesValidade+"  R$ "+saldo;
	}
	

	public boolean comprar(double valor) {
		if (valor <= 0) {
			throw new IsiException("O valor da compra n�o pode ser zero ou negativo!");
		}
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			
			switch(tipo) {
			case 1:
				   this.saldo = this.saldo + (valor * 0.02);
				   break;
			case 2:
				   this.saldo = this.saldo + (valor * 0.05);
				   break;
			case 3:
				   this.saldo = this.saldo + (valor * 0.08);
				   break;
			}
			
/*			if (this.tipo == 1) {
			   this.saldo = this.saldo + (valor * 0.02); 
			} else if (this.tipo == 2) {
			   this.saldo = this.saldo + (valor * 0.05);
			} else if (this.tipo == 3) {
			   this.saldo = this.saldo + (valor * 0.08);
			} */
			
			return true;
		} else {
			return false;
	    }	
	}

}
