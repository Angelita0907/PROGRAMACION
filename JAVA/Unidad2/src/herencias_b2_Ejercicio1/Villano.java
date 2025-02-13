package herencias_b2_Ejercicio1;

public class Villano extends Personaje{
// no tiene arma por eso es vacio
	protected Villano(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida, "");
	}

	// al villano le ataca todo el mundo por eso sirve el del padre
	
}
