package model;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(int numeroConta, String nomeTitular, String cpfTitular, double saldo, double limite) {
		super(numeroConta, nomeTitular, cpfTitular, saldo);
		this.limite = limite;
	}

	public boolean sacar (double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = saldo - valor;
			return true;
		}
		return false;
	}
	public String toString() {
		return "Conta Especial : "+super.numeroConta+ "\nNome Tituar: " + 
				super.nomeTitular +" ("+super.cpfTitular+") \nSaldo R$ " +
				String.format("%.2f",  super.saldo) + "\nLimite R$ "+
				String.format("%.2f",  this.limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}