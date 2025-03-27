package yummyyummy;

import java.util.Objects;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private Menu dieta;
	private boolean vip;

	public Cliente(String dni, String nombre, String apellidos, int edad, Menu dieta, boolean vip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dieta = dieta;
		this.vip = vip;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		hayQueHacerPromocion();
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		} else {
			System.out.println("Edad incorrecta, menor que 0");
		}
		hayQueHacerPromocion();
	}

	protected Menu getDieta() {
		return dieta;
	}

	protected void setDieta(Menu dieta) {
		this.dieta = dieta;
	}

	protected boolean isVip() {
		return vip;
	}

	protected void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& vip == other.vip;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni +" ,"+hayQueHacerPromocion()+", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dieta="
				+ dieta + ", vip=" + vip + "]";
	}

	private boolean hayQueHacerPromocion() {
		boolean promocion = false;

		if (getEdad() > 65) {
			System.out.println("Hay que hacer promocion");
			promocion = true;
		} else {
			System.out.println("No tiene promocion");
			promocion = false;
		}
		return promocion;
	}

}
