package excepciones.introductoria;

import java.io.IOException;
import java.util.InputMismatchException;

public class GeneraExcepcion {
	
	public void genereaIOExcepyion() throws IOException
	{
		// controlada newcesita un try y un catch
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("En el catch de IOE");
			throw e;
		}
	}
	
	// no controloada, no lo necesita pero podemos usarlo si queremos
	public void generaMistmatch() throws InputMismatchException
	{
		try {
			throw new InputMismatchException();
		} catch (InputMismatchException e2) {
			throw e2;
		}
	}
	

}
