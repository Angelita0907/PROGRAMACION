package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public class Perro extends Mascota {

	private String raza;
	private boolean pulgas;

	public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super();
		this.raza = raza;
		this.pulgas = pulgas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String muestra() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + ", nombre=" + nombre + ", edad=" + edad + ", estado="
				+ estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

}
