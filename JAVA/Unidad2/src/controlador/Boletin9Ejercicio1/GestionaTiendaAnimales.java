package controlador.Boletin9Ejercicio1;

import java.time.LocalDate;
import java.util.Arrays;

import modelo.Boletin9Ejercicio1.*;

public class GestionaTiendaAnimales {

	public static void main(String[] args) {
		int contador = 0;
		Perro p1 = new Perro("BinBing", 4, null, LocalDate.of(2022, 7, 4), "Pequinés", true);
		Loro l1 = new Loro("Perico", 10, null, LocalDate.of(2015, 2, 27), true, true, "Marruecos", true);
		Serpiente s1 = new Serpiente(3, 5);
	
		Mascota [] animales = new Mascota [10];

		animales[contador] = p1;
		contador +=1;
		System.out.println(Arrays.toString(animales));
		
		System.out.println(p1.muestra());
		
	}

}
