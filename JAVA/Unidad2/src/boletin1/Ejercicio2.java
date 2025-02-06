package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dame un número: ");
		Scanner miEscaner = new Scanner(System.in);
		int numero = miEscaner.nextInt();

		if (numero > 7) {
			System.out.println("Es mayor que 7");
			System.out.println("Hola");
		}
		
		else {
		System.out.println("Es menor que 7");
		}
		
		miEscaner.close();
	}

}
