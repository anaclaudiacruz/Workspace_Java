package core;

public class Horista extends Funcionario {
	private float valorHora;
	private int numeroHoras;
	
	public Horista(int numRegistro, String nome, float valorHora, int numeroHoras) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public float calcularSalario() {
		return valorHora * numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}


}
