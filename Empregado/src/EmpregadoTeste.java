
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado();
		
		e1.nome    = "Bitao Lindao";
		e1.cargo   = "Coordenador";
		e1.salario = 12000.00;
		
		e2.nome    = "Mestre Isidio";
		e2.cargo   = "Professor";
		e2.salario = 15000.00;
		
		System.out.println("====> Ordenado antes do aumento");
		e1.imprimir();
		e2.imprimir();

		System.out.println("====> Aumentando salario em 15%");
		System.out.printf("Salario ant R$ %.2f%n", e1.salario);	
		e1.aumentarSalario(15);
		
		System.out.printf("Salario ant R$ %.2f%n", e2.salario);	
		e2.aumentarSalario(20);
		
		System.out.println("====> Ordenado apos o aumento");
		System.out.printf("Salario pos R$ %.2f%n", e1.salario);	
		System.out.printf("Salario pos R$ %.2f%n", e2.salario);
	}
}
