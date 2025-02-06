package funciones;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		Repaso f = new Repaso();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuanto snúmeros quieres introducir: ");
		int numeros = sc.nextInt();
		System.out.println(f.SumaNumPar(numeros,sc));
		sc.close();
	}

	int SumaNumPar(int numeros, Scanner scanner) {
		int resultado = 0;
		for (int i = 0; i < numeros; i++) {
			System.out.print("Indica un número: ");
			int numero = scanner.nextInt();
			if (numero % 2 == 0) {
				resultado = resultado + numero;
			}
		}
		return resultado;
	}

}
