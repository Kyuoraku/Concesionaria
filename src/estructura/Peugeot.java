package estructura;

public class Peugeot extends Vehiculo {

	private static final String marca = "Peugeot";
	private Integer puertas;
	
	
	public Peugeot(CharSequence modelo, Integer puertas, Double precio) {
		super(modelo, precio);
		this.setPuertas(puertas);
	}


	public Integer getPuertas() {
		return puertas;
	}


	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	
	public CharSequence getModelo() {
		return marca +" "+ super.getModelo();
	}
	
	public String toString() {
		return "Marca: " + marca + 
				" // Modelo: " + (String) this.getModelo() +
				" // Puertas: " + this.getPuertas().toString() + 
				" // Precio: $" + this.getPrecio().toString();
	}
	
}
