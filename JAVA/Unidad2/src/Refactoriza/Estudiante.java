package Refactoriza;

public class Estudiante extends PersonaRefactoriza implements IAcciones {

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarAcciones() {
		return "Estudiante que estudia";		
	}

	@Override
	public String toString() {
		return ejecutarAcciones();
	}

}
