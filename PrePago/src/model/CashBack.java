package model;

public class CashBack extends CartaoPrePago {
	private String tipo;
		
	public CashBack(int numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, String modelo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this int tipo; // 0 - GOLD, 1 - SILVER, 2 - Bronze
	}

	public boolean pagar (double valor) {
		if (super.saldo >= valor) {
			super.saldo = saldo - valor;
			if (tipo == 1) {
				saldo = saldo + saldo*0.08
			} 
			else if (tipo == 2) {
				saldo = saldo + saldo*0.05		
			}
			else if (tipo == 3) {
				saldo = saldo + saldo*0.02		
			}		
			return true;
		}
		return false;
	}
	public String toString() {
		return "Numero Cartao: "+numeroCartao+"\nNome Titular: "+nomeTitular
				+ "\nValidade: "+mesValidade+"/"+anoValidade+"\nSaldo R$ "
				+ String.format("%.2f", saldo + "\nCash Back R$ "
				+ String.format("%.2f", this.desconto)); 
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(String modelo) {
		this.tipo = tipo;
	}
}