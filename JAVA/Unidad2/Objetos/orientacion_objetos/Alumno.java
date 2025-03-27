package orientacion_objetos;

public class Alumno {

	String nombre;
	String DNI;
	float nota;

	String pasoACadena() {
		String cadena = "Alumno: " + nombre + " DNI: " + DNI + " y con nota: " + nota;

		return cadena;
	}

	boolean aprobado() {
		boolean aprobado = true;

		if (nota >= 5) {
			aprobado = true;
		}

		else {
			aprobado = false;
		}
		return aprobado;
	}

}
