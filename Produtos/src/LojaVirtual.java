
public class LojaVirtual {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		p1.setCodBarras (1111111);
		p1.setNome("Arroz Tio Joao fininho");
		p1.setDepartamento("Cereais");
		p1.setPreco(12.50);
		
		p2.setCodBarras(2222222);
		p2.setNome("Queijo da Serra da Canastra");
		p2.setDepartamento("Frios");
		p2.setPreco(08.20);
		
		p3.setCodBarras(3333333);
		p3.setNome("Papel higiene macio e cheiroso");
		p3.setDepartamento("Higiene e Limpeza");
		p3.setPreco(05.00);
		
		System.out.println("====> Relacionando os produtos");
		p1.imprimir();
		System.out.printf("Pre�o com desconto R$ %.2f%n", p1.aplicarDesconto(10));	
		System.out.println("=============================");
		
		p2.imprimir();	
		System.out.printf("Pre�o com desconto R$ %.2f%n", p2.aplicarDesconto(15));	
		System.out.println("=============================");	
		
		p3.imprimir();
		System.out.printf("Pre�o com desconto R$ %.2f%n", p3.aplicarDesconto(5));	
		System.out.println("=============================");
	
		System.out.println("====> Rela��o concluida === FIM");

	}
}