package controlador;

import java.util.Scanner;

import modelo.Persona;

public class GestionaPersona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dni o pon fin:");
		String dni = sc.nextLine();
		
		while(!dni.equals("fin")) {
			if (Persona.validaSiDniValido(dni)) {
				// cada vez que se vea un dni valido genera una persona
				Persona p1 = new Persona(dni, 0, 0);
				System.out.println("Dni válido");

			} else {
				System.out.println("Error, dni no válido");
			}
			System.out.println("Introduce un dni o pon fin:");
			dni = sc.nextLine();
		}
		
		GestionaPersona g1 = new GestionaPersona();
		g1.imprimeNoEstatico();
		GestionaPersona.imprimeEstatico();
		
		GestionaPersona g = new GestionaPersona();
		
		
	}
	
	void imprimeNoEstatico()
	{
		System.out.println("No estatico");
	}

	static void imprimeEstatico()
	{
		System.out.println("Estatico");
	}
}
