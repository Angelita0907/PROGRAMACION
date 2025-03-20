package modelo.SimulacroExamen1;

public abstract class VehiculoGEneral implements IAlquilable {
	
	private int id;
	private Alquiler [] alquiler;
	private boolean disponible;
	
	public VehiculoGEneral(int id, Alquiler[] alquiler, boolean disponible) {
		super();
		this.id = id;
		this.alquiler = alquiler;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alquiler[] getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler[] alquiler) {
		this.alquiler = alquiler;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	} 
	
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
