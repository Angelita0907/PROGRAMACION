package excepciones.Boletin1E5;

import java.util.Scanner;

public class GeneraExcepciones {

	public static void main(String[] args) {
		GeneraExcepciones f = new GeneraExcepciones();
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un número: ");
		int numero = sc.nextInt();

		try {
			f.metodo1(numero);
		} catch (MiExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	void metodo1(int numero) throws MiExcepcion {
		
		try {
			if(numero%2 != 0) {
			throw new MiExcepcion("El número "+ numero+" es impar");
			}
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		finally {
			System.out.println("El número "+ numero+ " es par");
		}
	}
	
	

}
