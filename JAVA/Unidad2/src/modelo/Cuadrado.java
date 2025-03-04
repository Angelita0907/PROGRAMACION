package modelo;

public class Cuadrado extends Figura {

	private double lado;

	   public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	public double calcularArea()
	   {
	       return lado*lado;
	   }

}
