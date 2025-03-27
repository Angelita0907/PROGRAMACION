package modelo;

public class Triangulo extends Figura {

	double base;
	double altura;

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double calcularArea() {
		return base*altura;
	}

}
