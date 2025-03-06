package interfacesEjemplo;

public abstract class SerVivo {

	private int edad;

	public SerVivo(int edad) {
		super();
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	abstract boolean estaVivo();
	abstract boolean seDesplaza();

}
