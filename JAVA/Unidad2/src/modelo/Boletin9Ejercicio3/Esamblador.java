package modelo.Boletin9Ejercicio3;

public class Esamblador extends Robot {

	public Esamblador(int id, String nombre, String modelo, int bateria, Estado estadoRobots, String combustible,
			String descripcion) {
		super(id, nombre, modelo, bateria, estadoRobots, combustible, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "Esambla piezas";
		return tarea;
	}
	@Override
	public boolean recargar() {
		boolean puederecargar = false;
		
		if (getEstadoRobots().equals(Estado.APAGADO) && getCombustible().equals("Gasolina")){
			puederecargar = true;
			System.out.println("Recargando por "+ this.getCombustible());
		}
		else{
			System.out.println("Estoy encendido y no puedo recargar");
			puederecargar = false;
		}
		return puederecargar;
	}

}
