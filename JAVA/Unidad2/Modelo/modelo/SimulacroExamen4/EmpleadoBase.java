package modelo.SimulacroExamen4;

public class EmpleadoBase extends Empleados {
	
	 private Puesto puestoTrabajo;

	public Puesto getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(Puesto puestoTrabajo) {
		
		this.puestoTrabajo = puestoTrabajo;
	}

	public EmpleadoBase(String dni, String nombre, int sueldo, Puesto puestoTrabajo) {
		super(dni, nombre, sueldo);
		this.puestoTrabajo = puestoTrabajo;
	}


}
