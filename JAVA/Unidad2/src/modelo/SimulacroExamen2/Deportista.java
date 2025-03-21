package modelo.SimulacroExamen2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.CompletionException;

public abstract class Deportista implements ICompeticion {

	private String nombre;
	private String pais;
	private int edad;
	private double peso;
	private double altura;
	private Prueba[] pruebas;

	public Deportista(String nombre, String pais, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = new Prueba[50];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Prueba[] getPruebas() {
		return pruebas;
	}

	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}

	abstract int tiempoCalentamiento();

	abstract double getCaloriasNecesariasDia();

	/*
	 * public int horasEntrenamiento(LocalDate fecha) { int numhoras;
	 * 
	 * numhoras =
	 * 
	 * return numhoras; }
	 */

	public Prueba getpruebaCercana() {

		Prueba pruebaCercana = pruebas[0];

		for (int i = 0; i < pruebas.length; i++) {
			if (pruebaCercana != null && pruebas[i] != null && pruebas[i].equals(Estado.PLANIFICADA)) {
				int diasMinimo = pruebaCercana.getFecha().compareTo(LocalDate.now());
				Prueba itero = pruebas[i];
				// para saber cuantos dias hay de la fecha actual a la de la prueba
				int diasItero = itero.getFecha().compareTo(LocalDate.now());
				if (diasMinimo > diasItero) {
					pruebaCercana = itero;
				}
			}

		}
		return pruebaCercana;

	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas=" + Arrays.toString(pruebas) + "]";
	}

	public void addPrueba(Prueba p) throws CompeticionExcepcion {

		for (int i = 0; i < pruebas.length; i++) {
			if (p != null && p.equals(pruebas[i]) || (p != null && p.getEstadoPrueba().equals(Estado.PLANIFICADA)
					&& p.getFecha().isBefore(LocalDate.now()))) {
				throw new CompeticionExcepcion(
						"No puedes añadir una prueba repetida ni con fecha pasada siendo planificada");

			}

		}

	}

}
