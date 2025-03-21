package modelo.SimulacroExamen2;

import java.time.LocalDate;

public class Prueba {
	
	private String id;
	private String lugar;
	private LocalDate fecha;
	private Estado estadoPrueba;
	
	public Prueba(String id, String lugar, LocalDate fecha, Estado estadoPrueba) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estadoPrueba = estadoPrueba;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Estado getEstadoPrueba() {
		return estadoPrueba;
	}

	public void setEstadoPrueba(Estado estadoPrueba) {
		this.estadoPrueba = estadoPrueba;
	}

	@Override
	public String toString() {
		return "Prueba [id=" + id + ", lugar=" + lugar + ", fecha=" + fecha + ", estadoPrueba=" + estadoPrueba + "]";
	}

	
	
}
