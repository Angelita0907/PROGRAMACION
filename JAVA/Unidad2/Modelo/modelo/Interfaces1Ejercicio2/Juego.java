package modelo.Interfaces1Ejercicio2;

public class Juego extends Multimedia {

	public Juego(int id, String ubicacion, String nombre, String genero, int diasPrestamo) {
		super(id, ubicacion, nombre, genero, diasPrestamo);
		// TODO Auto-generated constructor stub
	}
	
	public int numFases(){
		return 0;
	}	

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int devuelveDiasPrestado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
