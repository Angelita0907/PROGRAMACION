package modelo.ExamenEjercicio2;

public class RutaAerea extends RutaBase {

	private Vuelos tipoVuelo;

	public RutaAerea(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, int distanciaKms, Vuelos tipoVuelo) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		this.tipoVuelo = tipoVuelo;
	}

	public Vuelos getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(Vuelos tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	@Override
	public double getCoste() {
		double coste = 0;
		
		if (getTipoVuelo().equals(Vuelos.LOW_COST)) {
			coste = getDistanciaKms()*0.75;
		}
		else if (getTipoVuelo().equals(Vuelos.NORMAL)) {
			coste = getDistanciaKms()*1.1;
		}
		else if (getTipoVuelo().equals(Vuelos.EXPRESS)){
			coste = getDistanciaKms()*1.5;
		}
		return coste;
	}

	@Override
	public String getTipoRuta() {
		String ruta = getClass().getName() + ": y de tipo "+ getTipoVuelo();
		return ruta;
	}

}
