package modelo.SimulacroExamen3;

import java.util.Objects;

public class Piloto implements IVuelo {

	private String nombre;
	private String nacionalidad;
	private int edad;
	private int numLicencia;
	private Vuelo [] vuelos;
	private int numHoras;
	
	public Piloto(String nombre, String nacionalidad, int edad, int numLicencia) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numLicencia = numLicencia;
		this.vuelos = new Vuelo [20];
		this.numHoras = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		return numLicencia == other.numLicencia;
	}
	
	public boolean saberSiEsxisteVuelo(Vuelo v) {
		
		boolean existe = false;
		
		int i = 0;
		
		while(!existe ) {}
		
		return existe;
	}
	
	public void agregarVuelo(Vuelo v) throws VueloException {

		if(this.saberSiEsxisteVuelo(v)) {
			throw new VueloException("El vuelo esta en la lista");
		}
		
		else if (v.getDuracion() > 8 && this instanceof Comercial) {
			throw new VueloException("no se puede agregar");
		}
		
	}

	@Override
	public String operarVuelo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDuracionVuelo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
