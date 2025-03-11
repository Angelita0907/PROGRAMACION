package modelo.Interfaces1Ejercicio1;

public class Roedor extends Animal {

	public Roedor(String nombreEspecie, tipoFamilia familiaAnimal, String habitat, Animal[] animalqueCome,
			Animal[] animalesComido, boolean ani) {
		super(nombreEspecie, familiaAnimal, habitat, animalqueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}
	
	public Roedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacarAnimal(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean huir(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

}
