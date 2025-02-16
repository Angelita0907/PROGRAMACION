package herencias_b2_Ejercicio1;

public class Caballero extends Personaje {

	public Caballero(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "Espada");
	}

	@Override
	boolean esAtacado(Personaje atacante) {
		boolean atacado;
		// podemos hacer un if con un OR tambien
		// usamos eso para comparar los objetos
		if (atacante instanceof Mago) {
			atacado = true;
		}

		else if (atacante instanceof Arquero) {
			atacado = true;
		}

		else {
			atacado = false;
		}

		return atacado;
	}

	
	boolean esAtacado(Personaje atacante, int distancia) {
		boolean atacado;
		if (atacante instanceof Mago) {
			atacado = true;
		} else if (atacante instanceof Arquero && distancia < 100) {
			atacado = true;
		}

		else {
			atacado = false;
		}
		return atacado;
	}

}
