package gestionDeDispositivos;

public class PCSobremesa extends Computadora {

	private boolean tieneGPUdedicada;

	public PCSobremesa(String nombre, String modelo, double precio, int capacidadRAM, boolean tieneGPUdedicada) {
		super(nombre, modelo, precio, capacidadRAM);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		this.tieneGPUdedicada = tieneGPUdedicada;
	}
	
	
	
}
