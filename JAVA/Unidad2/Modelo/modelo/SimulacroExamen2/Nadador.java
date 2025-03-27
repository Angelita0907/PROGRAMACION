package modelo.SimulacroExamen2;

public class Nadador extends Deportista {

	public Nadador(String nombre, String pais, int edad, double peso, double altura) {
		super(nombre, pais, edad, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void competir() {
		System.out.println("El nadador nada");

	}

	@Override
	public int tiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int tiempoCalentamiento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getCaloriasNecesariasDia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
