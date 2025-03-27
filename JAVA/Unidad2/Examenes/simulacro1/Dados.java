package simulacro1;

import java.util.Random;
import java.util.Scanner;

import tablas.Repaso;

public class Dados {
	public static void main(String[] args) {
	/*	
		Dados f = new Dados();
		
		Scanner sc = new Scanner(System.in);
		Random aleatorioR = new Random();
		*/
		int numDados, numApuesta;
		float dineroApuesta = 0;
		int numeroVecesJugado = 0;
		float dineroganancias = 0;
		String[] historialJugadas = new String [200];
		
		int opcion = 0; //imprimeMenu();
		
		//while (opcion < 3)
		//{
			/*switch (opcion)
			{*/
			/*
			case 1:{
				numApuesta = f.dameNumApuesta(sc);

				dineroApuesta= f.dameDineroApuesta(sc);

				numDados=f.tirarDadosySumar(aleatorioR);			

				dineroganancias= dineroganancias + f.calcularGanancias(numApuesta,dineroApuesta,numDados);

				numeroVecesJugado= numeroVecesJugado+1;

				//registraJugadaEnHistorico(numeroVecesJugado, numApuesta, numDados, dineroganancias);

				break;
			}
			*/
			/*case 2:{
				f.registraJugadaEnHistorico(historialJugadas, opcion, opcion, dineroApuesta, numeroVecesJugado);
				System.out.println();
				break;
			}
			}*/
			//opcion= f.imprimemenu();
		
	}
	
	int imprimemenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("APOSTAR 1");
		System.out.println("MOSTRAR HISTORIAL 2");
		System.out.println("RETIRARSE 3 ");
		int opcion=sc.nextInt();
		return opcion;
	}
	
	int dameNumApuesta(Scanner sc)
	{
		System.out.print("Dime el número de la apuesta: ");
		int apuesta = sc.nextInt();
		
		//validar apuesta
		
		return apuesta;
	}
	
	boolean validarNumApuesta(int numApuesta)
	{
		boolean valido = false;
		
		if (numApuesta < 2)
		{
			valido = true;
			System.out.println("Apuesta no válida, vuelva a introducir los números");
		}
		
		return valido;
	}
	
	int dameDineroApuesta(Scanner sc)
	{
		System.out.print("Dime cantidad de la apuesta: ");
		int dinero = sc.nextInt();
		// validar dinero
		
		return dinero;
	}
	
	boolean validarDinero(int dineroApuesta)
	{
		boolean valido = false;
		
		if (dineroApuesta > 0)
		{
			valido = true;
			System.out.println("Apuesta no válida, vuelva a introducir los números");
		}
		
		return valido;
	}
	
	int tirarDadosySumar (Random aleatorioR)
	{
		int num1 = aleatorioR.nextInt(6)+1;
		int num2 = aleatorioR.nextInt();
		
		int suma = num1+num2;
		
		return suma;
	}
	
	float calcularGanancias(int numApuesta, float dineroApuesta, int numDados)
	{
		float ganancias = 0;
		
		if (numApuesta == numDados)
		{ 
			ganancias = ganancias + (dineroApuesta*2);
			System.out.println("ganando");
		}
		else
		{
			ganancias = ganancias - dineroApuesta;
			System.out.println("perdiendo");
		}
		
		return ganancias;
	}
	
	void registraJugadaEnHistorico(String[] historico, int numDados, int numApuesta, float dineroApuesta, int numeroVecesJugado) {

        String resultado = "En la " + numeroVecesJugado + "ª jugada apostó al valor " + numApuesta + " y sumó " + numDados + ", ";

        if (dineroApuesta > 0) {

            resultado += "ganando " + dineroApuesta*2;

        } else {

            resultado += "perdiendo " + (-dineroApuesta);

        }

        historico[numeroVecesJugado - 1] = resultado;

    }

}