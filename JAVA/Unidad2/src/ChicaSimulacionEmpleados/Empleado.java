package ChicaSimulacionEmpleados;

import java.util.Objects;

public class Empleado {
	
	private String nombre;
	private String dni;
	private int salarioBase;
	
	public Empleado(String nombre, String dni, int salarioBase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salarioBase = salarioBase;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
		/*comparar dni*/
		
	}

	protected int getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, salarioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	protected void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	protected void validarSalario()
	{
		if (salarioBase < 0)
		{
			System.out.println("Error salario negativo/incorrecto");
			salarioBase = 1134;
		}
	}
	
	protected int calcularSalario()
	{
		int salario = 0;
		
		return salario;
	}
	
}
