package modelo.Interfaces2Ejercicio1;

public class Detergente extends Producto implements ILiquidos, IDescuentos {

	private String marca;
	private tipoDetergente detergente;
	private tipoRopa ropa;
	private double descuento;
	private double volumen;
	private String tipoEnvase;

	public Detergente(int id, String nombre, String descripcion, double peso, double precioVenta, double precioCompra,
			double ivaAplicable, String marca, tipoDetergente detergente, tipoRopa ropa) {
		super(id, nombre, descripcion, peso, precioVenta, precioCompra, ivaAplicable);
		this.marca = marca;
		this.detergente = detergente;
		this.ropa = ropa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public tipoDetergente getDetergente() {
		return detergente;
	}

	public void setDetergente(tipoDetergente detergente) {
		this.detergente = detergente;
	}

	public tipoRopa getRopa() {
		return ropa;
	}

	public void setRopa(tipoRopa ropa) {
		this.ropa = ropa;
	}
	
	

	public enum tipoDetergente{
		MAQUINA, MANO, COMBINADO
	}

	public enum tipoRopa{
		BLANCA, COLOR
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

	
}
