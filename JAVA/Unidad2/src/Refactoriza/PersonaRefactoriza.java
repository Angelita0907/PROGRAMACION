package Refactoriza;

import java.util.Arrays;

public class PersonaRefactoriza {
	String nombre;
	IAcciones[] acciones;

	public PersonaRefactoriza() {
		super();
		this.acciones = new IAcciones[10];
	}

	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new IAcciones[10];
	}

	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IAcciones[] getAcciones() {
		return acciones;
	}

	public void setAcciones(IAcciones[] acciones) {
		this.acciones = acciones;
	}

	@Override
	public String toString() {
		return "PersonaRefactoriza [nombre=" + nombre + ", acciones=" + Arrays.toString(acciones) + "]";
	}
	
	
}
