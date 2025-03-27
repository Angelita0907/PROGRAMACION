package modelo;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSonidoAnimal() {

		return "miau miau";
	}

	@Override
	public String getAlimento() {
		return "Pescado";
	}
	
}
