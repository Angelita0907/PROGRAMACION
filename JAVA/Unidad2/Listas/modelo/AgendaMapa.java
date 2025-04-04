package modelo;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class AgendaMapa {

	private Map<String, Contacto> agenda;

	public AgendaMapa() {
		super();
		this.agenda = new TreeMap<String, Contacto>();
	}
	
	public Map<String, Contacto> getAgenda(){
		return agenda;
	}

	public void setAgenda(Map<String, Contacto> agenda) {
		this.agenda = agenda;
	}

	
	
	
	
}
