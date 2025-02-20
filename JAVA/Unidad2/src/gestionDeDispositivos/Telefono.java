package gestionDeDispositivos;

public class Telefono extends Dispositivo {

	private boolean tieneTecladoFisico;

	public Telefono(String nombre, String modelo, double precio, boolean tieneTecladoFisico) {
		super(nombre, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	protected boolean getTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		this.tieneTecladoFisico = tieneTecladoFisico;
	}
	
	
	
}
