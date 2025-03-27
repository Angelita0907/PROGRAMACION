package modelo.Interfaces1Ejercicio1;

public class Serpiente extends Animal {

	public Serpiente(String nombreEspecie, tipoFamilia familiaAnimal, String habitat, Animal[] animalqueCome,
			Animal[] animalesComido) {
		super(nombreEspecie, familiaAnimal, habitat, animalqueCome, animalesComido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacarAnimal(Animal a) {
		return a instanceof Roedor;
	}

	@Override
	public boolean huir(Animal a) {
		return false;
	}                                               

}
