package modelo.Boletin9Ejercicio3;

public class Soldador extends Robot {

	private int temperatura;
	private String especificacion;

	public Soldador(int id, String nombre, String modelo, int bateria, Estado estadoRobots, String combustible,
			String descripcion, int temperatura, String especificacion) {
		super(id, nombre, modelo, bateria, estadoRobots, combustible, descripcion);
		this.temperatura = temperatura;
		this.especificacion = especificacion;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "Realiza soldaduras precisas en la carrocería de seguridad";
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean puederecargar = false;
		
		if (getEstadoRobots().equals(Estado.APAGADO)){
			puederecargar = true;
			System.out.println("Recargando por "+this.getCombustible());
		}
		else{
			System.out.println("Estoy encendido y no puedo recargar");
			puederecargar = false;
		}
		
		return puederecargar;
	}

}
