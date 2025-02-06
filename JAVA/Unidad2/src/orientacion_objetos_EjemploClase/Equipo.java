package orientacion_objetos_EjemploClase;

import java.util.Arrays;

public class Equipo {

	String nombreEquipo;
	int [] puntuaciones;
	Personas [] personas;
	public Equipo(String nombreEquipo, int[] puntuaciones, Personas[] personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}
	@Override
	public String toString() {
		return "Ejemplo2PersonasEquipo [nombreEquipo=" + nombreEquipo + ", puntuaciones="
				+ Arrays.toString(puntuaciones) + ", personas=" + Arrays.toString(personas) + "]";
	}

	float calculaMediaEdad()
	{
		float mediaEdad = 0f;
		int sumaEdades = 0;
		Personas [] tablaPersona = this.personas;
		for(Personas p: tablaPersona)
		{
			sumaEdades = sumaEdades+p.edad;
		}
		
		mediaEdad = sumaEdades/tablaPersona.length;
		
		return mediaEdad;
	}
	
}
