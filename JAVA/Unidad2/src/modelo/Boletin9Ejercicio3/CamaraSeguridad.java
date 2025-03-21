package modelo.Boletin9Ejercicio3;

import java.time.LocalDate;

public class CamaraSeguridad extends Dispositivo {

	public CamaraSeguridad(int id, String mac, Estado estadoWifi, LocalDate fechaActualizacion) {
		super(id, mac, estadoWifi, fechaActualizacion);
	}

	@Override
	public void conectarInternet() {
		System.out.println("Utiliza WPA3");

	}

	@Override
	public boolean pendienteActualizacion() {
		LocalDate fechahoy = LocalDate.now();
		return getFechaActualizacion().plusDays(14).isBefore(fechahoy);
	}

}
