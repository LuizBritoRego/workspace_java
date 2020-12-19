

import java.util.InputMismatchException;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
			
		int a, b, r;
		
		try { 
			System.out.println("Digite um valor");
			a = teclado.nextInt();
			System.out.println("Digite outro valor");
			b = teclado.nextInt();
		
			r = a / b;
			System.out.println("Resultado da divisao = " +r);
		teclado.close();
		}
		catch(ArithmeticException ex) {
			System.out.println("O segundo valor tem que ser difertente de zero!!!");
		}
		catch(InputMismatchException ex) {
			System.out.println("Por favor digite um numero inteiro!");
		}
		catch(Exception ex) {
			System.out.println("Deu ruim!!!");
			System.out.println("Tipo da excecao "+ex.getClass().getName());
		}
	}
}