package boletin1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.print("Indica el ancho:");
		Scanner sc = new Scanner(System.in);
		int ancho = sc.nextInt();
		System.out.print("Indica el alto:");
		int alto = sc.nextInt();
		
		System.out.print("El área del triángulo es: "+(alto*ancho));
		
		sc.close();
	}

}
