package excepciones.introductoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        int numero; 
	        try {
	        	numero = scanner.nextInt(); 
	        	String cadena = "";
	        	System.out.println(cadena.charAt(10));
	        	System.out.println("Dentrás del input");
	        }
	        catch (InputMismatchException e) {
				System.out.println("Entro en el catch1: " + e.getCause());
				System.out.println("Entro en el catch1: " + e.getMessage());
		        System.out.print("Ingresa un número entero: ");
				numero = scanner.nextInt(); 
	        }
	        
	        catch (StringIndexOutOfBoundsException e2) {
	        	System.out.println("Entro en el catch2: " + e2.getCause());
				System.out.println("Entro en el catch2: " + e2.getMessage());

				}
	        
	        finally {
	        	System.out.println("Pase lo que pase, salgo");
			}
	        System.out.println("Sigo detrás del finally");
	        /*System.out.print("Ingresa otro número para dividir: ");
	        
	        int divisor = scanner.nextInt(); 
	        
	        int resultado = numero / divisor;

	        System.out.println("El resultado de la división es: " + resultado);

	        scanner.close();*/
	    }
	}