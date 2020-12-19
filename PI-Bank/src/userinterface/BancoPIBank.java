package userinterface;

import model.Conta;
import model.ContaEspecial;

public class BancoPIBank {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "Correntista 1", "111.11.11-11", 700.00);
		//c1 = new Conta();
		//c1.setNomeTitular("Correntista 1");
		//c1.setCpfTitular("111.111.111-11");
		//c1.setNumeroConta(123456);
		//c1.setSaldo(700.00);
			
		System.out.println(c1 +"\n"); 
		
		ContaEspecial c2 = new ContaEspecial(222222, "Correntista 2", "222.222.222-22", 200.00, 700.00);
		//c2.setNomeTitular("Correntista 2");
		//c2.setCpfTitular("222.222.222-22");
		//c2.setNumeroConta(234999);
		//c2.setSaldo(200.00);
		//c2.setLimite(500.00);
		
		System.out.println(c2 +"\n"); 
		
		if (c1.sacar(300)) {
			System.out.println("Debito autorizado na conta: "+c1.getNumeroConta() +"\n");
		}
		else {
			System.out.println("Saldo insuficiente na conta: "+c1.getNumeroConta()+"\n");
		}
		if (c2.sacar(900)) {
			System.out.println("Debito autorizado na conta: "+c2.getNumeroConta()+"\n");
		}
		else {
			System.out.println("Saldo insuficiente na conta: "+c2.getNumeroConta()+"\n");
		}
		System.out.println(c1 + "\n"); 
		System.out.println(c2 + "\n"); 
	}

}
