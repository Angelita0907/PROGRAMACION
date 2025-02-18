package ChicaSimulacionEmpleados;

import java.util.Objects;

public class Administrativo extends Empleado{

	private int extraProductividad;

	public Administrativo(String nombre, String dni, int salarioBase, int extraProductividad) {
		super(nombre, dni, salarioBase);
		this.extraProductividad = extraProductividad;
	}

	protected int getExtraProductividad() {
		return extraProductividad;
	}

	protected void setExtraProductividad(int extraProductividad) {
		this.extraProductividad = extraProductividad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(extraProductividad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return extraProductividad == other.extraProductividad;
	}

	
	
	@Override
	public String toString() {
		return "Administrativo [extraProductividad=" + extraProductividad + ", getExtraProductividad()="
				+ getExtraProductividad() + ", calcularSalario()=" + calcularSalario() + ", getNombre()=" + getNombre()
				+ ", getDni()=" + getDni() + "]";
	}

	@Override /*cambiamos metodo del padre para los hijos*/
	protected int calcularSalario()
	{
		int salario = 0;
		
		return salario;
	}
	
}
