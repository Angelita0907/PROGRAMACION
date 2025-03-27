package modelo.Boletin9Ejercicio3;

public class Pintor extends Robot {

	public Pintor(int id, String nombre, String modelo, int bateria, Estado estadoRobots, String combustible,
			String descripcion) {
		super(id, nombre, modelo, bateria, estadoRobots, combustible, descripcion);
	}

	@Override
	public String ejecutarTarea() {
		String tarea = "Aplica pintura a los vehículos de manera uniforme";
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean puederecargar = false;

		if (getCombustible().equals("Electricidad")) {
			puederecargar = true;
			System.out.println("Recargando por "+ this.getCombustible());
		}
		return puederecargar;
	}

}
