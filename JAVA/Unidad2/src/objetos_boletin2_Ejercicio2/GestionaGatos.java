package objetos_boletin2_Ejercicio2;

import java.util.Scanner;

public class GestionaGatos {

	public static void main(String[] args) {

		Gato gato1 = new Gato();
		gato1.sexo = "Macho";
		gato1.color = "Machitas";
		gato1.edad = 6;
		gato1.peso = 7.2F;
		gato1.raza = "Europeo";
		
		Gato gato2 = new Gato();
		gato2.sexo = "Hembra";
		gato2.color = "Negra";
		gato2.edad = 6;
		gato2.peso = 5.6F;
		gato2.raza = "Europeo";
		
		Gato gato3 = new Gato();
		gato3.sexo = "Hembra";
		gato3.color = "Gris";
		gato3.edad = 6;
		gato3.peso = 6.5F;
		gato3.raza = "Fold escocés";
		
		gato1.maullar();
		gato1.comer("pescado");
		
		gato2.ronronea();
		gato2.comer("pienso");
		
		gato3.ronronea();
		gato3.comer("pescado");
		
		gato2.pelear(gato3);
		gato1.pelear(gato2);
		
		System.out.println(gato1.toString());
		System.out.println(gato2.toString());
		System.out.println(gato3.toString());
		
	}

}
