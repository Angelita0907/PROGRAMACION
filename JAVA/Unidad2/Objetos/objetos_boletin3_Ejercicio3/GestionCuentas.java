package objetos_boletin3_Ejercicio3;

import java.time.LocalDate;
import java.util.Set;

public class GestionCuentas {

	public static void main(String[] args) {
		
		Persona titular = new Persona("98765432A","Pedro","Pérez",LocalDate.of(2003, 9, 7));
		Persona autorizado = new Persona("75315984B", "Julian", "Navas", LocalDate.of(2003, 8, 9));
		CuentaBancaria cuentaBanco = new CuentaBancaria(0.0, "ES0987532196452879612354", titular);
		cuentaBanco.setAutorizado(autorizado);
		cuentaBanco.ingresarDinero(autorizado, 100);
		
		System.out.println(cuentaBanco);
	}

}
