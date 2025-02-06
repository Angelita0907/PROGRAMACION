package boletin8;

import java.util.Scanner;

import parecidosExamen.Ejercicio_1;

public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio1 f = new Ejercicio1();
		Scanner sc = new Scanner(System.in);
		
		String grupo = sc.next();
		
		int [] notas ;

	}
	
	boolean existenSobresalientes (double [] notas) 
	{
		boolean sobresaliente = false;
		int pos = 0;
		
		while (pos < notas.length && !sobresaliente) 
		{
			if (notas[pos] < 9) 
			{
				sobresaliente = true;
			}
			
			else
				pos ++;
		}
		
		return sobresaliente;
	}
	
	String [] cargaNombreAlumno (String [] grupo)
	{
		int numAlumno = f.calculaNumAlumnos(grupo);
		
		String [] nombreAlum = new String [numAlumno];
		
		return nombreAlum;
	}
	
	int cargaNotasAlumno (String [] grupo)
	{
		int numAlumno = f.calculaNumAlumnos(grupo);
		
		double [] notasA = new double [numAlumno];
		
		for (int i = 0; i < numAlumno; i++)
		{
			double primer = sc
			double segundo = sc
			double tercero = sc
		}
		
		return
	}
	
	// se usa en carga nombre y carga nota alumno
	int calculaNumAlumnos (String grupo) 
	{
		int num = 0;
		
		return num;
	}
	
	int calculaNumSuspenso (int [] notasAlum)
	{
		int suspensos = 0;
		
		for (int i = 0; i < notasAlum.length; i++) 
		{
			if (notasAlum[i] < 5)
			{
				suspensos = suspensos +1;
			}
		}
		
		return suspensos;
	}
	

}
