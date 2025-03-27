package boletin1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.print("Indique nombre de usuario:");
		Scanner sc = new Scanner(System.in);
		String usuario = sc.next();
		System.out.print("Indique su contraseña: ");
		String password = sc.next();
		
		if (usuario != "admin" && password != "secreta123")
		{
			System.out.println("Acceso concedido");
		}
		else {
			System.out.println("Acceso denegado");
		}
		sc.close();
	}

}
