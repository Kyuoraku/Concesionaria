package estructura;

public class Yamaha extends Vehiculo implements Comunicable{

	private static final String marca = "Yamaha";
	private CharSequence cilindrada;
	
	public Yamaha(CharSequence modelo, CharSequence cilindrada, Double precio) {
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
