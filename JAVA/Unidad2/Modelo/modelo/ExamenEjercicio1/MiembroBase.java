package modelo.ExamenEjercicio1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import modelo.SimulacroExamen2.CompeticionExcepcion;
import modelo.SimulacroExamen2.Estado;

public abstract class MiembroBase {

	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	private static int contadoridentificador;
	protected MiembroBase[] amigos;

	public MiembroBase(String email, String nombre) {
		super();
		this.id = contadoridentificador + 1;
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos;
		this.amigos = amigos;
		contadoridentificador = contadoridentificador + 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContadorAmigos() {
		return contadorAmigos;
	}

	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	public static int getContadoridentificador() {
		return contadoridentificador;
	}

	public static void setContadoridentificador(int contadoridentificador) {
		MiembroBase.contadoridentificador = contadoridentificador;
	}

	public MiembroBase[] getAmigos() {
		return amigos;
	}

	public void setAmigos(MiembroBase[] amigos) {
		this.amigos = amigos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}

	public abstract String getTipoUsuario();

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}

	public void addAmigo(MiembroBase miembro) throws GuzmanitosException {
		for (int i = 0; i < amigos.length; i++) {
			if (miembro != null && isAmigo(miembro)) {
				throw new GuzmanitosException("El mimebro " + getEmail() + " ya está en la lista de amigos del miembro "
						+ miembro.getEmail());
			}
		}
	}

	public boolean isAmigo(MiembroBase miembro) {
		boolean esAmigo = false;
		// miembro en la lista
		for (int i = 0; i < getAmigos().length; i++) {
			if (miembro.equals(amigos[i])) {
				esAmigo = true;
			}
		}

		return esAmigo;
	}

}
