package cadenas;

import java.util.Scanner;

public class RepasoCadenas {

	public static void main(String[] args) {

		RepasoCadenas f = new RepasoCadenas();
		Scanner sc = new Scanner(System.in);
		String[] palabras = f.cargaTabla();
		f.imprimeTabla(palabras);
		
		String[] nums = f.cargaNumeros(palabras);
		f.imprimeTabla(nums);
		
		String [] minusculas = f.cargaCadenasMinusculas(palabras);
		f.imprimeTabla(minusculas);
	}

	String[] cargaTabla() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica una frase: ");
		String frase = sc.nextLine();
		String[] tabla = frase.split(" ");

		return tabla;
	}

	// funcion para imprimir tabla por valor
	void imprimeTabla(String[] tabla) {
		for (String elemento : tabla) {
			System.out.println(elemento);
		}
		// no se pone return
	}

	// Muestra de la lista los que son numeros
	String[] cargaNumeros(String[] tabla) {
		String[] numeros = new String[tabla.length];
		for (int i = 0; i < tabla.length; i++) {
			// si tabla [i] == numero se guarda
			// pasamos la posicion de cada cadena para ver si es o no
			if (cadenaEsNumero(tabla[i])) {
				numeros[i] = tabla[i];
			}

			else {
				numeros[i] = " ";
			}
		}

		return numeros;
	}

	// usamos esta función para ver si es numero en la funcion anterior
	boolean cadenaEsNumero(String palabra) {
		boolean es = true;

		for (int i = 0; i < palabra.length(); i++) {
			Character c = palabra.charAt(i); // devuelve caracter de la posición i
			es = es && Character.isDigit(c);

		}

		return es;
	}

	String[] cargaCadenasMinusculas(String[] tabla) {
		String[] minuscula = new String[tabla.length];

		for (int i = 0; i < tabla.length; i ++)
		{
			if (esMinuscula(tabla[i]))
			{
				minuscula[i] = tabla[i];
			}
			
			else 
			{
				minuscula[i] = " ";
			}
		}
		
		return minuscula;
	}

	boolean esMinuscula(String palabra)
	{
		
		boolean esMin = false;
		// primer caracter es minúscula
		if (Character.isLowerCase(palabra.charAt(0)))
		{
			esMin = true;
		}
		
		return esMin;
	}
	

	//cambia la tabla de String a solo cadenas
	String [] convierteTabla (String [] palabras)
	{
		String[] convertida = new String[palabras.length];
		
		for (int i = 0; i < palabras.length; i ++)
		{
			convertida[i] = modificaPalabraMinuscula(palabras[i]);
		}
		
		return convertida;
		
	}

	String modificaPalabraMinuscula(String palabra)
	{
		String palabraConvertida ="";
		// convierte primer caracter a mayuscula: palabra.charAt(0)
		Character primero = Character.toUpperCase(palabra.charAt(0));
		
		// si es una O lo cambio por un 0
		// cambio ultimo caracter a la longitud de la palabra: palabra.charAt(palabra.length()-1)
		return palabraConvertida;
	}
	
	
}