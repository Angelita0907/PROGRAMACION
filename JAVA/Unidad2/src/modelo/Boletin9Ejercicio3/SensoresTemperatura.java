package modelo.Boletin9Ejercicio3;

import java.time.LocalDate;

public class SensoresTemperatura extends Dispositivo {

	private int temperatura;
	
	public SensoresTemperatura(int id, String mac, Estado estadoWifi, LocalDate fechaActualizacion, int temperatura) {
		super(id, mac, estadoWifi, fechaActualizacion);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public void conectarInternet() {
		System.out.println("Se conecta usando WPA");

	}

	@Override
	public boolean pendienteActualizacion() {
		LocalDate fechahoy = LocalDate.now();
		return getFechaActualizacion().plusMonths(3).isBefore(fechahoy);
	}

}
