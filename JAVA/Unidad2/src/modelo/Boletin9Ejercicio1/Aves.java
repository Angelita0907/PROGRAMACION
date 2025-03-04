package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public abstract class Aves extends Mascota {

	private boolean pico;
	private boolean vuela;
	
	public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) {
		super();
		this.pico = pico;
		this.vuela = vuela;
	}

	public boolean isPico() {
		return pico;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	public abstract boolean volar();

}
