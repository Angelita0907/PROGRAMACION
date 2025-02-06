package condicionales;
import java.util.Scanner;
public class EjemploDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		do {
			System.out.print("1 -- Asignar coche a surtidor y repostar");
		    System.out.print("2 -- Consultar estado de surtidor");
		    System.out.print("3 -- Asignar precio al surtidor");
		    System.out.print("4 -- Recargar surtidor");
		    System.out.print("5 -- Cerrar el programa y salir");
		    
		    System.out.print("Que operación desea realizar: ");
		    opcion = sc.nextInt();
		    
		    switch (opcion) {
		    case 1:
		    	System.out.print("Ha seleccionado Asignar surtidor");
		    	break;
		    
		    case 2:
		    	System.out.print("Ha seleccionado Consultar Estado surtidor");
		    	break;
		    
		    case 3:
		    	System.out.print("Ha seleccionado Asignar Precio surtidor");
		    	break;
		    
		    case 4:
		    	System.out.print("Va a Recargar el surtidor");
		    	break;
		    
		    case 5: 
		    	System.out.print("Cierra el programa");
		    	break;
		    	
		    }
		    
		} while (opcion != 5);
		
		sc.close();
	}

}
