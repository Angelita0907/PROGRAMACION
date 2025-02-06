package funciones;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		Ejemplo1 f = new Ejemplo1();

		Scanner sc = new Scanner(System.in);

		System.out.print("Indica un número: ");
		int num1 = sc.nextInt();

		System.out.print("Indica otro número: ");
		int num2 = sc.nextInt();

		int resultado = f.sumaNumero(num1, num2);
		System.out.println("El resultado es: " + resultado);

		String[] listaNombre = f.generaLista();
		System.out.print(listaNombre);

		// Por valor
		for (String nombre : listaNombre) {
			System.out.println(nombre);
		}
		// Por porsición
		for (int i = 0; i < listaNombre.length; i++) {
			System.out.println(listaNombre[i]);
		}

		sc.close();
	}

	int sumaNumero(int num1, int num2) {
		return num1 + num2;
	}

	String[] generaLista() {
		String[] nombres = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Indica un nombre: ");

		for (int i = 0; i < 5; i++) {
			String nombre = input.next();
			nombres[i] = nombre;
		}
		input.close();
		return nombres;
	}

}
