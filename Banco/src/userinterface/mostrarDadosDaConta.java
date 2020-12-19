package userinterface;
import core.Banco;

public class mostrarDadosDaConta {

	public static void main(String[] args) {
		Banco c1 = new Banco();
		Banco c2 = new Banco();
		
		c1.setConta (123444);
		c1.setNomeTitular("Luiz Brito Lindao");
		c1.setCpfTitular("111.111.111-11");
		c1.setSaldo(1200.00);
		
		c2.setConta (222222);
		c2.setNomeTitular("Mestre Isidro");
		c2.setCpfTitular("222.222.222-22");
		c2.setSaldo(500000.00);
		
		
		System.out.println("====> Dados da conta bancaria");
		System.out.println(c1.exibirDadosConta());
		System.out.println("====> Dados da conta bancaria");
		System.out.println(c2.exibirDadosConta());
		
		System.out.println("====> Fazendo saque da conta corrente");
		System.out.println("Sacando R$ 1000");		
		boolean r;
		r = c1.sacar(1000);
		if (r == true) {
			System.out.println("===> Saque efetuado ===");
		}
		else {
			System.out.println("===> Saldo insuficiente ===");
		}
		
		System.out.println("Sacando R$ 20000");
		boolean r2;
		r2 = c2.sacar(20000);
		if (r == true) {
			System.out.println("===> Saque efetuado ===");
		}
		else {
			System.out.println("===> Saldo insuficiente ===");
		}
		System.out.println(c1.exibirDadosConta());
		System.out.println(c2.exibirDadosConta());
				
		System.out.println("====> Fazendo deposito na conta corrente");
		System.out.println("Depositando R$ 500");
		c1.depositar(500);
		System.out.println(c1.exibirDadosConta());
		System.out.println("Depositando R$ 200000");
		c2.depositar(200000);
		System.out.println(c2.exibirDadosConta());
	
		System.out.println("====> Operacao concluida ===");

	}
}