package herencias_EjemploClase;

public class Profesor extends Persona {
	
	private String nombreDepartamento;

	public Profesor(String dni, String nombre, String apellidos, String nombreDepartamento) {
		super(dni, nombre, apellidos);
		this.nombreDepartamento = nombreDepartamento;
	}

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombreDepartamento=" + nombreDepartamento + ", dni=" + getDni() + ", nombre=" + getNombre()
				+ ", apellidos=" + getApellidos() + "]";
	}

}
