package listas;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import modelo.ExamenEjercicio1.GuzmanitosException;
import modelo.SimulacroExamen2.CompeticionExcepcion;
import modelo.SimulacroExamen2.Estado;

public abstract class MiembroLista {

		private int id;
		private String email;
		private String nombre;
		private int contadorAmigos;
		private static int contadoridentificador;
		protected List < MiembroLista > amigo = new ArrayList <MiembroLista> ();

		public MiembroLista(String email, String nombre) {
			super();
			this.id = contadoridentificador + 1;
			this.email = email;
			this.nombre = nombre;
			this.contadorAmigos = contadorAmigos;
			this.amigo = new ArrayList <MiembroLista> ();
			contadoridentificador = contadoridentificador + 1;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getContadorAmigos() {
			return contadorAmigos;
		}

		public void setContadorAmigos(int contadorAmigos) {
			this.contadorAmigos = contadorAmigos;
		}

		public static int getContadoridentificador() {
			return contadoridentificador;
		}

		public static void setContadoridentificador(int contadoridentificador) {
			MiembroLista.contadoridentificador = contadoridentificador;
		}

		public List<MiembroLista> getAmigo() {
			return amigo;
		}

		public void setAmigo(List<MiembroLista> amigo) {
			this.amigo = amigo;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MiembroLista other = (MiembroLista) obj;
			return Objects.equals(email, other.email) && id == other.id;
		}

		public abstract String getTipoUsuario();

		@Override
		public String toString() {
			return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
		}


		public boolean isAmigo(MiembroLista miembro) {
			return amigo.contains(miembro);
		}
		
		public void addAmigo (MiembroLista m) throws listas.GuzmanitosException{
			
			if(isAmigo(m)) {
				throw new listas.GuzmanitosException("Este amigo esta en la lista");
			}
			else {
				amigo.add(m);
			}
		}

	
}
