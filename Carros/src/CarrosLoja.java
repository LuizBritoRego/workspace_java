import java.awt.datatransfer.SystemFlavorMap;

public class CarrosLoja {
	public static void main(String[] args) {
		// Declarando variaveis do tipo carro
		Carro c1, c2, c3;
		FabricaDeCarros = new FabricaDeCarros();
				
		// Pedir para reservar memoria para JVC
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca  = "Porche";
		c1.modelo = "Kaieny";
		c1.cor    = "Azul Marinho nervoso";
		c1.ano    = 2020;
		c1.preco  = 1250000.00;
		
		c2.marca  = "Xevrolé";
		c2.modelo = "Córsa";
		c2.cor    = "Prata com detalhes brancos";
		c2.ano    = 1998;
		c2.preco  = 3852.00;		
	
		c1.imprimir();
		c2.imprimir();
		
		double ipvaC1 = c1.calcularIPVA();
		System.out.println(c1)
	
	}
	
}
