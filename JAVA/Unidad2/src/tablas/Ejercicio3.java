package tablas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
/* Escribe un programa que dada una tabla de enteros ordenados, busque un elemento. Devolviendo:
	- La posición en la que se encuentra el elemento
	- El valor en negativo dónde debería aparecer el elemento en el caso en el que el elemento no exista. 
*/
		Scanner sc = new Scanner(System.in);
		
		int lista [] = {1,3,4,7};
		
		int lista_pos = 0;

		
		System.out.print("Que posición desea encontrar (indique número): ");
		int numero = sc.nextInt(); 
		
		boolean encontrado = false;
		
		while(!encontrado)
		{
			if (numero == lista[lista_pos]) 
			{
				System.out.print(lista_pos);
				encontrado = true;
			}
			
			else {
				if (numero > lista[lista_pos] && numero < lista[lista_pos + 1] )
					{
				System.out.print(-(lista_pos +1));
				encontrado = true;
					}
				}

		}
		
		sc.close();
		
		
	}

}
