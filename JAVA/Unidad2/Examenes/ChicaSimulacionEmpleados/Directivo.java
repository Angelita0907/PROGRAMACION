package ChicaSimulacionEmpleados;

import java.util.Objects;

public final class Directivo extends Empleado // no se extiende a ninguno mas acaba con él (falta poner) 
	{

	private int bonificacionSalario;

	public Directivo(String nombre, String dni, int salarioBase, int bonificacionSalario) {
		super(nombre, dni, salarioBase);
		this.bonificacionSalario = bonificacionSalario;
	}

	protected int getBonificacionSalario() {
		return bonificacionSalario;
	}

	protected void setBonificacionSalario(int bonificacionSalario) {
		this.bonificacionSalario = bonificacionSalario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonificacionSalario);
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
		Directivo other = (Directivo) obj;
		return bonificacionSalario == other.bonificacionSalario;
	}

	@Override
	public String toString() {
		return "Directivo [bonificacionSalario=" + bonificacionSalario + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + ", calcularSalario()=" + calcularSalario() + "]";
	}

	@Override
	public int calcularSalario () {
	    int salarioañadir =  (getSalarioBase()*bonificacionSalario)/100;
	    int salariototal= getSalarioBase()+salarioañadir;
	    return salariototal;
	}
	
}
