package objetos_boletin2_Ejercicio3;

public class GestionaNotas {

	public static void main(String[] args) {
		
		Alumnos lucia = new Alumnos("Lucia","lucia@gmail.com");
		// programacion 5,7,7
		Notas notaprogLucia = new Notas("Programación",6,7,8);
		// base de datos 6,6,7
		Notas notaBBDDLucia = new Notas("Base De Datos",9,4,7);
		//Asignamos las notas (variables) al atributo del objeto notas
		lucia.notaP = notaprogLucia;
		lucia.notaBD = notaBBDDLucia;
		
		Alumnos vicente = new Alumnos("Vicente","vicente@gmail.com");
		Notas notaprogVicente = new Notas("Programación",4,9,5);
		Notas notaBBDDVicente = new Notas("Base De Datos",6,5,7);
		vicente.notaP = notaprogVicente;
		vicente.notaBD = notaBBDDVicente;
	
		System.out.println(lucia);
		System.out.println(vicente);
		
		lucia.imprimeSiAprobado("Programacion");
		vicente.imprimeSiAprobado("BBDD");
		
	}

}
