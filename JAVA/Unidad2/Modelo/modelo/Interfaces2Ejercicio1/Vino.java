package modelo.Interfaces2Ejercicio1;

import java.time.LocalDate;

import modelo.Interfaces2Ejercicio1.Pescado.tipoPescado;

public class Vino extends Producto implements IAlimentos, IDescuentos, ILiquidos{

	private String marca;
	private tipoVino vinito;
	private double volumen;
	private String tipoEnvase;
	private double descuento;
	private double gradoAlcohol;
	private int peso;

	public Vino(int id, String nombre, String descripcion, double peso, double precioVenta, double precioCompra,
			double ivaAplicable, String marca, tipoVino vinito) {
		super(id, nombre, descripcion, peso, precioVenta, precioCompra, ivaAplicable);
		this.marca = marca;
		this.vinito = vinito;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public tipoVino getVinito() {
		return vinito;
	}

	public void setVinito(tipoVino vinito) {
		this.vinito = vinito;
	}

	public enum tipoVino {
		BLANCO, TINTO, ROSADO
	}

	@Override
	public void setVolumen(double v) {
		this.volumen = v;			
	}

	@Override
	public double getVolumen() {
		return this.volumen;
	}

	@Override
	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;
		
	}

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = des;
		
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return this.getPrecioVenta() - (this.descuento*this.getPrecioVenta());
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
			peso= peso*3;
		}
		if(tipoPescado.BLANCO != null) {
			peso = peso*2;
		}
		if(tipoPescado.MARISCO != null) {
			peso= peso*1;
		}
		
		return peso;
	}

	
}
