package boletin1;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("========================================");
		System.out.print("CALCULADORA");
		System.out.print("========================================");
		System.out.print("Introduzca + si desea sumar");
		System.out.print("Introduzca - si desea restar");
		System.out.print("Introduzca * si desea multiplicar");
		System.out.print("Introduzca / si desea dividir");
		System.out.print("Introduzca @ salir del programa");
		System.out.print("========================================");
		System.out.print("Indica que operación deseas realizar: ");
		String operacion = sc.next();
		while (operacion != "@") {
			System.out.print("Introduce un número: ");
			int num1 = sc.nextInt();
			System.out.print("Introduce otro número: ");
			int num2 = sc.nextInt();
			switch (operacion) {
			case "+":
				System.out.println("Suma: " + (num1 + num2));
				break;
			case "-":
				System.out.println("Resta: " + (num1 - num2));
				break;
			case "*":
				System.out.println("Multiplicacion: " + (num1 * num2));
				break;
			case "/":
				System.out.println("División: " + (num1 / num2));
				break;
			default:
				System.out.println("Operación no válida.");
			}
			System.out.print("========================================");
			System.out.print("CALCULADORA");
			System.out.print("========================================");
			System.out.print("Introduzca + si desea sumar");
			System.out.print("Introduzca - si desea restar");
			System.out.print("Introduzca * si desea multiplicar");
			System.out.print("Introduzca / si desea dividir");
			System.out.print("Introduzca @ salir del programa");
			System.out.print("========================================");
			System.out.print("Introduce la operación que deseas: ");
			operacion = sc.next();

		}
		sc.close();
	}
}

