package Repositorio;

import listas.Boletin1Ejercicio3.*;
import java.util.LinkedList;
import java.util.List;

import modelo.Prestamo;

public class RepositorioPrestamo {
	
	private List <Prestamo> listaPrestamo;

	public RepositorioPrestamo(List<Prestamo> listaPrestamo) {
		super();
		this.listaPrestamo = new LinkedList<Prestamo>();
	}
	
	//agregar Prestamo
	
	public void addListaFinal(Prestamo p) throws BibliotecaException {
		
		if(p.equals(EstadoLibro.LIBRE)) {
			listaPrestamo.addLast(p);
		}
		else if(p.equals(EstadoLibro.PRESTADO)) {
			throw new BibliotecaException("No es posible realizar el préstamo de un libro que ya está prestado");
		}
		
	}
	
	//devolver un libro
	
	
	
	//mostrar lista de prestamos
	public void imprimePrestamos() {
		for(Prestamo cadena : listaPrestamo) {
			System.out.println(cadena);
		}
	}
	
	
	//segun libro imprimir prestamos del mismo

	
	
}
