/* Ao declarar uma classe, estou declarando um novo tipo de dado
 * 
 * Nete caso o tipo CARRO contem propriedades (atributos)
 * modelo, marca, cor, ano, preço
 */
public class Carro {
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	void imprimir(){
		System.out.println("---- CARRO ----");
		System.out.println("Marca: "+marca+"/"+modelo);
		System.out.println("Ano  : "+ano+"    Cor: "+cor);
		System.out.println("Preço: "+preco);
	}
	
	/* Todo metodo segue o padrão de codigo E ==> P ==> S
	 * 
	 */
	double calcularIPVA(){
		double valorIpva;
		if (ano < 2000){
			valorIpva = 0;
		}
		else{
			valorIpva = preco * 0.04;
		}
	    return valorIpva;
	}
}