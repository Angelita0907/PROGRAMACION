package SimulacroExamenJava;

import java.util.Objects;

public class Empleado {
	protected String Nombre;
	private String DNI;
	protected int SalarioBase;

	public Empleado(String nombre, String dNI, int salarioBase) {
		super();
		Nombre = nombre;
		DNI = dNI;
		SalarioBase = salarioBase;

	}

	protected String getNombre() {
		return Nombre;
	}

	protected void setNombre(String nombre) {
		Nombre = nombre;
	}

	protected String getDNI() {
		return DNI;
	}

	protected void setDNI(String dNI) {
		DNI = dNI;
	}

	protected int getSalarioBase() {
		return SalarioBase;
	}

	/* Validacion Salario Base */
	protected void setSalarioBase(int salarioBase) {
		if (SalarioBase >= 0) {
			this.SalarioBase = salarioBase;
		} else {
			System.out.println(
					"El salario no puede ser negativo, asignado automaticamente el salario minimo interprofesional que es igual a 1134 euros");
			this.SalarioBase = 1134;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, Nombre, SalarioBase);
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
		return Objects.equals(DNI, other.DNI) && Objects.equals(Nombre, other.Nombre)
				&& SalarioBase == other.SalarioBase;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre=" + Nombre + ", DNI=" + DNI + ", SalarioBase=" + SalarioBase + "]";
	}

}
