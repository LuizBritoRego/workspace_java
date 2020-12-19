package model;

public interface InterfaceBD {

	public void conectar(String bd, String usuario);
	public void executar(String comando);
	public void desconectar(String bd);

}
