package controlador;

import modelo.Interfaces2Ejercicio1.*;
import modelo.Interfaces2Ejercicio1.Pescado.tipoPescado;

public class GestionaProductos {

	public static void main(String[] args) {

		Pescado [] pescados = new Pescado[2];
		Pescado p1 = new Pescado(1, "Pescada", "pescado fresco", 300, 5, 2, 0, "Marruecos", 300, 4, tipoPescado.AZUL);
		System.out.println(p1.getCalorias());
		pescados [0] = p1;
		
		
		
		
	}

}
