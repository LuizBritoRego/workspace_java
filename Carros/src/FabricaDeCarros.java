
public class FabricaDeCarros {
	String nome;
	
	Carro fabricarUmCarroNovo(String corDoCarro) {
		Carro novoCarro  = new Carro();
		
		novoCarro.marca  = "Volkswagen";
		novoCarro.modelo = "Golziho bolinha";
		novoCarro.ano    = 2020;
		novoCarro.cor    = "Branco";
		novoCarro.preco  = 30000;
		
		return novoCarro;
	}
}
