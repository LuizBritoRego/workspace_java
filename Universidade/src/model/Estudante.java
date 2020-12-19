package model;

// O operador EXTENDS pode ser lido como: A classe ESTUDANTE possui tudo o que existe na 
// classe pessoas mais as suas informações específicas

public class Estudante extends Pessoa {
	private String curso;
	private int    numMatricula;
	
	public String exibirInfo() {
		String resutado = "nome "+nome+
	}
	
	public static void main(String[] args) {
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
}
