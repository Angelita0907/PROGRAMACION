package simulacro2;

import java.util.Objects;

public class Equipo {

	private String nombre;
	private String mac;
	private String sistemaOp;
	private int numIncidentes = 0;
	private Usuario usuario;

	public Equipo(String nombre, String mac, String sistemaOp, int numIncidentes, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.mac = mac;
		this.sistemaOp = sistemaOp;
		this.numIncidentes = numIncidentes;
		this.usuario = usuario;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getMac() {
		return mac;
	}

	protected void setMac(String mac) {
		this.mac = mac;
	}

	protected String getSistemaOp() {
		return sistemaOp;
	}

	protected void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
	}

	protected int getNumIncidentes() {
		return numIncidentes;
	}

	protected void setNumIncidentes(int numIncidentes) {
		this.numIncidentes = numIncidentes;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mac, nombre, numIncidentes, sistemaOp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(mac, other.mac);
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", mac=" + mac + ", sistemaOp=" + sistemaOp + ", numIncidentes="
				+ numIncidentes + ", usuario=" + usuario.getNombre() + "]";
	}
	
}
