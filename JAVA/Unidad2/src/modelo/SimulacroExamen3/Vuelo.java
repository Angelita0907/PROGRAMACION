package modelo.SimulacroExamen3;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	
	private int id;
	private String aerolinea;
	private String destino;
	private LocalDate fechaVuelo;
	private double duracion;
	private EstadoVuelo estadoVuelos;
	
	public Vuelo(int id, String aerolinea, String destino, LocalDate fechaVuelo, double duracion,
			EstadoVuelo estadoVuelos) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechaVuelo = fechaVuelo;
		this.duracion = duracion;
		this.estadoVuelos = estadoVuelos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public EstadoVuelo getEstadoVuelos() {
		return estadoVuelos;
	}

	public void setEstadoVuelos(EstadoVuelo estadoVuelos) {
		this.estadoVuelos = estadoVuelos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return id == other.id;
	}
	
	

}
