package ejemplo_HerenciaClase;

import java.util.Objects;

public class Entrenador extends Persona {

	private String idFederacion;
	
	/*public Entrenador() {
		super();
	}*/

	public Entrenador(String nombre, String apellidos, int edad, float salario, String idFederacion) {
		super(nombre, apellidos, edad, salario);
		this.idFederacion = idFederacion;
	}

	public Entrenador(String nombre, String apellidos, int edad, float salario) {
		super(nombre, apellidos, edad, salario);
		this.idFederacion = "ESP";
	}

	protected String getIdFederacion() {
		return idFederacion;
	}

	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getSalario()=" + getSalario() + "]";
	}

	// para saber que es el mismo
	@Override
	protected void concentrarse() {
		System.out.println("Hay que concentrarse, Entrenador");
	}

	@Override
	protected void viajar(String lugar) {
		System.out.println("Nos vamos de viaje, entrenador");
	}
	
	void dirigirPartido()
	{
		System.out.println("Dirigir partido Entrenador");
	}
}
