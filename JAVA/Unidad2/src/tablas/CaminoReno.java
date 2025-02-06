package tablas;

import java.util.Scanner;

public class CaminoReno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] luces = new int[10];

		int encendida = 0;
		int fundida = 0;

		for (int contador = 0; contador < luces.length; contador++) {
			System.out.print("Se ha fundido esta luz?: ");
			String pregunta = sc.next().toLowerCase().toUpperCase();

			if (pregunta.equals("S")) {
				fundida++;
				contador++;
			}

			if (pregunta.equals("N")) {
				encendida++;
				contador++;
			}

			else {
				System.out.println("Quillo ayúdame: S o N");
			}
		}

		if (fundida >= 5) {
			System.out.println("¡¡Nos devuelven el dinero!!");
		}

		else {
			System.out.println("Recuenda no comprar más luces a ese vendedor");
		}

		System.out.println("Se encienden: " + encendida);
		System.out.println("Están fundidas: " + fundida);

		sc.close();
	}

}
