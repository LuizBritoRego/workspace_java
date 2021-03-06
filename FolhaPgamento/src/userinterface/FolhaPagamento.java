package userinterface;

import model.Empreiteiro;
import model.Funcionario;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Horista;

public class FolhaPagamento {
	public static void main(String[] args) {

	/* Versao 1.0 - trabalhando com vetores
	Funcionario salario[];
		
	salario = new Funcionario[5];
				
	salario[0] = new Empreiteiro(11111,"Zezinho ", 1200.00);
	salario[1] = new Comissionado(22222,"Mariazinha ", 800.00, 200.00);
	salario[2] = new Chefe(99999,"Chefinho ", 5000.00, 20.0, 1500.00);
	salario[3] = new Comissionado(33333,"Raimundinho ", 1000.00, 250.00);
	salario[4] = new Horista(55555,"Joaozinho ", 100.00, 80);
	*/
		
	/* Vers�o 2.0 - trabalhando com ArrayLists */
	
	ArrayList<Funcionario> salario;
	salario = new ArrayList<Funcionario>();
	
	salario.add( new Empreiteiro(11111,"Zezinho ", 1200.00));
	salario.add( new Comissionado(22222,"Mariazinha ", 800.00, 200.00));
	salario.add( new Chefe(99999,"Chefinho ", 5000.00, 20.0, 1500.00));
	salario.add( new Comissionado(33333,"Raimundinho ", 1000.00, 250.00));
	salario.add( new Horista(55555,"Joaozinho ", 100.00, 80));
	
	System.out.println("+===== Folha de Pagamentos =====+");
	System.out.println("+-------------------------------+");
	//for (int pos=0; pos<salario; pos++) {
	//	System.out.println(salario[pos].calcularSalario());
	//	}
	//	System.out.println("+-------------------------------+");
	//}
	for (Funcionario f : salario) {
		System.out.printf("%8d - %-30s  RS %8.2f%n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
	}
	
	System.out.println("+----- Final da Folha ----+");
	
	}		
}