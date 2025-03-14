package excepciones.introductoria;

import java.io.IOException;

public class GestionaExcepcion {

	public static void main(String[] args) throws IOException {
		GeneraExcepcion g =  new GeneraExcepcion();
		g.genereaIOExcepyion();
		
		GeneraExcepcion g2 = new GeneraExcepcion();
		g2.generaMistmatch();
		
	}

}
