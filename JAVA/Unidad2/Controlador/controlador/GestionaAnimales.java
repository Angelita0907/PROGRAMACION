package controlador;

import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
import modelo.Pez;

public class GestionaAnimales {

	public static void main(String[] args) {
		
		Animal p1 = new Perro(null);
		Animal g1  = new Gato(null);
		Animal pez = new Pez(null);
		
		System.out.println(p1.getSonidoAnimal());
		System.out.println(p1.getAlimento());
		
		System.out.println(g1.getSonidoAnimal());
		System.out.println(g1.getAlimento());
		
		System.out.println(pez.getSonidoAnimal());
		System.out.println(pez.getAlimento());

	}

}
