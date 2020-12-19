package userinterface;

import model.Carro;
import model.Veiculo;
import model.Moto;

public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro ("Fiat", "ABC1234", "Urbano");
		v2 = new Moto ("CG125", "XYZ1234", "Superbike");
		
		v1.acelerar();
		v1.frear();
		
		v2.acelerar();
		v2.frear();
	}

}
