package modelo;

import java.util.HashSet;

public class Agenda {
	
	private HashSet<Contacto> contactos;

	public Agenda(HashSet<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	public HashSet<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(HashSet<Contacto> contactos) {
		this.contactos = new HashSet<Contacto>();
	}
	
	public void addContacto(Contacto c) {
		contactos.add(c);
	}
	
	public void delContacto(Contacto c) {
		contactos.remove(c);
	}

	public void mostrarContactos() {
		System.out.println("Contactos: " +contactos.toString());
	}
	
}
