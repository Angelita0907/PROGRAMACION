package modelo.Interfaces1Ejercicio2;

import java.util.Objects;

public abstract class Recurso implements IPrestable{
	
	private int id;
	private String ubicacion;
	
	public Recurso(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recurso other = (Recurso) obj;
		return id == other.id && Objects.equals(ubicacion, other.ubicacion);
	}
	
	

}
