package modelo;

public class Conversor {

	private double dolar;
	private double euro;
	public final static double DOLARES = 1.05;
	public final static double EUROS = 0.96;

	public Conversor(double dolar, double euro) {
		super();
		this.dolar = dolar;
		this.euro = euro;
	}

	protected double getDolar() {
		return dolar;
	}

	protected void setDolar(double dolar) {
		this.dolar = dolar;
	}

	protected double getEuro() {
		return euro;
	}

	protected void setEuro(double euro) {
		this.euro = euro;
	}

	protected static double getDolares() {
		return DOLARES;
	}

	protected static double getEuros() {
		return EUROS;
	}

	@Override
	public String toString() {
		return "Conversor [dolar=" + dolar + ", euro=" + euro + ", getDolar()=" + getDolar() + ", getEuro()="
				+ getEuro() + "]";
	}

	static double calcularConversorDolar(double dolar) {
		double convertirDolar = dolar * DOLARES;
		return convertirDolar;
	}

	static double calcularConversorEuros(double euro) {
		double convertirEuros = euro * EUROS;
		return convertirEuros;
	}

}
