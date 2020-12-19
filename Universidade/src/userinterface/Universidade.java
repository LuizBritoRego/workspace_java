package userinterface;

import model.Estudante;
import model.Pessoa;

public class Universidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p = new Pessoa();
		p.setNome("Pessoa");
		p.setEmail("pessoa@hotmail.com");
		p.setTelefone("99272-2222");
		
		Estudante e1 = new Estudante();
		
		e1.setNome("Luiz de Brito Rego");
		e1.setEmail("luiz_brito@hotmail.com");
		e1.setTelefone("99272-8495");
		e1.setNumMatricula(12345);
		e1.setCurso("Computacao");
		
		System.out.println(e1.exibirInfo); 
		
		
		Professor pro = new Professor;
		pro.setNome("Zezinho");
		pro.setEmail("zezinho@hotmail.com");
		pro.setTelefone("95553-8383");
		pro.setArea()
	}

}
