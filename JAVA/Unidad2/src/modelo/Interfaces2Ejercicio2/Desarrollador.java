package modelo.Interfaces2Ejercicio2;

public class Desarrollador extends AEmpleado{
	
	private String [] lenguajes;
	private String [] frameworks;
	
	public Desarrollador(String nombre, String identificador, String apellidos, float salario,
			boolean tienereReduccionHoraria, Categoria puesto, String[] lenguajes, String[] frameworks) {
		super(nombre, identificador, apellidos, salario, tienereReduccionHoraria, puesto);
		this.lenguajes = lenguajes;
		this.frameworks = frameworks;
	}
	

	public String[] getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String[] lenguajes) {
		this.lenguajes = lenguajes;
	}

	public String[] getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(String[] frameworks) {
		this.frameworks = frameworks;
	}

	@Override
	public double calculaimporteNomina() {
		return this.getSalario() + ( (this.calculaElementostabla(lenguajes)*0.01F) + (this.calculaElementostabla(frameworks)*0.03F));
		}
	
	@Override
	void imprimeHorario() {
		
		if(isTienereReduccionHoraria() == true) {
			System.out.println("Horario de 8 a 2 y de 4 a 10");
		}
		else {
			System.out.println("Horario de 8 a 4 y de 4 a 12");
		}
		
	}

	@Override
	String[] devuelveFunciones() {
		String [] funciones = {"Codificar","Diseñar planes de prueba", "ejecutarlos"};
		return funciones;
	}

}
