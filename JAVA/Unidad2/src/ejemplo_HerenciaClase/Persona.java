package ejemplo_HerenciaClase;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private float salario;
	
	public Persona(String nombre, String apellidos, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre, salario);
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
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	protected void concentrarse()
	{
		System.out.println("Hay que concentrarse, padre");
	}
	
	// Sobrecarga
	protected void concentrarse(String lugar)
	{
		System.out.println("metodo concentrarse del padre con String: "+ lugar);
	}
	protected void concentrarse(int dias)
	{
		System.out.println("metodo concentrarse del padre con dias:  "+ dias);
	}
	
	
	protected void viajar(String lugar)
	{
		System.out.println("Nos vamos de viaje, padre");
	}

}
