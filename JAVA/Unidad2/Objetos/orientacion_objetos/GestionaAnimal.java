package orientacion_objetos;

import paquete2.Animal;

public class GestionaAnimal {

	public static void main(String[] args) {
		
		Animal  perro = new Animal();
		perro.tipo = "perro";
		perro.nombre = "Lulú";
		// perro.edad = 5; no visible, es privado

		Animal gato = new Animal();
		gato.nombre = "Pirulo";
		gato.tipo = "gato";
		gato.darleDeComer();
		
		boolean anda = perro.caminar();
		System.out.println(anda);
		
		perro.darleDeComer();
		
		boolean mismoTipo = perro.sonDelMismotipo(perro, 12);
		System.out.println(mismoTipo);
		
	}

}
