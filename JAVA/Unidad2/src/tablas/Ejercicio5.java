package tablas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Comparar contenido de dos tablas. Escribe un programa que compare 
		 si dos tablas ordenadas tienen los mismos valores.*/
		
		Scanner sc = new Scanner(System.in);

		boolean igual = false;
		
		int lista1 [] = {1,2,3,4};
		int lista2 [] = {1,2,5,7};
		
		int i = 0;
		
		while(!igual) 
		{
			if (lista1[i] == lista2[i]) 
			{
				igual = true;
			}
			
			else
			{
				igual = false;
			}
			
			i++;
		}
		System.out.print(igual);
		sc.close();
	}

}
