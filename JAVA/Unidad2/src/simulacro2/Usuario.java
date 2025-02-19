package simulacro2;

import java.util.Objects;

public class Usuario {
	
	private String dni;
	private String nombre;
	private String nombreDepto;
	
	public Usuario(String dni, String nombre, String nombreDepto) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nombreDepto = nombreDepto;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getNombreDepto() {
		return nombreDepto;
	}

	protected void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, nombreDepto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", nombreDepto=" + nombreDepto + "]";
	}
	
}
