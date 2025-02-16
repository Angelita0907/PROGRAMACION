package objetos_boletin3_Ejercicio1;

public class Vehiculo {

	/*
	 * String marca String modelo int año String tipo_Combustible int
	 * tanque_Capacidad
	 * 
	 * Métodos: float calculaConsumo(float numKm) boolean necesitaCombustible()
	 */

	String marca;
	String modelo;
	int anio_fabricacion;
	String tipo_Combustible;
	int tanqueMax_Capacidad;
	int tanqueActual_Capacidad;
	float consumoMedio;

	public Vehiculo(String marca, String modelo, int anio_fabricacion, String tipo_Combustible, int tanqueMax_Capacidad,
			int tanqueActual_Capacidad, float consumoMedio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio_fabricacion = anio_fabricacion;
		this.tipo_Combustible = tipo_Combustible;
		this.tanqueMax_Capacidad = tanqueMax_Capacidad;
		this.tanqueActual_Capacidad = tanqueActual_Capacidad;
		this.consumoMedio = consumoMedio;
	}

	@Override
	public String toString() {
		return "Vehiculo marca: " + marca + ", modelo: " + modelo + ", anio_fabricacion: " + anio_fabricacion
				+ ", tipo_Combustible: " + tipo_Combustible + ", tanqueMax_Capacidad: " + tanqueMax_Capacidad
				+ ", tanqueActual_Capacidad: " + tanqueActual_Capacidad;
	}


	 float calculaConsumo(float numKm) 
	 {
		 float consumo = (numKm * consumoMedio)/100;
		 System.out.println("Conusme: "+ consumo + " Litros");
		 return consumo;
	 }
	 
	boolean hayQueRepostar() {
		boolean repostar = false;

		if (tanqueActual_Capacidad < (0.2*tanqueMax_Capacidad)) {
			repostar = true;
		}
		return repostar;
	}

}