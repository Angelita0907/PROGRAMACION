package controlador;

import java.util.Scanner;

import Repositorio.HistorialException;
import modelo.PaginaWeb;

public class GestionaHistorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void gestionaOpcioneMenu(PaginaWeb p) {

		Scanner sc = new Scanner(System.in);
		String opcion = "";
		boolean salir = false;
		
		while (!salir) {

			System.out.println("1: Agregar página al historial");
			System.out.println("2: Consultar historial de todos los días");
			System.out.println("3: Consulta historial de un día");
			System.out.println("4: Consulta registros de historial de una url");
			System.out.println("5: Borrar historial de una página");
			System.out.println("6: Salir");
			System.out.println("Elige una opción: ");

			opcion = sc.next();

			if (opcion != null && opcion.equalsIgnoreCase("salir"))
				salir = true;
			else
				ejecutaOpcion(opcion, p);
		}

	}

	public void ejecutaOpcion(String opcion, PaginaWeb p) {

		switch (opcion) {

		case "1":

			try {
				p.agregarAlumno();

			} catch (HistorialException e1) {
				System.out.println(e1.getMessage());
			}

			break;

		case "2":
			
			try {
				e.borrarAlumno();

			} catch (HistorialException e1) {
				System.out.println(e1.getMessage());
			}

			break;



		case "3":

			System.out.println("Has seleccionado la opcion 3");

			e.busqueda();

			break;

		case "4":

			System.out.println("Has seleccionado la opcion 4");

			e.mostrarListaAlumnos();

			break;

		case "5":

			System.out.println("Has seleccionado la opcion 5");

			p.unirEquipos();

			break;

		case "6":

			System.out.println("Saliendo");

			break;

		}

	}

}
