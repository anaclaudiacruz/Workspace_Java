
public class Produto {

	private int    id;
	private String nome;
	private float  preco;
	
	public int getId() {
		return id;
	}
	
	/*
	 * formalmente uma exce��o n�o-verificada n�o precisa da declara��o de lan�amento no cabe�alho do m�todo
	 * j� nas exce��es VERIFICADAS, a cl�usula THROWS � obrigat�ria no cabe�alho do m�todo
	 */
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID de produto n�o pode ser zero ou negativo!");
		}
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws IsiException {
		if (nome == null || nome.length() == 0) {
			throw new IsiException("Nome do produto n�o pode estar vazio!");
		}
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) throws IsiException {
		if (preco < 0) {
			throw new IsiException("Pre�o nao pode ser negativo!");
		}
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
