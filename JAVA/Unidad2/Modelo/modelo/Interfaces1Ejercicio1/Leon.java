package modelo.Interfaces1Ejercicio1;

public class Leon extends Animal {

	public Leon(String nombreEspecie, tipoFamilia familiaAnimal, String habitat, Animal[] animalqueCome,
			Animal[] animalesComido, boolean ani) {
		super(nombreEspecie, familiaAnimal, habitat, animalqueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacarAnimal(Animal a) {
		return a instanceof Rapaz || a instanceof Serpiente || a instanceof Roedor;
	}

	@Override
	public boolean huir(Animal a) {
		return false;
	}

	public Leon() {
		super();
		// TODO Auto-generated constructor stub
	}

}
