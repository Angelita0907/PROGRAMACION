package modelo;

public class Pez extends Animal {

	public Pez(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSonidoAnimal() {
		return "glu glu";
	}

	@Override
	public String getAlimento() {
		return "algas";
	}
	
	

}
