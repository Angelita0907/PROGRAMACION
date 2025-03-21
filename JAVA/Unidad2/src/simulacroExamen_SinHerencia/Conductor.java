package simulacroExamen_SinHerencia;

import java.util.Objects;

public class Conductor {
	private String nombre;
	private int anios;
	
	public Conductor(String nombre, int anios) {
		super();
		this.nombre = nombre;
		//this.anios = anios;
		// asignamos el metodo set para que verifique los años
		setAnios(anios);
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getAnios() {
		return anios;
	}
	protected void setAnios(int anios) {
		if(anios > 0) {
			this.anios = anios;
		}
		else {
			this.anios = 0;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(anios, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anios == other.anios && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anios=" + anios + "]";
	}
	
	public void conducir()
	{}

}
