package yummyyummy;

import java.time.LocalDateTime;
import java.util.Objects;

public class Menu {

	private int id;
	private String nombre;
	private double consumoCalorico;
	private int precioVenta;
	private int precioCoste;
	private Dieta tipoDieta;
	private boolean frutosSecos;
	private int unidadesRepartidas;

	public Menu(int id, String nombre, double consumoCalorico, int precioVenta, int precioCoste, Dieta tipoDieta,
			boolean frutosSecos, int unidadesRepartidas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.consumoCalorico = consumoCalorico;
		this.precioVenta = precioVenta;
		this.precioCoste = precioCoste;
		this.tipoDieta = tipoDieta;
		this.frutosSecos = frutosSecos;
		this.unidadesRepartidas = unidadesRepartidas;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getConsumoCalorico() {
		return consumoCalorico;
	}

	protected void setConsumoCalorico(double consumoCalorico) {
		if (consumoCalorico > 1000) {
			System.out.println("Bajo en calorias");
			this.consumoCalorico = consumoCalorico;
		}
		this.consumoCalorico = consumoCalorico;
	}

	protected int getPrecioVenta() {
		return precioVenta;
	}

	protected void setPrecioVenta(int precioVenta) {
		if (precioVenta > 0 && precioVenta > (precioCoste + ((precioCoste * 30) / 100))) {
			this.precioVenta = precioVenta;
		} else {
			precioVenta = precioCoste + ((precioCoste * 30) / 100);
		}
	}

	protected int getPrecioCoste() {
		return precioCoste;
	}

	protected void setPrecioCoste(int precioCoste) {
		if (precioCoste > 0) {
			this.precioCoste = precioCoste;
		} else {
			precioCoste = 0;
		}
	}

	protected Dieta getTipoDieta() {
		return tipoDieta;
	}

	protected void setTipoDieta(Dieta tipoDieta) {
		this.tipoDieta = tipoDieta;
	}

	protected boolean isFrutosSecos() {
		return frutosSecos;
	}

	protected void setFrutosSecos(boolean frutosSecos) {
		this.frutosSecos = frutosSecos;
	}

	protected int getUnidadesRepartidas() {
		return unidadesRepartidas;
	}

	protected void setUnidadesRepartidas(int unidadesRepartidas) {
		this.unidadesRepartidas = unidadesRepartidas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Double.doubleToLongBits(consumoCalorico) == Double.doubleToLongBits(other.consumoCalorico)
				&& frutosSecos == other.frutosSecos && id == other.id && Objects.equals(nombre, other.nombre)
				&& precioCoste == other.precioCoste && precioVenta == other.precioVenta && tipoDieta == other.tipoDieta
				&& unidadesRepartidas == other.unidadesRepartidas;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", nombre=" + nombre + ", consumoCalorico=" + consumoCalorico + ", precioVenta="
				+ precioVenta + ", precioCoste=" + precioCoste + ", tipoDieta=" + tipoDieta + ", frutosSecos="
				+ frutosSecos + ", unidadesRepartidas=" + unidadesRepartidas + " fecha: " + LocalDateTime.now() + "]";
	}

	public boolean tieneCarne() {
		boolean carne = true;
		if (getTipoDieta().equals(Dieta.VEGETARIANO) || getTipoDieta().equals(Dieta.VEGANO)) {
			System.out.println("No tiene carne");
			carne = false;
		} else {
			System.out.println("Tiene carne");
			carne = true;
		}
		return carne;
	}

	public int calculaPrecioMenuPromocion() {
		int precioPromocion = 0;

		if (getPrecioVenta() <= 10) {
			precioPromocion = precioVenta - 1;
		} else if (getPrecioVenta() > 10) {
			precioPromocion = precioVenta - ((precioVenta * 10 / 100));
		}

		return precioPromocion;
	}

}

enum Dieta {
	VEGETARIANO, VEGANO, SIN_GLUTEN, SIN_LACTOSA
}
