package modelo;

import java.util.Objects;

public class Persona {
	private static final double PI = 3.1416;
	private static int contador;
	private int id;
	private String nombre;
	private int edad;
	private String dni;

	public Persona(String nombre, int edad, double pi) {
		super();
		this.id = contador + 1;
		this.nombre = nombre;
		this.edad = edad;
		contador = contador + 1;
	}

	protected int getContador() {
		return contador;
	}

	protected void setContador(int contador) {
		this.contador = contador;
	}

	protected int getIdentificador() {
		return id;
	}

	protected void setIdentificador(int identificador) {
		this.id = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected double getPI() {
		return PI;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contador, edad, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return contador == other.contador && edad == other.edad && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona  id: " + id + ", nombre: " + nombre + ", edad: " + edad;
	}

	public static boolean validaSiDniValido(String dni) {
		boolean valido = false;
		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		} else {
			System.out.println("Error, dni no válido");
			valido = false;
		}
		return valido;
	}

}
