package modelo.Interfaces2Ejercicio1;

public class Detergente extends Producto implements ILiquidos, IDescuentos {

	private String marca;
	private tipoDetergente detergente;
	private tipoRopa ropa;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
