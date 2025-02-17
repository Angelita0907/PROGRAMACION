package entornos;

import java.util.Scanner;

public class NumerosdelReves {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int [] listaNumeros = new int[10];
		System.out.println("Introduce los números que desee (maximo 10): ");
		//Rellenamos la lista
		for (int i  = 0; i < 10; i++)
		{
			listaNumeros [i] = sc.nextInt();
		}
		
		System.out.println("orden inserso");
		for (int i = 9; i >=0; i --)
		{
			System.out.println(listaNumeros[i]);
		}
	}

}
