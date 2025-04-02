package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReservaAnimal{
	
	private String nombre;
	private String lugar;
	private int presupuestoAnual;
	private HashSet<Animal2> listaAnimales;
	
	public ReservaAnimal(String nombre, String lugar, int presupuestoAnual) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuestoAnual = presupuestoAnual;
		this.listaAnimales = new HashSet<Animal2>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getPresupuestoAnual() {
		return presupuestoAnual;
	}

	public void setPresupuestoAnual(int presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}

	public HashSet<Animal2> getListaAnimales() {
		return listaAnimales;
	}

	public void setListaAnimales(HashSet<Animal2> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}
	
	public void addAnimal(Animal2 a){
		listaAnimales.add(a);
	}
	
	public void mostrarAnimal() {
		System.out.println("Animales: "+ getNombre() +listaAnimales.toString());
	}
	
	public List<Animal2> fromSetToList() {
		
		List<Animal2> animales = new ArrayList<Animal2>();
		
		for(Animal2 animal2 : listaAnimales) {
			animales.add(animal2);
		}
		
		return animales;
		
	}

}
