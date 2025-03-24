package modelo.SimulacroExamen3;

public class PilotoComercial extends Piloto{

	public PilotoComercial(String nombre, String nacionalidad, int edad, int numlicencia, double totalhorasvuelo) {
		super(nombre, nacionalidad, edad, numlicencia, totalhorasvuelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String operarVuelo() {
		return "Opero de forma comercial";
	}

	@Override
	public double getDuracionVuelo() {
		return 10;
	}
	public void agregarVuelo() throws VueloException {
		if (this.getDuracionVuelo() > 8) {
			throw new VueloException ("Un piloto comercial no puede hacer vuelos de más de 8 horas");
		}
	}
	}

