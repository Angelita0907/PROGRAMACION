package modelo;

import java.util.Objects;

public class Circulo {

	private double radio;
	private static int contador = 0;
	private int id;
	private static final double PI = 3.1416;


	public Circulo(double radio) {
		super();
		this.radio = radio;
		this.id = contador+1;
		contador = contador+1;
		
	}

	protected double getRadio() {
		return radio;
	}

	protected void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
	
	

	@Override
	public String toString() {
		return "Circulo radio=" + radio + ", id=" + id + " area: "+ calculaArea();
	}

	public double calculaArea()
	{
		return PI*(this.radio*this.radio);
	}
	
	
}
