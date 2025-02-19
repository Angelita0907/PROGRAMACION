package simulacro2;

public class GestionaIncidenciaEquipo {

	public static void main(String[] args) {
		
		Equipo e1 = new Equipo("Pc-Juan", "12:34:567:8A", "Windows 7", 2);
		Equipo e2 = new Equipo("PC-Pedro", "23:563:AB2:34", "Ubunutu 22", 0);
		Equipo e3 = new Equipo("PC-JC", "234:564:78:43", "Windows 10", 1);
		Equipo e4 = new Equipo("PC-Manuel", "21:32:43:54", "MacOs", 1);
		
		Incidente i1 = new Incidente(1, "Pantala", "Pantalla dañada", 2025-02-12, null, "Registrado", "Media", e1);
		Incidente i2 = new Incidente(2, null, null, null, null, null, null, e2);
		Incidente i3 = new Incidente(3, null, null, null, null, null, null, e3);
		Incidente i4 = new Incidente(4, null, null, null, null, null, null, e4);
		Incidente i5 = new Incidente(5, null, null, null, null, null, null, e2);
		Incidente i6 = new Incidente(6, null, null, null, null, null, null, e4);

		Incidente [] listaIncidencias = {/*incidencias que creamos*/};

	}

}
