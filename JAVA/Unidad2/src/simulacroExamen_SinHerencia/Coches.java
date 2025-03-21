package simulacroExamen_SinHerencia;

import java.util.Objects;

public class Coches {

	private String marca;
	private String modelo;
	private String matricula;
	private Conductor dueno;
	private String conductor;
	private Estado estadoCoche;
	private Sensor sensor;

	public Coches(String marca, String modelo, String matricula, Conductor dueno, String conductor, Estado estadoCoche,
			Sensor sensor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.dueno = dueno;
		this.conductor = conductor;
		this.estadoCoche = estadoCoche;
		this.sensor = sensor;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected Conductor getDueno() {
		return dueno;
	}

	protected void setDueno(Conductor dueno) {
		this.dueno = dueno;
	}
	
	protected String getConductor() {
		return conductor;
	}

	protected void setConductor(String conductor) {
		this.conductor = conductor;
	}

	protected Estado getEstadoCoche() {
		return estadoCoche;
	}

	protected void setEstadoCoche(Estado estadoCoche) {
		this.estadoCoche = estadoCoche;
	}

	protected Sensor getSensor() {
		return sensor;
	}

	protected void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dueno=" + dueno
				+ ", estadoCoche=" + estadoCoche + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conductor, dueno, estadoCoche, marca, matricula, modelo, sensor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coches other = (Coches) obj;
		return Objects.equals(conductor, other.conductor) && Objects.equals(dueno, other.dueno)
				&& estadoCoche == other.estadoCoche && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(sensor, other.sensor);
	}

	boolean verificarDueno(String conductor)
	{
		return false;
	}
	
	void arrancar()
	{}
	
	void apagar()
	{}
	
	void verificarParada()
	{}
	
}
