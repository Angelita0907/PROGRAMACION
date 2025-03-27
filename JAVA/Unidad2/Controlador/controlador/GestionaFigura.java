package controlador;

import modelo.Figura;
import modelo.Triangulo;
import modelo.Cuadrado;

public class GestionaFigura {

	public static void main(String[] args) {
		
		Figura cuadrado1 = new Cuadrado("verde", 2);
		Figura triangulo1 = new Triangulo("amarillo", 3, 5);
		
		System.out.println(cuadrado1.calcularArea());
		System.out.println(triangulo1.calcularArea());

	}

}
