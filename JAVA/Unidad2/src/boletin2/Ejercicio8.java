package boletin2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica tu edad: ");
		int edad = sc.nextInt();
		double descuento;
		/*
		if (edad > 60) {
			descuento = 0.3;
			System.out.println("Tiene un 30% de descuento");
		}

		else {
			descuento = 0.1;
			System.out.println("Tiene un 10% de descuento");

		}
		*/
		
		descuento = (edad > 60) ? 0.3F :0.1F;
		
		System.out.print("Indica precio del producto: ");
		int precio = sc.nextInt();

		double total = precio - (precio * descuento);

		System.out.println("El producto con descuento es: " + total);

		sc.close();		
		
	}

}
