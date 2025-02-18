package SimulacroExamenJava;

import java.util.Objects;

public class Administrativo extends Empleado {
	private int ExtraProductividad;

	public Administrativo(String nombre, String dNI, int salarioBase, int extraProductividad) {
		super(nombre, dNI, salarioBase);
		ExtraProductividad = extraProductividad;
	}

	protected int getExtraProductividad() {
		return ExtraProductividad;
	}

	protected void setExtraProductividad(int extraProductividad) {
		ExtraProductividad = extraProductividad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ExtraProductividad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return ExtraProductividad == other.ExtraProductividad;
	}

	@Override
	public String toString() {
		return "Administrativo [ExtraProductividad=" + ExtraProductividad + "]";
	}
	int calcularSalarioAdministrativo(int SalarioBase){
		System.out.println();;
		return SalarioBase;
}}
