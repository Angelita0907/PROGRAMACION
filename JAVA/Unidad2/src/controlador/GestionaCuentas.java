package controlador;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.CuentaBancaria;

public class GestionaCuentas {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(null, null, null, 0);
		Cliente c2 = new Cliente(null, null, null, 0);
		Cliente c3 = new Cliente(null, null, null, 0);
		Cliente c4 = new Cliente(null, null, null, 0);

		
		CuentaBancaria cb1 = new CuentaBancaria(1200, LocalDate.of(25, 2, 22), "ES12345678", c1, c2);
		CuentaBancaria cb2 = new CuentaBancaria(1000, LocalDate.of(25, 2, 20), "ES87654321", c3, c3);
		
		System.out.println(cb1);
		System.out.println(cb2);

	}

}
