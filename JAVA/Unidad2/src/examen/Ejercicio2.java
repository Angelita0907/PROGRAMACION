package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        
		//Angela Chica Montero
		
		/*
		 * String [] funcion escribePalabras()
		 * {
		 * String [] palabras = sc.nextLine();
		 * - recibe las palabras separadas por comas
		 * 
		 * return listaPalabras;
		 * }
		 * 
		 * funcion separaPalabras(String [] listaPalabras)
		 * {
		 * Cadena con palabras separadas (split)
		 * 
		 * return listaPalabrasSeparadas;
		 * }
		 * 
		 * funcion buscarVocal()?
		 * {
		 * String [] vocales = {a,e,i,o,u};
		 * busca vocales en la lista de palabras, posicion a posicion,
		 * luego la usamos en la siguiente para contar si tiene más de 3
		 * }
		 * 
		 * void funcion contarVocalesConsecutivas (String [] listaPalabrasSeparadas)
		 * {
		 * contadorvocales = 0;
		 * for()
		 * {
		 * if(contar si tiene mas de 3 vocales)
		 * si encuentra alguna con más de 3 de ellas suma en el contador
		 * e imprime que palabras son
		 * } 
		 * }
		 * */
		
		Ejercicio2 f = new Ejercicio2();
		Scanner sc = new Scanner(System.in);
		
		// para probar que funcionan por separado solo se usaria la ultima para mostrar
		String listaPalabras = f.escribePalabras(sc);
		System.out.println(listaPalabras);
		String [] separadas = f.separaPalabras(listaPalabras);
		System.out.println(separadas);
		//mas3Vocales = f.contarVocalesConsecutivas();

	}
	
	String escribePalabras(Scanner sc)
	{
		System.out.print("Indica las palabras que desee: ");
		String palabras = sc.nextLine();
		return palabras;
	}
	
	String [] separaPalabras (String palabras)
	{
		String [] separadas = palabras.split(",");
		
		for (int i = 0; i < separadas.length; i++)
		{
			System.out.println(separadas[i]);
		}
		return separadas;
	}
	
	// no creo que sea la mejor opcion o juntarlo o con ultima funcion?
	int contarVocales(String [] separadas)
	{
		String [] vocales = {"a","e","i","o","u"};
		int conVocales = 0;
		
		return conVocales;
	}
	
	void contarVocalesConsecutivas (String [] separadas)
	{
		int contaradorVocales= 0;
		String palabras3vocales;
		
		for (int i = 0; i < separadas.length;i++)
		{
			//buscar si tiene mas de 3 vocales
			if ()
			{
				
			}
		}
		
		
	}

}
