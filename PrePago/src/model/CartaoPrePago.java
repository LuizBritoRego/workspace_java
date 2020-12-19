package model;

public class CartaoPrePago {

	protected int    numeroCartao;
	protected String nomeTitular;
	protected int    anoValidade;
	protected int    mesValidade;
	protected double saldo;
	
	
	public CartaoPrePago(int numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular  = nomeTitular;
		this.anoValidade  = anoValidade;
		this.mesValidade  = mesValidade;
		this.saldo        = 0.0;
	}

	// O metodo toString força o retorno da representação do String sem necessidade de definir novo metodo
	public String toString() {
		return "Numero Cartao: "+numeroCartao+"\nNome Titular: "+nomeTitular
				+ "\nValidade: "+anoValidade+"/"+mesValidade+"\nSaldo R$ "+String.format("%.2f", saldo);
	}
	
	public boolean pagar (double valor) {
		if (saldo >= valor){
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
		
	public void carregar (double valor) {
		saldo = saldo + valor;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
