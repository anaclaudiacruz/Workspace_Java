
public class Bomba {
	private String nome_combustivel;
	private double valor_litro;
	private double qt_litros;
	private double valor_total;

	
//  Abastecer por Litro
	public double abastece_por_litro (double qt_litros) {
		double total_a_pagar;
		total_a_pagar = qt_litros * valor_litro;
		return total_a_pagar;
	}
	
//  Abastecer por Valor
	public double abastece_por_valor (double valor_total) {
		double qt_litros;
		qt_litros = valor_total / valor_litro;
		return qt_litros;
	}
	
//  GET's e SET's
	
	public String getNome_combustivel() {
		return nome_combustivel;
	}
	public void setNome_combustivel(String nome_combustivel) {
		this.nome_combustivel = nome_combustivel;
	}
	public double getValor_litro() {
		return valor_litro;
	}
	public void setValor_litro(double valor_litro) {
		this.valor_litro = valor_litro;
	}
	public double getQt_litros() {
		return qt_litros;
	}
	public void setQt_litros(double qt_litros) {
		this.qt_litros = qt_litros;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}



}
