package modelo.Boletin9Ejercicio1;

import java.time.LocalDate;

public class Serpiente extends Mascota {

	private int numMudadoPiel;
	private int mesesGestacion;

	public Serpiente(int numMudadoPiel, int mesesGestacion) {
		super();
		this.numMudadoPiel = numMudadoPiel;
		this.mesesGestacion = mesesGestacion;
	}

	public int getNumMudadoPiel() {
		return numMudadoPiel;
	}

	public void setNumMudadoPiel(int numMudadoPiel) {
		this.numMudadoPiel = numMudadoPiel;
	}

	public int getMesesGestacion() {
		return mesesGestacion;
	}

	public void setMesesGestacion(int mesesGestacion) {
		this.mesesGestacion = mesesGestacion;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		return "Serpiente [numMudadoPiel=" + numMudadoPiel + ", mesesGestacion=" + mesesGestacion + ", nombre=" + nombre
				+ ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

}
