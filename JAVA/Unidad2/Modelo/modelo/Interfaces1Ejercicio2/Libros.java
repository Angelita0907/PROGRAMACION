package modelo.Interfaces1Ejercicio2;

public class Libros extends Recurso {

	private String autor;
	private String editorial;
	private String genero;
	private int diasPrestamos;

	public Libros(int id, String ubicacion, String autor, String editorial, String genero, int diasPrestamos) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.diasPrestamos = 21;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPrestamos() {
		return diasPrestamos;
	}

	public void setDiasPrestamos(int diasPrestamos) {
		this.diasPrestamos = diasPrestamos;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int devuelveDiasPrestado() {
		// TODO Auto-generated method stub
		return getDiasPrestamos();
	}

}
