package modelo.Boletin9Ejercicio3;

import java.time.LocalDate;

public class PuertaAutomatica extends Dispositivo {

	public PuertaAutomatica(int id, String mac, Estado estadoWifi, LocalDate fechaActualizacion) {
		super(id, mac, estadoWifi, fechaActualizacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("Utiliza WPA2");

	}

	@Override
	public boolean pendienteActualizacion() {
		LocalDate fechahoy = LocalDate.now();
		return getFechaActualizacion().plusMonths(1).isBefore(fechahoy);
	}

}
