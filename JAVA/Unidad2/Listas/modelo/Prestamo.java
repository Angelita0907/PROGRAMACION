package modelo;

import java.time.LocalDate;
import java.util.Objects;

import listas.Boletin1Ejercicio3.Libro;

public class Prestamo {
	
	private int id;
	private Libro libro;
	private String dniUsuario;
	private LocalDate fechaPresamo;
	
	public Prestamo(int id, Libro libro, String dniUsuario, LocalDate fechaPresamo) {
		super();
		this.id = id;
		this.libro = libro;
		this.dniUsuario = dniUsuario;
		this.fechaPresamo = fechaPresamo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public LocalDate getFechaPresamo() {
		return fechaPresamo;
	}

	public void setFechaPresamo(LocalDate fechaPresamo) {
		this.fechaPresamo = fechaPresamo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniUsuario, fechaPresamo, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(dniUsuario, other.dniUsuario) && Objects.equals(fechaPresamo, other.fechaPresamo)
				&& Objects.equals(libro, other.libro);
	}
	
	

}
