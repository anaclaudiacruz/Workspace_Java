package model;

public class CartaoPrePago {

	protected String numeroCartao;
	protected String nomeTitular;
	protected int    anoValidade;
	protected int    mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular  = nomeTitular;
		this.anoValidade  = anoValidade;
		this.mesValidade  = mesValidade;
		this.saldo        = saldo;
	}

	public String toString() {
	    return "Cartao pre pago: "+numeroCartao+"/"+nomeTitular+"/"+anoValidade+"/"+mesValidade+"  R$ "+saldo;
	}
	
	public void adicionarCredito(double valor) {
		if (valor <= 0) {
			throw new IsiException("O valor a ser creditado n�o pode ser zero ou negativo!");
		}
		this.saldo = this.saldo + valor;
	}
	
	public boolean comprar(double valor) {
		if (valor <= 0) {
			throw new IsiException("O valor da compra n�o pode ser zero ou negativo!");
		}
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
		
}