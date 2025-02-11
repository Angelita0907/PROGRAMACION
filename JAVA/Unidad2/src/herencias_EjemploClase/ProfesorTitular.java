package herencias_EjemploClase;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {
	
	private LocalDate fechaAdjudicacionPlaza;

	public ProfesorTitular(String dni, String nombre, String apellidos, String nombreDepartamento,
			LocalDate fechaAdjudicacionPlaza) {
		super(dni, nombre, apellidos, nombreDepartamento);
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	protected LocalDate getFechaAdjudicacionPlaza() {
		return fechaAdjudicacionPlaza;
	}

	protected void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", getNombreDepartamento()=" + getNombreDepartamento()
				+ ", getNombre()=" + getNombre() + "]";
	}
	

}
