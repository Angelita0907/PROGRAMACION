package entornos;

import java.util.Scanner;

public class EjercicioDni {

	public static void main(String[] args) {
		String[] tabla_letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
				"V", "H", "L", "C", "K", "E" };
		
		EjercicioDni f = new EjercicioDni();

		Scanner sc = new Scanner(System.in);
		System.out.print("Indica tu dni (sin letra): ");
		int dniSinLetra = sc.nextInt();

		int resto = f.calculaLetra(dniSinLetra);
		
		String dniconLetra = f.encuentraLetra(tabla_letras, resto);
		System.out.println("La letra del DNI es: "+ dniconLetra);
		
	}

	int calculaLetra(int dniSinLetra) {

		return dniSinLetra%23;

	}
	
	String encuentraLetra(String[] tabla_letras, int resto)
	{
		return tabla_letras[resto];

	}

}
