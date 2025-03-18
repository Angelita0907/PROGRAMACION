package modelo.Interfaces2Ejercicio2;

import java.time.LocalDate;

public class Proyecto {

	private String identificador;
	private String descripcion;
	private LocalDate fechaInicio;
	private int numeroMesesDuracion;
	private double presupuesto;
	
	public Proyecto(String identificador, String descripcion, LocalDate fechaInicio, int numeroMesesDuracion,
			double presupuesto) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.numeroMesesDuracion = numeroMesesDuracion;
		this.presupuesto = presupuesto;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getNumeroMesesDuracion() {
		return numeroMesesDuracion;
	}

	public void setNumeroMesesDuracion(int numeroMesesDuracion) {
		this.numeroMesesDuracion = numeroMesesDuracion;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	
}
