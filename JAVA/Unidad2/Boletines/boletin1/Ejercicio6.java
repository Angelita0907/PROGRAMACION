package boletin1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.print("Indica un número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		while (i <10)
		{
			i ++;
			System.out.println(num + "x"+ i +"="+ (num*i));

		}				
	sc.close();
	}

}
