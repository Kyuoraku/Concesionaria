package produccion;

import estructura.*;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] a) {
		//Creacion de los vehiculos.
		Vehiculo v0 = new Peugeot("206", 4, 200000.00);
		Vehiculo v1 = new Honda("Titan", "125", 60000.00);
		Vehiculo v2 = new Peugeot("208", 5, 250000.00);
		Vehiculo v3 = new Yamaha ("YBR", "160", 80500.50);

		System.out.println(Vehiculo.informe());
	}


}
