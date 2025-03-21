package modelo.Interfaces1Ejercicio1;

public abstract class Animal {

	private String nombreEspecie;
	private tipoFamilia familiaAnimal;
	private String habitat;
	private Animal animalqueCome [];
	private Animal animalesComido [];	
	
	public enum tipoFamilia{
		RAPAZ, LEON, ROEDOR, SERPIENTE
	}
	
	public Animal(String nombreEspecie, tipoFamilia familiaAnimal, String habitat, Animal[] animalqueCome,
			Animal[] animalesComido) {
		super();
		this.nombreEspecie = nombreEspecie;
		this.familiaAnimal = familiaAnimal;
		this.habitat = habitat;
		this.animalqueCome = animalqueCome;
		this.animalesComido = animalesComido;
	}
	
	
	
	public Animal() {
		super();
		this.setAnimalqueCome(new Animal [10]);
		this.setAnimalesComido(new Animal[10]);
	}

	public String getNombreEspecie() {
		return nombreEspecie;
	}

	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}

	public tipoFamilia getFamiliaAnimal() {
		return familiaAnimal;
	}

	public void setFamiliaAnimal(tipoFamilia familiaAnimal) {
		this.familiaAnimal = familiaAnimal;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Animal[] getAnimalqueCome() {
		return animalqueCome;
	}

	public void setAnimalqueCome(Animal[] animalqueCome) {
		this.animalqueCome = animalqueCome;
	}
	
	public Animal[] getAnimalesComido() {
		return animalesComido;
	}

	public void setAnimalesComido(Animal[] animalesComido) {
		this.animalesComido = animalesComido;
	}

	public abstract boolean atacarAnimal(Animal a);
	public abstract boolean huir(Animal a);
	
 }

