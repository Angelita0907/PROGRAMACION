package excepcionesEjemplo;

public class GestionaAngelaExcepcion {

	public static void main(String[] args) throws AngelaExcepcion {
		try {
		throw new AngelaExcepcion("Lanzando mis excepciones");
		}
		catch (AngelaExcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}

	}

}
