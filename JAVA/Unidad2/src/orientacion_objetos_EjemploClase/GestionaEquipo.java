package orientacion_objetos_EjemploClase;

public class GestionaEquipo {

	public static void main(String[] args) {

		Personas p1 = new Personas("Andrea","Perea","12345678C",20);
		Personas p2 = new Personas("Luis","Martin","12375678D",21);
		Personas p3 = new Personas("Marta","Perez","12345678A",25);
		Personas p4 = new Personas("Sebastián","Rodríguez","12345678B",23);

		Personas[] personas1 = {p1,p2};	
		Personas[] personas2 = {p3,p4};	
		int [] puntuaciones1 = {7,14,22};
		int [] puntuaciones2 = {40,12,3};

		Equipo equipo1 = new Equipo("Equipo1",puntuaciones1,personas1);		
		System.out.println(equipo1);
		Personas[] tablaPersonas = equipo1.personas;
		//Recorremos persona por persona para acceder a su dni de la lista de personas
		for(int i =0; i<tablaPersonas.length; i++)
		{
			Personas p = tablaPersonas[i];
			System.out.println(p.dni);
		}
		
		Equipo equipo2 = new Equipo("Equipo2",puntuaciones2,personas2);		
		
		System.out.println(equipo1.calculaMediaEdad());
	
	}

}
