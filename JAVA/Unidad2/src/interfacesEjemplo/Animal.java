package interfacesEjemplo;

public abstract class Animal extends SerVivo {

	public Animal(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}
	
	abstract void come();
	abstract void respira();

}
