package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {

	public String nombre;
	public int edad;
	public String estado;
	public LocalDate fechaNacimiento;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(estado, other.estado) && Objects.equals(nombre, other.nombre);
	}

	// metodos
	public abstract String muestra();//toString

	public LocalDate cumpleaños() {
		return fechaNacimiento;
	}

	public boolean morir() {
		boolean muerte = false;
		if (edad > 20) {
			muerte = true;
		}
		return muerte;
	}

	public abstract boolean habla();

}
