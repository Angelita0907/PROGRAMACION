package excepciones.Boletin1E4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Random r = new Random();
		// asi no empieza con 0 si no hay nada y funciona la excepcion
		Double [] divisiones = new Double[20];
		
		for(int i = 0; i < 20; i++) 
		{
			try {
				int num1 = r.nextInt();
				int num2 = r.nextInt();
		
				if(num2 == 0) {
					throw new ArithmeticException("No puedes dividir por 0");
				}
				
				if(i >=20) {
					throw new ArrayIndexOutOfBoundsException("Fuera de rango en la lista");
				}
				// guardamos en la lista de divisiones
				divisiones[i] = (double) (num1/num2); 
			
			} 
			// de los throw hacemos un catch para ver que ha ocurrido
			catch (ArithmeticException e1) {
				System.out.println("Ha salido un 0 de denominador");
				throw e1;
			}
			catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
				throw e2;
			}
			
			finally {
				try {
					for(int j = 0; j < divisiones.length; j++) {
						if(divisiones[j] ==  null) {
							throw new NullPointerException("Aquí no hay nada");
						}
						System.out.println(divisiones[j]);
					}
				//System.out.println(Arrays.toString(divisiones));
				}
				catch (NullPointerException e3) {
					System.out.println(e3.getMessage());
					throw e3;
				}
			}
		
	}
		
	}

}
