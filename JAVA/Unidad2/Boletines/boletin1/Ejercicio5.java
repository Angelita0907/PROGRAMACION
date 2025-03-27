package boletin1;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.print("¿Tiene membresía premium? (si/no)");
		Scanner sc = new Scanner(System.in);
		boolean premium = sc.nextBoolean();
		
		System.out.print("Cuanto ha gastado en nuestro restaurante: ");
		int gasto = sc.nextInt();

		System.out.print("Indique su edad: ");
		int edad = sc.nextInt();
		
		if (premium && gasto > 50 || edad > 65) 
		{
			System.out.println("Tiene descuento");
			
		}
		
		else {
			System.out.println("No tiene descuento");
		}
		sc.close();
	}

}
