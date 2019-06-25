package estructura;

import java.util.ArrayList;

public abstract class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private CharSequence modelo;
	private Double precio;
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	public Vehiculo(String marca, CharSequence modelo, Double precio) {
		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPrecio(precio);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
	
	
	
}
