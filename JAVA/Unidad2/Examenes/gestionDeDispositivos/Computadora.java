package gestionDeDispositivos;

public class Computadora extends Dispositivo {
	
	private int capacidadRAM;

	public Computadora(String nombre, String modelo, double precio, int capacidadRAM) {
		super(nombre, modelo, precio);
		this.capacidadRAM = capacidadRAM;
	}

	protected int getCapacidadRAM() {
		return capacidadRAM;
	}

	protected void setCapacidadRAM(int capacidadRAM) {
		this.capacidadRAM = capacidadRAM;
	}

	
}
