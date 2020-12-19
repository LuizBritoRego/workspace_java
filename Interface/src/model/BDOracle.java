package model;

public class BDOracle implements InterfaceBD {

	@Override
	public void conectar(String bd, String usuario) {
		System.out.println("Conectando no Banco de Dados Oracle");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Executando comandos no Banco de Dados Oracle");
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Desconectando do Banco de Dados Oracle");
				
	}

}
