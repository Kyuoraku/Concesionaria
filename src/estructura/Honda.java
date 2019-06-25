package estructura;

public class Honda extends Vehiculo {

	private static final String marca = "Honda";
	private CharSequence cilindrada;
	
	public Honda(CharSequence modelo, CharSequence cilindrada, Double precio) {
		super(modelo, precio);
		this.setCilindrada(cilindrada+"c");
	}

	public CharSequence getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(CharSequence cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public CharSequence getModelo() {
		return marca +" "+ super.getModelo();
	}
	
	public String toString() {
		return "Marca: " + marca + 
				" // Modelo: " + (String) this.getModelo() +
				" // Cilindrada: " + (String) this.getCilindrada() + 
				" // Precio: $" + this.getPrecio().toString();
	}
	
}
