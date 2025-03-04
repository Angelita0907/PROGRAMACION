package modelo;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSonidoAnimal() {

		return "guau guau";
	}

	@Override
	public String getAlimento() {
		return "Pienso";
	}
	
}
