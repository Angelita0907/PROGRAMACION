package objetos_boletin2_Ejercicio3;

public class Alumnos {

	/*
	 * nombre: String apellido: String email: String notaP: NotaAsignatura notaB:
	 * NotaAsignatura --> lucia.notaP.primerT / lucia.notaP.nombre
	 * 
	 */
	String nombre;
	String apellido;
	String emai;
	Notas notaP;
	Notas notaBD;

	public Alumnos(String nombre, String emai) {
		super();
		this.nombre = nombre;
		this.emai = emai;
	}

	@Override
	public String toString() {
		return "Alumnos nombre=" + nombre + ", apellido=" + apellido + ", emai=" + emai + ", notaP=" + notaP
				+ ", notaBD=" + notaBD;
	}
	
	void imprimeSiAprobado(String nombreA)
	{
		Notas notasAsignatura;
		if(nombreA.equals("Programacion")) {
			notasAsignatura = this.notaP;
		}
		else {
			notasAsignatura = this.notaBD;
		}
		
		if (notasAsignatura.mediaNota() >=5)
		{
			System.out.println("El alumno "+ nombre+" ha aprobado la asignatura " + notasAsignatura.nombre);
		}
		else {
			System.out.println("El alumno "+ nombre+" ha aprobado la asignatura " + notasAsignatura.nombre);
		}
	}



}
