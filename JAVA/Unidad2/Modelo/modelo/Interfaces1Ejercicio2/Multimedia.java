package modelo.Interfaces1Ejercicio2;

public abstract class Multimedia extends Recurso {

	private String nombre;
	private String genero;
	private int diasPrestamo;

	public Multimedia(int id, String ubicacion, String nombre, String genero, int diasPrestamo) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
		this.diasPrestamo = 10;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

}
