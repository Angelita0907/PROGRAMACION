package entornos;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		PiedraPapelTijera f = new PiedraPapelTijera();

		int apuestaMaquina = r.nextInt(3);


		boolean ganador = false;
		
		while(ganador = true)
		{
			System.out.println("Indica apuesta: ");
			String apuestaHumano = sc.next().toUpperCase();
			
			if (apuestaHumano.equals("0")) {
                System.out.println("Fin del juego");
                break;
            }
			System.out.println("El usuario elige: "+apuestaHumano);
			System.out.println("La máquina elige: "+f.apuestaMaquina(apuestaMaquina));

			switch (apuestaHumano)
			{
			
			case "PIEDRA":
				if (f.apuestaMaquina(apuestaMaquina).equals("PIEDRA")) {
					System.out.println("Empate");}
				else if (f.apuestaMaquina(apuestaMaquina).equals("PAPEL")){
					System.out.println("Usuario gana");}
	            else {
	            	System.out.println("Usuario pierde");}
				break;
	        case "PAPEL":
	            if (f.apuestaMaquina(apuestaMaquina).equals("PIEDRA")) {
	            	System.out.println("Usuario gana");}
	            else if (f.apuestaMaquina(apuestaMaquina).equals("TIJERA")) {
	            	System.out.println("Usuario pierde");}
	            else {
	            	System.out.println("Empate");}
	            break;
	        case "TIJERA":
	            if (f.apuestaMaquina(apuestaMaquina).equals("PIEDRA")) {
	            	System.out.println("Usuario pierde");}
	                else if (f.apuestaMaquina(apuestaMaquina).equals("PAPEL")) {
	                	System.out.println("Usuario gana");}
	            else {
	            	System.out.println("Empate");}
	            break;
			
	        default:
                System.out.println("ERROR --> Indica: PIEDRA, PAPEL o TIJERA.");
                break;
			
			}
			apuestaMaquina = r.nextInt(3);
			
		}
		
	}

	String apuestaMaquina(int apuestaMaquina) {

		String apuesta;
		if (apuestaMaquina == 0) {
			apuesta = "PIEDRA";
		} else if (apuestaMaquina == 1) {
			apuesta = "PAPEL";
		} else {
			apuesta = "TIJERA";
		}
		return apuesta;
	}


}
