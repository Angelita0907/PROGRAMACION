package modelo.Boletin9Ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Dispositivo {
	
	private int id;
	private String mac;
	private Estado estadoWifi;
	private LocalDate fechaActualizacion;
	
	enum Estado{
		ON_SINWIFI, ON_CONECTADO, OFF, ALERTA, AVERIADO
	}

	public Dispositivo(int id, String mac, Estado estadoWifi, LocalDate fechaActualizacion) {
		super();
		this.id = id;
		this.mac = mac;
		this.estadoWifi = estadoWifi;
		this.fechaActualizacion = fechaActualizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Estado getEstadoWifi() {
		return estadoWifi;
	}

	public void setEstadoWifi(Estado estadoWifi) {
		this.estadoWifi = estadoWifi;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(mac, other.mac);
	}
	
	public abstract void conectarInternet();
	public abstract boolean pendienteActualizacion();
	public void apagar()
	{
		setEstadoWifi(Estado.OFF);
	}

}
