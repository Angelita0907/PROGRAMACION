
package gestionDeDispositivos;

import java.util.Objects;

public class Dispositivo {
	private String marca;
	private String modelo;
	private double precio;
	
	public Dispositivo(String nombre, String modelo, double precio) {
		super();
		this.marca = nombre;
		this.modelo = modelo;
		this.precio = precio;
	}

	protected String getNombre() {
		return marca;
	}

	protected void setNombre(String nombre) {
		this.marca = nombre;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		calcularPrecioDescuento();
		if (precio < 0)
		{
			System.out.println("Error precio no válido");
			precio = 1;
		}
		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(modelo, other.modelo) && Objects.equals(marca, other.marca)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	/*Poner metodo precioDescuento*/
	@Override
	public String toString() {
		return "nombre=" + marca + ", modelo=" + modelo + ", precio=" + precio + " precio con Descuento:"+calcularPrecioDescuento() +"]";
	}
	
	public double calcularPrecioDescuento()
	{
		double Descuento = (precio*10)/100;
		double precioDescuento = precio - Descuento;
		return precioDescuento;
	}

}
