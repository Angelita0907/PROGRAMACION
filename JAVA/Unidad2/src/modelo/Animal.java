package modelo;

public abstract class Animal {

	String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getSonidoAnimal();
	public abstract String getAlimento();

}
