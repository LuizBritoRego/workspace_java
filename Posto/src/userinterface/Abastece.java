package userinterface;

import model.BombaComb;
import javax.swing.JOptionPane;

public class Abastece {

	public static void main(String[] args) {
		BombaComb p1;
	
		p1 = new BombaComb("Gasolina comum", 4.20);
		
		p1.abastecerLitro(35.00);
		System.out.println(p1.exibirRecibo());	
		
		System.out.println("\n");
		
		p1 = new BombaComb("Alcool", 3.49);
		
		p1.abastecerValor(50.00);
		System.out.println(p1.exibirRecibo());

	}
}