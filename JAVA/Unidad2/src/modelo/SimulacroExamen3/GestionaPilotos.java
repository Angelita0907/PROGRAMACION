package modelo.SimulacroExamen3;

import java.time.LocalDate;

public class GestionaPilotos {

	public static void main(String[] args) {
		
		Piloto p1 = new Comercial("pedro", "español", 23,123450);
		
		Vuelo v = new Vuelo(454, "vueling", "madid", LocalDate.now(), 10, EstadoVuelo.PROGRAMADO);
		Vuelo v2 = new Vuelo(6546, "vueling", "madid", LocalDate.now(), 10, EstadoVuelo.PROGRAMADO);

		Vuelo vuelos [] = new Vuelo[20];
		vuelos [0] = v;
		
		try {
			p1.agregarVuelo(v);
			p1.agregarVuelo(v2);
		} catch (VueloException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
