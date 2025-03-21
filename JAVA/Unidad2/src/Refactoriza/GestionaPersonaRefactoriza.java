package Refactoriza;

import Refactoriza.*;

public class GestionaPersonaRefactoriza {

	public static void main(String[] args) {
		
		PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos R.");
		IAcciones[] acciones = carlos.getAcciones();
		acciones[0] = new Estudiante();
		System.out.println(carlos);
		
		PersonaRefactoriza cristina = new PersonaRefactoriza("Cristina S.");
		acciones = cristina.getAcciones();
		acciones[0] = new Estudiante();
		acciones[1] = new Empleado();
		System.out.println(cristina);

		PersonaRefactoriza JoseK = new PersonaRefactoriza("Jose Carlos M.");
		acciones = JoseK.getAcciones();
		acciones[0] = new Estudiante();
		acciones[1] = new Empleado();
		acciones[2] = new Cliente();
		System.out.println(JoseK);
		
		
	}

}
