package modelo;

import java.util.TreeSet;

public class Historial {
	
	private TreeSet<PaginaWeb> chivato = new TreeSet<PaginaWeb>();

	public Historial(TreeSet<PaginaWeb> chivato) {
		super();
		this.chivato = chivato;
	}

	public TreeSet<PaginaWeb> getChivato() {
		return chivato;
	}

	public void setChivato(TreeSet<PaginaWeb> chivato) {
		this.chivato = chivato;
	}
	
	
	

}
