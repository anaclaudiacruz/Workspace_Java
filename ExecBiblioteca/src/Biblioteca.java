
public class Biblioteca {

	private String titulo;
	private String autor;
	private int ano_publicacao;
	private String categoria;
	private int num_estante;
	private int num_prateleira;
	private boolean emprestado;

	public void imprimir_livro() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publica��o: " + ano_publicacao);
		System.out.println("Categoria: " + categoria);
		System.out.println("N�mero da estante: " + num_estante);
		System.out.println("N�mero da prateleira: " + num_prateleira);
		if (emprestado) {
			System.out.println("Est� emprestado");
		} else {
			System.out.println("Est� dispon�vel");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNum_estante() {
		return num_estante;
	}

	public void setNum_estante(int num_estante) {
		this.num_estante = num_estante;
	}

	public int getNum_prateleira() {
		return num_prateleira;
	}

	public void setNum_prateleira(int num_prateleira) {
		this.num_prateleira = num_prateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public void devolver() {
		emprestado = false;
	}

	public void emprestar() {
		emprestado = true;
	}

}
