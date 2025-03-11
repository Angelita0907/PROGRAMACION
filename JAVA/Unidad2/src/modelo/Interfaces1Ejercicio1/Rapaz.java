package modelo.Interfaces1Ejercicio1;

public class Rapaz extends Animal {

	public Rapaz(String nombreEspecie, tipoFamilia familiaAnimal, String habitat, Animal[] animalqueCome,
			Animal[] animalesComido, boolean ani) {
		super(nombreEspecie, familiaAnimal, habitat, animalqueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean atacarAnimal(Animal a) {
		return  a instanceof Serpiente || a instanceof Roedor;
	}

	@Override
	public boolean huir(Animal a) {
		return a instanceof Leon;
	}

}
