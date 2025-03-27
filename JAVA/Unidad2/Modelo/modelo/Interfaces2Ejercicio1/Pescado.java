package modelo.Interfaces2Ejercicio1;

import java.time.LocalDate;

public class Pescado extends Producto implements IAlimentos {

	private String origen;
	private int peso2;
	private int timepoDuracion;
	private tipoPescado pecadito;
	private static final double ivaAplicable = 7;


	public enum tipoPescado {
		BLANCO, AZUL, MARISCO
	}

	public Pescado(int id, String nombre, String descripcion, double peso, double precioVenta, double precioCompra,
			double ivaAplicable, String origen, int peso2, int timepoDuracion, tipoPescado pecadito) {
		super(id, nombre, descripcion, peso, precioVenta, precioCompra, ivaAplicable);
		this.origen = origen;
		peso = peso2;
		this.timepoDuracion = timepoDuracion;
		this.pecadito = pecadito;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getPeso2() {
		return peso2;
	}

	public void setPeso2(int peso) {
		this.peso2 = peso;
	}

	public int getTimepoDuracion() {
		return timepoDuracion;
	}

	public void setTimepoDuracion(int timepoDuracion) {
		this.timepoDuracion = timepoDuracion;
	}

	public tipoPescado getPecadito() {
		return pecadito;
	}

	public void setPecadito(tipoPescado pecadito) {
		this.pecadito = pecadito;
	}

	@Override
	public void setCaducidad(LocalDate fecha) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCalorias() {
		if(tipoPescado.AZUL != null) {
			this.peso2 = peso2*3;
		}
		if(tipoPescado.BLANCO != null) {
			this.peso2 = peso2*2;
		}
		if(tipoPescado.MARISCO != null) {
			this.peso2 = peso2*1;
		}
		
		return peso2;
	}
	
	public int precioNeto() {
		return this.precioNeto();
	}

}
