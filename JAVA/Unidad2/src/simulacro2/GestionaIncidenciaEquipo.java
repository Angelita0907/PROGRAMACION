package simulacro2;

import java.time.LocalDate;

public class GestionaIncidenciaEquipo {

	public static void main(String[] args) {

		GestionaIncidenciaEquipo f = new GestionaIncidenciaEquipo();
		
		Usuario u1 = new Usuario(null, "Juan", null);
		Usuario u2 = new Usuario(null, null, null);
		Usuario u3 = new Usuario(null, null, null);
		Usuario u4 = new Usuario(null, null, null);
		
		Equipo e1 = new Equipo("Pc-Juan", "12:34:567:8A", "Windows 7", 2, u1);
		Equipo e2 = new Equipo("PC-Pedro", "23:563:AB2:34", "Ubunutu 22", 0, u2);
		Equipo e3 = new Equipo("PC-JC", "234:564:78:43", "Windows 10", 1, u3);
		Equipo e4 = new Equipo("PC-Manuel", "21:32:43:54", "MacOs", 1, u4);
		
		Incidente i1 = new Incidente(1, "Pantala", "Pantalla dañada", LocalDate.of(2024, 3, 12), LocalDate.of(2025, 2, 12), Estado.REGISTRADA, Criticidad.MEDIA, e1);
		Incidente i2 = new Incidente(2, null, null, null, null, null, null, e2);
		Incidente i3 = new Incidente(3, null, null, null, null, null, null, e3);
		Incidente i4 = new Incidente(4, null, null, null, null, null, null, e4);
		Incidente i5 = new Incidente(5, null, null, null, null, null, null, e2);
		Incidente i6 = new Incidente(6, null, null, null, null, null, null, e4);

		Incidente [] listaIncidencias = {i1,i2,i3,i4,i5,i6};
		
		System.out.println(e1);
		
		f.esUrgente(listaIncidencias);

	}

	public void esUrgente (Incidente [] listaIncidencias)
	{
		for(int i =0; i < listaIncidencias.length; i++)
		{
			if (listaIncidencias[i].getCriticidad().equals(Criticidad.CRITICA) || listaIncidencias[i].getCriticidad().equals(Criticidad.GRAVE) && listaIncidencias[i].getFechaRegistro().isBefore(LocalDate.now().minusDays(7)) || listaIncidencias[i].getCriticidad().equals(Criticidad.MEDIA) && listaIncidencias[i].getFechaRegistro().isBefore(LocalDate.now().minusDays(30))){
				System.out.println("INCIDENTE "+i+": URGENTE");
			}
			else {
				System.out.println("NO ES URGENTE");
			}
		}
	}
	
}
