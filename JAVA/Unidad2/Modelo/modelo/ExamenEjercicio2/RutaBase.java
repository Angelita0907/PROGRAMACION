package modelo.ExamenEjercicio2;

import java.util.Objects;

public abstract class RutaBase implements IRuta{
	
	private int id;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private int distanciaKms;
	
	public RutaBase(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, int distanciaKms) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKms = distanciaKms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public int getDistanciaKms() {
		return distanciaKms;
	}

	public void setDistanciaKms(int distanciaKms) {
		this.distanciaKms = distanciaKms;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "RutaBase [id=" + id + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino
				+ ", distanciaKms=" + distanciaKms + "]";
	}
	
	

}
