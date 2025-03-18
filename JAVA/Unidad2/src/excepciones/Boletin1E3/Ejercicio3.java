package excepciones.Boletin1E3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe los numeros que desea ingresar: ");
		int numeros = sc.nextInt();
		int listanum [] = {numeros};

		boolean positivos = false;
		
		System.out.println("Introduce "+ numeros + " numeros: ");
		for(int pos = 0; pos < numeros; pos++) 
		{
			try {
				int num = sc.nextInt();
				listanum[pos] = num;
				
				if(num >=0) {
					positivos = true;
					throw new ArithmeticException("Número positivo encontrado: "+num);
				}
			} catch (ArithmeticException e) {
				System.out.println("Excepcion capturada: "+e.getMessage());
			} finally {
				System.out.println("Numero analizado");
			}
			
		}
		
		System.out.println("Los numeros introducidos son: ");
		

	}

}
