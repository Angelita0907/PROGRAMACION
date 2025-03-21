package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public class Canario extends Aves {

	private String color;
	private boolean canta = true;

	public Canario(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	@Override
	public boolean volar() {
		return true;
	}

	@Override
	public String muestra() {
		return "Canario [color=" + color + ", canta=" + canta + ", nombre=" + nombre + ", edad=" + edad + ", estado="
				+ estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public boolean habla() {
		return canta;
	}

}
