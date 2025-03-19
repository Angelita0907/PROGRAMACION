package modelo.Interfaces2Ejercicio2;

public class JefeProyecto extends AEmpleado {
	
	private boolean hablaInfles;
	private String [] certificaciones;
	private Proyecto proyecto;

	public JefeProyecto(String nombre, String identificador, String apellidos, float salario,
			boolean tienereReduccionHoraria, Categoria puesto, boolean hablaInfles, String[] certificaciones,
			Proyecto proyecto) {
		super(nombre, identificador, apellidos, salario, tienereReduccionHoraria, puesto);
		this.hablaInfles = hablaInfles;
		this.certificaciones = certificaciones;
		this.proyecto = proyecto;
	}

	public boolean isHablaInfles() {
		return hablaInfles;
	}

	public void setHablaInfles(boolean hablaInfles) {
		this.hablaInfles = hablaInfles;
	}

	public String[] getCertificaciones() {
		return certificaciones;
	}

	public void setCertificaciones(String[] certificaciones) {
		this.certificaciones = certificaciones;
	}

	@Override
	public double calculaimporteNomina() {
		
		double nomina = 0;
		
		if(this.hablaInfles) {
			nomina = this.getSalario() + ((this.calculaElementostabla(certificaciones)*0.05F) + 0.03F );
		}
		
		else {
			nomina = this.getSalario() + (this.calculaElementostabla(certificaciones)*0.05F);
		}
		
		return nomina;
	}

	private Object getLenguajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void imprimeHorario() {
		
		if(isTienereReduccionHoraria() == true) {
			System.out.println("Horario de 8 a 4");
		}
		else {
			System.out.println("Horario de 8 a 7");
		}
		
	}

	@Override
	String[] devuelveFunciones() {
		String [] funciones = {"planificar", "asegurar calidad y entrega de plazos","reporting","elaboracion de orfertas"};
		return funciones;
	}
	
	
	
	
}
