package modelo.SimulacroExamen1;

public class Patinete extends VehiculoGEneral {

	private int tiempoAutonomia;
	private String marca;
	private String modelo;
	private int fianza;

	public Patinete(int id, Alquiler[] alquiler, boolean disponible, int tiempoAutonomia, String marca, String modelo,
			int fianza) {
		super(id, alquiler, disponible);
		this.tiempoAutonomia = tiempoAutonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.fianza = fianza;
	}

	public int getTiempoAutonomia() {
		return tiempoAutonomia;
	}

	public void setTiempoAutonomia(int tiempoAutonomia) {
		this.tiempoAutonomia = tiempoAutonomia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getFianza() {
		return fianza;
	}

	public void setFianza(int fianza) {
		this.fianza = fianza;
	}

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	// mirar como lo de boolean
	public void fianzaAbonada() {

	}
	
	@Override
	public double getImporteTotalGenerado() {
		double importeTotal = 0;
		for(Alquiler a : getAlquiler()) {
			if(a!= null && (a.getEstado().equals(EstadoCoche.ENTREGADO) || a.getEstado().equals(EstadoCoche.CERRADO)))
			{
				importeTotal = importeTotal+a.getImporteGeneradoPorAlquiler();
			}
		}
		return importeTotal;
	}


}
