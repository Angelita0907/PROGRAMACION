package Refactoriza;

public class Empleado extends PersonaRefactoriza implements IAcciones{

	public Empleado( ) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarAcciones() {
		return "Trabajador que trabaja";
	}

	@Override
	public String toString() {
		return ejecutarAcciones();
	}	
	
}
