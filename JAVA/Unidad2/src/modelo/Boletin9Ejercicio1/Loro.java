package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public class Loro extends Aves {

	private String origen;
	private boolean hablar = true;

	public Loro(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela,
			String origen, boolean hablar) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.hablar = hablar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHablar() {
		return hablar;
	}

	public void setHablar(boolean hablar) {
		this.hablar = hablar;
	}

	@Override
	public boolean volar() {
		return true;
	}

	@Override
	public String muestra() {
		return "Loro [origen=" + origen + ", hablar=" + hablar + ", nombre=" + nombre + ", edad=" + edad + ", estado="
				+ estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public boolean habla() {
		return hablar;
	}
	
	public String saluda()
	{
		return "Hola";
	}

}
