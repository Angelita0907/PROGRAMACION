package objetos_boletin2_Ejercicio4;

public class Cubo {

	/*
	 * lados:int litrosContiene: float; capacidadMax:float;
	 * 
	 * Metodos()float calculaVolumen()float vaciar(float litrosSacar):boolean
	 * rellenar(float litrosMeter):boolean
	 */

	int lados;
	float litrosContiene;
	float capacidadMax;

	public Cubo(int lados, float litrosContiene) {
		super();
		this.lados = lados;
		this.litrosContiene = litrosContiene;
		this.capacidadMax = calculaVolumen();
	}

	float calculaArea() {
		float area = 6 * (lados * lados);
		return area;
	}

	float calculaVolumen() {
		float volumen = lados * lados * lados;
		return volumen;
	}

	boolean vaciar(float litrosSacar) {
		boolean vacio = true;

		if(litrosSacar >= litrosContiene)
		{
			vacio = false; 
		}
		else {
			litrosContiene = litrosContiene-litrosSacar;
		}
		
		return vacio;
	}

	boolean rellenar(float litrosMeter) {
		
		boolean rellena = true;
		
		if(litrosMeter+litrosContiene >= litrosMeter)
		{
			rellena = false;
		}
		else {
			litrosContiene= litrosContiene+litrosMeter;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Cubo lados: " + lados + ", listrosContiene: " + litrosContiene + ", capacidadMax: " + capacidadMax;
	}

}
