package gestionDeDispositivos;

public class Smartphone extends Telefono{

	private int cantidadCamaras;

	public Smartphone(String nombre, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(nombre, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}
	
	@Override
	public double calcularPrecioDescuento() {
		double Descuento = (getPrecio() * 15) / 100;
		double precioDescuento = getPrecio()-Descuento;
		return precioDescuento;
	}
	
}
