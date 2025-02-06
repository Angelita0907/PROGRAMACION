package tablas;

import java.util.Scanner;

public class CarreraRenos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuantos renos hay?: ");
		int numRenos = sc.nextInt();
		
		System.out.print("¿Cuanto mide la pista?: ");
		int longPista = sc.nextInt();
		
		int tablaCarrera [] =  new int[numRenos] ;
		
		int posReno;
		
		for (posReno = 0; posReno < numRenos; posReno++) 
		{
			System.out.print("¿En que posición está el reno "+ posReno +"?");
			tablaCarrera [posReno] = sc.nextInt();
			
		}
		
		String nieve = "~";
		String cadena="@";
		
		for(int i = 0; i< posReno; i++) 
		{
			cadena = cadena+nieve;
		}
		
		sc.close();
	}

}
