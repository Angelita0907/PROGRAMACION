package modelo.SimulacroExamen2;

import java.util.concurrent.CompletionException;

public class GestionaDeportista {

	public static void main(String[] args)  {
		

		try {
			throw new CompeticionExcepcion("Mi excepcion");
		} catch (CompeticionExcepcion e) {
			System.out.println(e.getMessage());
		}
		
	}

}
