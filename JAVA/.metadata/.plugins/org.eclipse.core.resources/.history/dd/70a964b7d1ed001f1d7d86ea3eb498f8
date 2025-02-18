package SimulacroExamenJava;

import java.util.Objects;

public class Directivos extends Empleado {
	private int ExtraBonificacion;

	public Directivos(String nombre, String dNI, int salarioBase, int extraBonificacion) {
		super(nombre, dNI, salarioBase);
		ExtraBonificacion = extraBonificacion;
	}

	protected int getExtraBonificacion() {
		return ExtraBonificacion;
	}

	protected void setExtraBonificacion(int extraBonificacion) {
		ExtraBonificacion = extraBonificacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ExtraBonificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directivos other = (Directivos) obj;
		return ExtraBonificacion == other.ExtraBonificacion;
	}

	@Override
	public String toString() {
		return "Directivos [ExtraBonificacion=" + ExtraBonificacion + "]";
	}

	int calcularSalario(int SalarioBase){
		System.out.println("El salario de", " ", Nombre, " ", "es igual a", (SalarioBase * ExtraBonificacion)/100);
		return SalarioBase;
	}
	
}
