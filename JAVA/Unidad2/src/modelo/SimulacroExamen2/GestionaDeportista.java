package modelo.SimulacroExamen2;

import java.time.LocalDate;

public class GestionaDeportista {

	public static void main(String[] args)  {
		
		Prueba [] pruebad = new Prueba[50];

		Deportista d1 = new Corredor("Pedro", "Españita", 23, 74.6, 1.82);
		Prueba p1 = new Prueba("p1", "Albacete", LocalDate.now().plusDays(1),Estado.PLANIFICADA);
		Prueba p2 = new Prueba("p2", "Viallverde", LocalDate.now().plusDays(10),Estado.PLANIFICADA);

		pruebad [0] = p1;
		pruebad [1] = p2;
		
		d1.setPruebas(pruebad);
		
		System.out.println(d1.getpruebaCercana());
		
		/*try {
			Prueba p3 = new Prueba(null, null, null, null);
		} catch (CompeticionExcepcion e) {
			System.out.println(e.getMessage());
		}*/
		
	}

}
