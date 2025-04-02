package controlador;

import java.util.Collections;
import java.util.List;

import modelo.Animal2;
import modelo.ReservaAnimal;

public class GestionaReserva {

	public static void main(String[] args) {
		

		Animal2 a1 = new Animal2(40, "Pepito");
		Animal2 a2 = new Animal2(8, "JC");
		Animal2 a3 = new Animal2(78, "Adrian");
		Animal2 a4 = new Animal2(22, "Carlos");
		Animal2 a5 = new Animal2(89, "Antonio");
		
		ReservaAnimal r1 = new ReservaAnimal("Reserva 1", "Sevilla", 3000);
		
		r1.addAnimal(a1);
		r1.addAnimal(a2);
		r1.addAnimal(a3);

		r1.mostrarAnimal();

		List<Animal2> listaAnimal = r1.fromSetToList();
		//sin ordenar
		System.out.println(listaAnimal);
		
		//ordenado
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);
		
		listaAnimal.add(a4);
		Collections.sort(listaAnimal);
		System.out.println(listaAnimal);
		r1.addAnimal(a5);
		System.out.println(listaAnimal);
		
	}

}
