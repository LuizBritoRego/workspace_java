package userinterface;

import model.CashBack;
import model.CartaoPrePago;

public class Compras {
	public static void main(String[] args) {
	
		CartaoPrePago c1 = new CartaoPrePago(11111, "Correntista batuta", 25, 11, 1200.00);
		
		System.out.println(c1 +"\n"); 
		
		CashBack c2 = new CashBack(222222, "Correntista supimpa", 27, 09, 2000.00);
		
		System.out.println(c2 +"\n"); 
		
		
		c1.carregar(1000);
		if (c1.pagar(100.00)) {
			System.out.println("Pagamento efetuado no cartao: "+c1.getNumeroCartao() +"\n");
		}
		else {
			System.out.println("Saldo insuficiente no cartao: "+c1.getNumeroCartao()+"\n");
		}
		if (c2.pagar(200.00)) {
			System.out.println("Pagamento efetuado no cartao: "+c2.getNumeroCartao()+"\n");
		}
		else {
			System.out.println("Saldo insuficiente no caartao: "+c2.getNumeroCartao()+"\n");
		}
		System.out.println(c1 + "\n"); 
		System.out.println(c2 + "\n"); 
	}

}