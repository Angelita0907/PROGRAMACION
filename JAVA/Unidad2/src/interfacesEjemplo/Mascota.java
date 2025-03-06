package interfacesEjemplo;

public class Mascota extends Animal {

	public Mascota(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	void come() {
		System.out.println("Come");

	}

	@Override
	void respira() {
		System.out.println("Respira");

	}

}
