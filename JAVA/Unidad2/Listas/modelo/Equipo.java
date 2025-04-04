package modelo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo {
	
	private String nombre;
	private HashSet<Alumno> listaAlumnos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.listaAlumnos = new HashSet<Alumno>();
	}
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaAlumnos=" + listaAlumnos + "]";
	}

	public void aniadirAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
		
	}
	
	public void borrarAlumno(Alumno alumno) {
		listaAlumnos.remove(alumno);
	}
	
	public void tieneAlumno(Alumno alumno) {
		if(listaAlumnos.contains(alumno)) {
			System.out.println(alumno);
		}
		else {
			System.out.println("null");
		}
	}
	
	public void mostrarEquipo() {
		System.out.println("Equipo: "+ getNombre() +listaAlumnos.toString());
	}
	
	//union equipo
	public Equipo union(Equipo e) {
		
		Equipo union = new Equipo("Equipo unido");
		union.listaAlumnos.addAll(this.listaAlumnos);
		union.listaAlumnos.addAll(e.listaAlumnos);
		return union;
	}
	
	//interseccion equipo
	public Equipo interseccion(Equipo e) {
		Equipo inter = new Equipo("Jugadores que forman parte de ambos equipos");
		inter.listaAlumnos.addAll(this.listaAlumnos);
		inter.listaAlumnos.retainAll(e.listaAlumnos);
		return inter;
	}

}
