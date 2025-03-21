package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class CuentaBancaria {

	private double saldo;
	private LocalDate fecha_apertura;
	private int id;
	private static int contador = 0;
	private String IBAN;
	private Cliente titular;
	private Cliente autorizado = null;

	public CuentaBancaria(double saldo, LocalDate fecha_apertura, String iBAN, Cliente titular,
			Cliente autorizado) {
		super();
		this.saldo = saldo;
		this.fecha_apertura = fecha_apertura;
		this.id = contador + 1;
		this.IBAN = iBAN;
		this.titular = titular;
		this.autorizado = autorizado;
		contador = contador + 1;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected LocalDate getFecha_apertura() {
		return fecha_apertura;
	}

	protected void setFecha_apertura(LocalDate fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected static int getContador() {
		return contador;
	}

	protected static void setContador(int contador) {
		CuentaBancaria.contador = contador;
	}

	protected String getIBAN() {
		return IBAN;
	}

	protected void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	protected Cliente getTitular() {
		return titular;
	}

	protected void setTitular(Cliente titular) {
		this.titular = titular;
	}

	protected Cliente getAutorizado() {
		return autorizado;
	}

	protected void setAutorizado(Cliente autorizado) {
		this.autorizado = autorizado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IBAN, autorizado, fecha_apertura, id, saldo, titular);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(IBAN, other.IBAN) && Objects.equals(autorizado, other.autorizado)
				&& Objects.equals(fecha_apertura, other.fecha_apertura) && id == other.id
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Objects.equals(titular, other.titular);
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", fecha_apertura=" + fecha_apertura + ", id=" + id + ", IBAN=" + IBAN
				+ ", titular=" + titular + ", autorizado=" + autorizado + "]";
	}
	
	//esTitular
	//esAutorizado

}
