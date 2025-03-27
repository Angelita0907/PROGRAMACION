package listas.Boletin1Ejercicio3;

import java.util.ArrayList;
import java.util.List;

import listas.MiembroLista;

public class Biblioteca {
	
	private List < Libro > libros = new ArrayList <Libro> ();

	public Biblioteca(List<Libro> libros) {
		super();
		this.libros = libros;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public boolean estaLibro(Libro l) {
		return libros.contains(l);
	}
	
	public void addLibro (Libro l) throws BibliotecaException{
		
		if(estaLibro(l)) {
			throw new BibliotecaException("Este libro esta en la lista");
		}
		else {
			libros.add(l);
		}
	}
	
	//pestrar un libro
	
	//devolver un libro
	
	public void imprimeLibro() {
		for(Libro cadena : libros) {
			System.out.println(cadena);
		}

	}
	
	/*public String buscaLibro () {
		
	}*/

}
