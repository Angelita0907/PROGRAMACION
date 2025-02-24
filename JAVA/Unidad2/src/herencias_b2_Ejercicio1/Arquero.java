package herencias_b2_Ejercicio1;

public class Arquero extends Personaje {

	public Arquero(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "arco");
	}

	@Override
	boolean esAtacado(Personaje atacante) {
		boolean atacado;
		// usamos eso para comparar los objetos
		if (atacante instanceof Mago) {
			atacado = true;
		}

		else {
			atacado = false;
		}
		return atacado;
	}

	boolean esAtacado(Personaje atacante, int distancia)
	{
		boolean atacado;
		if (atacante instanceof Mago) {
			atacado = true;
		}
		else if (atacante instanceof Caballero && distancia < 50)
		{
			atacado = true;
		}
		
		else
		{
			atacado = false;
		}
		return atacado;
	}
	
}
