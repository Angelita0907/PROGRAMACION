package herencias_EjemploClase;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{

	private LocalDate fechaFindeContrato;

	public ProfesorInterino(String dni, String nombre, String apellidos, String nombreDepartamento,
			LocalDate fechaFindeContrato) {
		super(dni, nombre, apellidos, nombreDepartamento);
		this.fechaFindeContrato = fechaFindeContrato;
	}

	protected LocalDate getFechaFindeContrato() {
		return fechaFindeContrato;
	}

	protected void setFechaFindeContrato(LocalDate fechaFindeContrato) {
		this.fechaFindeContrato = fechaFindeContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaFindeContrato=" + fechaFindeContrato + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() + "]";
	}

	
	
}
