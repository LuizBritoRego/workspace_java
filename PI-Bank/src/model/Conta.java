package model;

public class Conta {
	protected int    numeroConta;
	protected String nomeTitular;
	protected String cpfTitular;
	protected double saldo;

	// O metodo toString força o retorno da representação do String sem necessidade de definir novo metodo
	public String toString() {
		return "Conta corrente: "+numeroConta+"\nNome Titular: "+nomeTitular
				+ "\nCPF: "+cpfTitular+"\nSaldo: R$ "+String.format("%.2f", saldo);
	}
	
	public boolean sacar (double valor) {
		if (saldo >= valor){
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public void depositar (double valor) {
		saldo = saldo + valor;
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

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
