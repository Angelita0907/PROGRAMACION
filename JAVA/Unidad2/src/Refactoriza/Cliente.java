package Refactoriza;

public class Cliente extends PersonaRefactoriza implements IAcciones {

	public Cliente( ) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarAcciones() {
		return	"Cliente compra";	
	}
	
	@Override
	public String toString() {
		return ejecutarAcciones();
	}	
	
	
}
