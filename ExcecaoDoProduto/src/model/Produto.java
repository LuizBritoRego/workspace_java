package model;

public class Produto {
	private int id;
	private String nome;
	private double preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >0) {
			throw new RuntimeException ("ID deve ser positivo!");
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new RuntimeException ("Preco deve positivo!");
		}
		this.preco = preco;
	}
	

	
	
}
