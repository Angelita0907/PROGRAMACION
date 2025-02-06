package boletin8;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Ejercicio2 f = new Ejercicio2();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int numArboles = sc.nextInt();
		
		char [] tipo = new char [numArboles] ;
		double [] diametro = new double [numArboles];
		double [] altura = new double [numArboles];
		int[] edades = new int[numArboles];
		
		// variables para llamar a las funciones necesarias
		int numArbolTotales = f.cargaDatos(tipo,diametro, altura, edades);
		double mediaAltura = f.CalculamediaAltura(altura);
		double alturaMax = f.calculaAlturaMax(altura);
		double alturaMin = f.caculaAlturaMin(altura);
		double diamMax = f.calculaDiametroMax(diametro);
		double diamMin = f.calculaDiametroMin(diametro);
		double mediaEdades = f.calculaMediaEdades(edades);
		
		if (f.existenMas30metros(altura))
		{
			System.out.println("Existen árboles de mas de 30 mts");
		}
	}
	
	double calculaAlturaMaxima (double [] altura)
	{
		double maximo = 0;
		for (int i =0; i < altura.length; i++)
		{
			if (maximo < altura[i])
			{
				maximo = altura[i];
			}
		}
		return maximo;
	}
	
	boolean existenMas30Metros(double [] altura)
	{
		boolean existen = false;
		int i = 0;
		while(i <altura.length && !existen)
		{
			if(altura[i] > 30)
			{
				existen = true;
			}
		
			i++;
		}
		return existen;
	}
	
	int cargaDatos (String [] tipo, double [] diametro,double [] altura, int [] edades)
	{
		int numTipoB = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numTipoB; i++) 
		{
			System.out.println("Tipo de árbol: A o B");
			tipo[i] = input.next().toUpperCase();
			System.out.println("Diametro: ");
			diametro[i] = input.nextDouble();
			System.out.println("Altura: ");
			altura[i] = input.nextDouble();
			System.out.println("Tipo B:");
			if (tipo.equals("B"))
			{
				System.out.println("Edad: ");
				edades[i] = input.nextInt();
			}
			
		}
		
		return numTipoB;
	}
	
	double CalculamediaAltura (double [] altura)
	{
		double media = 0;
		double sumaAltura = 0;
		
		for (int i = 0; i < altura.length; i++)
		{
			sumaAltura = sumaAltura+ altura[i];
		}
		
		media = sumaAltura/altura.length;
		
		return media;
	}
	
	double calcularAlturaMax(double [] altura) 
	{
		double maxAltura = 0;
		
		return maxAltura;
	}

}
