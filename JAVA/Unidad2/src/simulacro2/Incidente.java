package simulacro2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {

	private int id;
	private String nombre;
	private String descripcion;
	private LocalDate fechaRegistro;
	private LocalDate fechaCierre;
	private Estado estado;
	private Criticidad criticidad;
	private Equipo equipo;

	public Incidente(int id, String nombre, String descripcion, LocalDate fechaRegistro, LocalDate fechaCierre,
			Estado estado, Criticidad criticidad, Equipo equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaRegistro = fechaRegistro;
		setFechaCierre(fechaCierre);
		this.estado = estado;
		this.criticidad = criticidad;
		this.equipo = equipo;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	protected void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	protected LocalDate getFechaCierre() {
		return fechaCierre;
	}

	protected void setFechaCierre(LocalDate fechaCierre) {
		esNula();
		this.fechaCierre = fechaCierre;
	}

	protected Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	protected Criticidad getCriticidad() {
		return criticidad;
	}

	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}

	protected Equipo getEquipo() {
		return equipo;
	}

	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(criticidad, descripcion, equipo, estado, fechaCierre, fechaRegistro, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(equipo, other.equipo) && estado == other.estado
				&& Objects.equals(fechaCierre, other.fechaCierre) && Objects.equals(fechaRegistro, other.fechaRegistro)
				&& id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", estado=" + estado + ", criticidad=" + criticidad 
				+", fechaRegistro: "+ fechaRegistro +", equipo=" + equipo;
	}

	// tenemos que usarlo en set para comprobar la fecha y el estado que a su vez se pone en el constructor para llamar al set y luego al metodo
	
	public void esNula() {
		if (Estado.CERRADA == null) {
			System.out.println("La fecha de la incidencia es nula");
			fechaCierre = null;
		} else {
			fechaCierre = this.fechaCierre;
		}
	}

	public void esUrgente() {
		LocalDate hoy = LocalDate.now();
		if (Criticidad.CRITICA != null ) {
			System.out.println("Es urgente");
		} else if (Criticidad.GRAVE != null && fechaCierre.plusDays(7).isAfter(hoy)) {
			System.out.println("Es urgente");
		} else if (Criticidad.MEDIA != null && fechaCierre.plusDays(30).isAfter(hoy)) {
			System.out.println("Es urgente");
		}
	}

}

enum Estado {
	REGISTRADA, ANALIZADA, EN_RESOLUCION, CERRADA
}

enum Criticidad {
	CRITICA, GRAVE, MEDIA, LEVE
}