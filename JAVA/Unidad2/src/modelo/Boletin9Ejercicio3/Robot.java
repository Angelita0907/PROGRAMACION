package modelo.Boletin9Ejercicio3;

import java.util.Objects;

public abstract class Robot {
	
	private int id; 
	private String nombre;
	private static int contador = 0;
	private String modelo;
	private int bateria;
	private Estado estadoRobots;
	private String combustible;
	private String descripcion;

	enum Estado{
		ENCENDIDO, APAGADO, ALERTA, AVERIADO
	}

	public Robot(int id, String nombre ,String modelo, int bateria, Estado estadoRobots, String combustible, String descripcion) {
		super();
		this.id = contador+1;
		this.nombre = nombre;
		this.modelo = modelo;
		this.bateria = bateria;
		this.estadoRobots = estadoRobots;
		this.combustible = combustible;
		this.descripcion = descripcion;
		contador = contador+1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		bateriaSuficiente();
		this.bateria = bateria;
	}

	public Estado getEstadoRobots() {
		return estadoRobots;
	}

	public void setEstadoRobots(Estado estadoRobots) {
		this.estadoRobots = estadoRobots;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bateria, combustible, descripcion, estadoRobots, id, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return id == other.id ;
	}
	
	public abstract String ejecutarTarea();
	public abstract boolean recargar();
	
	public boolean bateriaSuficiente() {
		boolean suficiente = false;
		if (bateria >= 10)
		{
			setBateria(bateria);
			suficiente = true;
		}
		return suficiente;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", nombre=" + nombre + ", bateria=" + bateria + ", estadoRobots=" + estadoRobots
				+ "]";
	}

	
	
}
