package herencias_b2_Ejercicio1;

public class Mago extends Personaje {

	public Mago(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "hechizo");
	}
// no estacado por nadie
	@Override
	boolean esAtacado(Personaje atacante)
	{
		return false;
	}
	
	boolean esAtacado(Personaje atacado, int distancia)
	{
		return false;
	}
}
