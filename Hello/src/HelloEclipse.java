import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ufa!!!  funciona");
		
		int a = 0;
		do {
			a = teclado.nextInt();
			System.out.println("Digitou = " + a);
		} while ( a != 999 );
		
		System.out.println("Estou gostando deste java... Uhuuuu!");
		System.out.println("Obrigado!!!");
		teclado.close();
	}
}