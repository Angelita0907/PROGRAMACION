package entornos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Ejercicio1 f = new Ejercicio1();
		
		f.pedirDNI();
		

	}
	String [] abecedario() {
		String[] letra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
                "C", "K", "E" };
		return letra;
	}

	int pedirDNI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica los números de su DNI: ");
		String numDNI = sc.nextLine();
		int resto = 0;
		
		if (numDNI.length() > 8)
		{
			System.out.println("Error, vuelva a introducir su dni");
			numDNI = sc.nextLine();
		}
		
		else
		{
			resto = Integer.parseInt(numDNI)%23;
			System.out.println(abecedario()[resto]);
		}
		return resto;
	}

	

}
