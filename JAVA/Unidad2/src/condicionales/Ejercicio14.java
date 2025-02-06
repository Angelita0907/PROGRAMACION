package condicionales;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica tu nota (0-100): ");
		int nota = sc.nextInt();
		String letra = null;
		if (nota > 90)
		{
			letra ="A";
		}
		else if (nota < 90 && nota > 80)
		{
			letra = "B";
		}
		else if (nota < 90 && nota > 80)
		{
			letra = "C";
		}
		else if (nota < 90 && nota > 80)
		{
			letra = "D";
		}
		else if (nota < 90 && nota > 80)
		{
			letra = "F";
		}
		
		System.out.println("La nota era: "+nota+" y es quivalente a: "+ letra);
		
		sc.close();
	}

}
