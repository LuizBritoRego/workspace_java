package core;

public class Banco {

	private int conta;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	private String resultado;

	public int getConta() {
		return this.conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String exibirDadosConta() {
		String resultado = "Conta corrente: "+conta+"\nNome Titular: "+nomeTitular
				+ "\nCPF: "+cpfTitular+"\nSaldo: R$ "+saldo;
		return resultado;
	}
	
	public boolean sacar (double valor) {
		if (saldo >= valor){
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
	}
}