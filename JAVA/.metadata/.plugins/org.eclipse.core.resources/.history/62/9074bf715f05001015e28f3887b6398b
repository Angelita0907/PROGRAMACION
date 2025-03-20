package modelo.SimulacroExamen1;

public abstract class VehiculoCombustible extends VehiculoGEneral {

	private String matricula;
	private boolean diesel;
	private String modelo;
	private String marca;

	public VehiculoCombustible(int id, Alquiler[] alquiler, boolean disponible, String matricula, boolean diesel,
			String modelo, String marca) {
		super(id, alquiler, disponible);
		this.matricula = matricula;
		this.diesel = diesel;
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getPrecioDia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
