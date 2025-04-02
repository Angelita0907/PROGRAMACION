package modelo;

import java.time.LocalTime;
import java.util.Objects;

public class PaginaWeb {

	private String url;
	private LocalTime fechaYhoraVisita;
	
	public PaginaWeb(String url, LocalTime fechaYhoraVisita) {
		super();
		this.url = url;
		this.fechaYhoraVisita = fechaYhoraVisita;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalTime getFechaYhoraVisita() {
		return fechaYhoraVisita;
	}

	public void setFechaYhoraVisita(LocalTime fechaYhoraVisita) {
		this.fechaYhoraVisita = fechaYhoraVisita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaYhoraVisita);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fechaYhoraVisita, other.fechaYhoraVisita);
	}
	
	
	
}
