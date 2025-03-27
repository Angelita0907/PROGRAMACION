package objetos_boletin3_Ejercicio3;

public class CuentaBancaria {

	// comprobrar que se suben los cambios
	// holi
	
	private double saldo;
	private String numeroCuenta;
	private Persona titular;
	private Persona autorizado;

	public CuentaBancaria(double saldo, String numeroCuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		// this.autorizado = autorizado;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public Persona getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}

	private boolean validaSaldo(double importe) {
		return importe > 0;
	}

	private boolean validaAutorizado(String dni) {
		return dni != null && dni.equals(autorizado.getDni());
	}

	public void ingresarDinero(Persona personaGestion, double ingreso) {
		if (validaAutorizado(personaGestion.getDni()) && validaSaldo(ingreso)) {
			// pido el saldo --> obtebgo el saldo actual y se lo sumo
			setSaldo(getSaldo() + ingreso);
		} else {
			System.out.println("No está autorizado o el ingreso es incorrecto");
		}
	}
	
	public void retirarDinero(Persona personaGestion, double reintegro)
	{
		if (validaAutorizado(personaGestion.getDni()) && validaSaldo(reintegro) 
				&& getSaldo() >= reintegro) // si lo que vamos a saar tiene que ser menor que lo que hay en la cuenta
		{
			setSaldo(getSaldo()- reintegro);
		} else {
			System.out.println("No está autorizado o el reintegro es incorrecto");
		}
	}

	public void eliminarAutorizado(String dni) {
		if (validaAutorizado(dni)) {
			autorizado = null;
		} else {
			System.out.println("La persona no está autorizada");
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular
				+ ", autorizado=" + autorizado + "]";
	}

}
