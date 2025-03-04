package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public class Gato extends Mascota {

	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super();
		this.color = color;
		this.peloLargo = peloLargo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	//toString
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

}
