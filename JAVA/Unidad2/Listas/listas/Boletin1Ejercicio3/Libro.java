package listas.Boletin1Ejercicio3;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private int anyoPublicacion;
	private EstadoLibro estado;
	private int isbn;

	public Libro(String titulo, String autor, String genero, int anyoPublicacion, EstadoLibro estado, int isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anyoPublicacion = anyoPublicacion;
		this.estado = estado;
		this.setIsbn(isbn);
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	protected void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	protected EstadoLibro getEstado() {
		return estado;
	}

	protected void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(anyoPublicacion, autor, estado, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(anyoPublicacion, other.anyoPublicacion) && Objects.equals(autor, other.autor)
				&& estado == other.estado && Objects.equals(genero, other.genero)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", anyoPublicacion="
				+ anyoPublicacion + ", estado=" + estado + "]";
	}

}