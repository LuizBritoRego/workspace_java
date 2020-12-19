package userinterface;

import java.util.Scanner;

import model.Produto;
import model.IsiException;


public class Cadastro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int    opcao = 1;
		int    id;
		String nome, strId, strPreco;
		double preco;
		do { 
			try {
				Produto p = new Produto();
				System.out.println("Digite o ID do produto");
				id = teclado.nextInt();
				p.setId(id);
			
				System.out.println("Digite o nome do produto");
				nome = teclado.nextLine();
				p.setNome(nome);
			
				System.out.println("Digite o preço do produto");
				preco = Double.parseDouble(teclado.nextLine());
				p.setPreco(preco);
				opcao = Integer.parseInt(teclado.nextLine());
			} catch (Exception ex) {
				System.out.println("Deu erro !!!"+ ex.getMessage());
			}
		} while (opcao != 0);
		
	}

}
