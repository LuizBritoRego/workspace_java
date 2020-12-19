
public class Produto {

	private int codBarras;
	private String nome;
	private String departamento;
	private double preco;
	
	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	void imprimir(){
		System.out.println("Cod. de barras : "+codBarras);
		System.out.println("Produto        : "+nome);
		System.out.println("Departamento   : "+departamento);
		System.out.printf("Preço          : R$ %.2f%n", preco);
	}
	
	double aplicarDesconto(double percentual) {
		return preco - preco*percentual/100;
	}
}