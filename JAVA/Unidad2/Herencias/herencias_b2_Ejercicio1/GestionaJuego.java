package herencias_b2_Ejercicio1;

public class GestionaJuego {

	public static void main(String[] args) {
		
		Villano v1 = new Villano("Roberto", 10, 100);
		Mago m1 = new Mago("Julian", 9, 50);
		Arquero a1 = new Arquero("Menganito", 13, 90);
		Caballero c1 = new Caballero("Juan", 15, 200);
		
		boolean villanoAtacado = v1.esAtacado(c1);
		System.out.println(villanoAtacado);
		
	}

}
