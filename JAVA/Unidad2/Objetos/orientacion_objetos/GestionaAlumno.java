package orientacion_objetos;

public class GestionaAlumno {

	public static void main(String[] args) {
		Alumno alum1 = new Alumno();
		
		alum1.nombre = "Pedro";
		alum1.DNI = "12345678B";
		alum1.nota = 5;
		
		Alumno alum2 = new Alumno();
		
		alum2.nombre = "Andrea";
		alum2.DNI = "9876542C";
		alum2.nota = 4;
		
		String cadenaAlum1 = alum1.pasoACadena();
		String cadenaAlum2 = alum2.pasoACadena();
		System.out.println(cadenaAlum1);
		System.out.println(cadenaAlum2);

		boolean aprobado = alum1.aprobado();
		System.out.println("¿Está aprobado? " + aprobado);
		aprobado = alum2.aprobado();
		System.out.println("¿Está aprobado? " + aprobado);
		
	}

}
