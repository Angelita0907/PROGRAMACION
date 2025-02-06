package orientacion_objetos_EjemploClase;

public class Personas {
	
	String nombre;
	String apellidos;
	String dni;
	int edad;
	public Personas(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Ejemplo2Personas [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	} 
	
	

}
