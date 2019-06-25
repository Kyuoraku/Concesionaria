package estructura;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	private CharSequence modelo;
	private Double precio;
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();	

	public Vehiculo(CharSequence modelo, Double precio) {

		this.setModelo(modelo);
		this.setPrecio(precio);
		vehiculos.add(this);

	}

	public CharSequence getModelo() {
		return modelo;
	}

	public void setModelo(CharSequence modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public static String informe() {

		//String que contendrá todo el informe
		String cargar = "";

		//Flags para buscar al modelo más barato, al más caro y al que tenga una Y
		String caro=""; 	Double precioCaro = 0.0;
		String barato = ""; Double precioBarato = 0.0;
		Vehiculo letraY = null;

		//Flag que toma los primeros valores como referencia a comparar
		int flag = 0;
		
		//Búsqueda
		for(Vehiculo v: vehiculos) {
			cargar+=(v+"\n");
			
			//Si es la primera iteracion, se toman los valores del primer objeto
			if (flag == 0) {

				precioCaro = v.getPrecio();
				caro = (String) v.getModelo();

				precioBarato = v.getPrecio();
				barato = (String) v.getModelo();

				flag = 1;
				//Y si no lo es, se comienza a comparar y a buscar el mayor, menor, etc.
			}else if(flag == 1) {

				if (v.getPrecio().compareTo(precioCaro) > 0) {

					precioCaro = v.getPrecio();
					caro = (String) v.getModelo();

				}

				if(v.getPrecio().compareTo(precioBarato) < 0) {

					precioBarato = v.getPrecio();
					barato = (String) v.getModelo();

				}

			}

			//Busca un modelo que contenga una 'Y'

			for(int j=0; j<v.modelo.length(); j++) {

				if(v.modelo.charAt(j) == 'Y' ) {
					letraY = v;
				}

			}

		}

		//Informes
		cargar+=("=========================================\n");
		cargar+=("Vehículo más caro: "+caro+"\n");
		cargar+=("Vehículo más barato: "+barato+"\n");
		cargar+=("Vehículo que contiene en el modelo la letra 'Y': "+letraY.getModelo()+ " $" + letraY.getPrecio().toString()+"\n");
		cargar+=("========================================="+"\n");
		cargar+=("Vehículos ordenados por precio de mayor a menor: "+"\n");
		
		//Ordena de menor a mayor.
		Collections.sort(vehiculos);
		//Invierte
		Collections.reverse(vehiculos);
		
		//Concatena los modelos ordenados de mayor a menor.
		for(Vehiculo a:vehiculos) {
			
			cargar+= a.getModelo() + "\n";
			
		}
		
		//Devuelve el informe
		return cargar;
	}


	@Override
	public int compareTo(Vehiculo o) {
		return this.precio.compareTo(o.getPrecio());
	}

}
