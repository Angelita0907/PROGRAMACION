package tablas;
import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		System.out.println();
		Repaso f = new Repaso();
		int [] TablaResultado = f.calculaTabla();
		
		//Recorre por valor la tabla
		for (int valor : TablaResultado) 
		{
			System.out.println(valor);
		}
		//pedir numero a buscar
		
		//llamar a funcion busca elemento (numero)
		System.out.println(f.buscaElemento(7, TablaResultado));

	}
	
	int [] calculaTabla() 
	{
		int [] tabla = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < tabla.length; i++) 
		{
			System.out.print("Introduce numero: ");
			tabla[i] = sc.nextInt();
		}
		
		sc.close();
		return tabla;
	}
	
	boolean buscaElemento (int numero, int [] tabla) 
	{
		int i = 0;
		boolean encontrado = false;
		/*Los for no es lo mejor para las búsquedas
		
		for (int i = 0; i < tabla.length; i ++) 
		{
			if (tabla[i] == numero)
			{
				encontrado = true;
			}		
		}
		*/
		
		/* Lo haremos con while:
		- mientras no lo encuentre y haya elementos*/
		
		while (!encontrado && i < tabla.length) 
		{
			if (tabla[i] == numero)
			{
				encontrado = true;
			}
			
			i++;
		}
		
		return encontrado;
	}

}
