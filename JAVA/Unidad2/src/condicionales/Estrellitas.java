package condicionales;
import java.util.Scanner;
public class Estrellitas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		
		int numero = sc.nextInt();
		int triangulo = 0;
		String estrella = "";
		while (numero != triangulo) {
				estrella +="*";
				System.out.println(estrella);
				triangulo +=1;	
		}
		sc.close();
	}

}
