package controlador;

import modelo.Interfaces1Ejercicio1.*;
import modelo.Interfaces1Ejercicio1.Animal.tipoFamilia;

public class GestionaCadenaAlimenticia {

	public static void main(String[] args) {
		
		Animal [] atacaLeon = {new Leon()};
		Animal [] atacaRoedor = {new Roedor()};
		
		Animal s1 = new Serpiente("Cobra", tipoFamilia.SERPIENTE, "Selva", atacaRoedor, atacaLeon);

		
	}

}
