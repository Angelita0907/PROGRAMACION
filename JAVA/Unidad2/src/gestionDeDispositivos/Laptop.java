package gestionDeDispositivos;

public class Laptop extends Computadora {

	private double peso;

	public Laptop(String nombre, String modelo, double precio, int capacidadRAM, double peso) {
		super(nombre, modelo, precio, capacidadRAM);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double calcularPrecioDescuento() {
		double Descuento;
		double precioDescuento;
		if (getPeso() > 2) {
			Descuento = (getPrecio() * 20) / 100;
			precioDescuento = getPrecio() - Descuento;
		} else {
			Descuento = (getPrecio() * 12) / 100;
			precioDescuento = getPrecio() - Descuento;
		}

		return precioDescuento;
	}

}
