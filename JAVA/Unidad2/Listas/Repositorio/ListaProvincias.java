package Repositorio;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import modelo.Provincia;
import modelo.ProvinciaException;

public class ListaProvincias {

	private List<Provincia> listaprovincia;

	public ListaProvincias(List<Provincia> listaprovincia) {
		super();
		this.setListaprovincia(new LinkedList<>());
	}
	
	/*
	 * metodos sin usar set List
	public boolean addSinRepeticion(Provincia p) throws ProvinciaException {
		boolean agregar = false;

		if (getListaprovincia().contains(p)) {
			throw new ProvinciaException("Provincia repetida");
		} else {
			agregar = getListaprovincia().add(p);
		}

		return agregar;
	}
	
	public Provincia setsinRepetir(int index, Provincia nuevaProvincia) throws ProvinciaException {
		Provincia actualizar = getListaprovincia().get(index);

		if (getListaprovincia().contains(nuevaProvincia)) {
			throw new ProvinciaException("Provincia repetida");
		} else {
			actualizar = getListaprovincia().set(index, nuevaProvincia);
		}
		return actualizar;

	}
	 */
	public List<Provincia> getListaprovincia() {
		return listaprovincia;
	}

	public void setListaprovincia(List<Provincia> listaprovincia) {
		this.listaprovincia = listaprovincia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaprovincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaProvincias other = (ListaProvincias) obj;
		return Objects.equals(listaprovincia, other.listaprovincia);
	}
	

}
