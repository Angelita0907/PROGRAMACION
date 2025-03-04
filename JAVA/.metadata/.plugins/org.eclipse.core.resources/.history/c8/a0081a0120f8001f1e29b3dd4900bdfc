package controlador;

import java.util.Scanner;
import modelo.CorreoElectronico;

public class GestionaCorreo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CorreoElectronico.validaCorreo("aaaa@aaaa.com");
	
	boolean sigo = true;
	while (sigo)
	{
		System.out.println("Indica correo electrónico: ");
		//pido correo por teclado
		String correo = sc.nextLine();
		int contadorCorreosValidos = 0;
		CorreoElectronico [] correos = new CorreoElectronico [5];
 		if (CorreoElectronico.validaCorreo(correo))
		{
			CorreoElectronico c = new CorreoElectronico(correo);
			correos[contadorCorreosValidos] = c;
			contadorCorreosValidos = contadorCorreosValidos+1;
		}
 		// es lo mismo que el if siguiente sigo = (contadorCorreosValidos == 5);
 		// (contadorCorreosValidos !=5)? true:false;
 		if (contadorCorreosValidos ==5 ) 
 			{sigo = false;}
	
	}
	
	}

}
