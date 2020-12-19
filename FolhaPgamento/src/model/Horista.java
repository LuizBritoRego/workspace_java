package model;

import model.Funcionario;

public class Horista extends Funcionario {
	private double valorHora;
	private double qtdeHoras;
	
	public Horista(int numRegistro, String nome, double valorHora, double qtdeHoras) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.qtdeHoras = qtdeHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtdeHoras() {
		return qtdeHoras;
	}

	public void setQtdehoras(double qtdeHoras) {
		this.qtdeHoras = qtdeHoras;
	}

	@Override
	public double calcularSalario() {
		return this.valorHora * this.qtdeHoras;
	}

}
