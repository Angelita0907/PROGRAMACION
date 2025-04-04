package modelo.ExamenEjercicio2;

public class RutaTerrestre extends RutaBase {

	private boolean esCarretera;
	private static double costeCienKms = 0.65;

	public RutaTerrestre(int id, Ciudad ciudadOrigen, Ciudad ciudadDestino, int distanciaKms, boolean esCarretera) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		this.esCarretera = esCarretera;
	}

	public boolean isEsCarretera() {
		return esCarretera;
	}

	public void setEsCarretera(boolean esCarretera) {
		this.esCarretera = esCarretera;
	}

	public static double getCosteCienKms() {
		return costeCienKms;
	}

	public static void setCosteCienKms(double costeCienKms) {
		RutaTerrestre.costeCienKms = costeCienKms;
	}

	@Override
	public double getCoste() {
		double coste = getDistanciaKms()*costeCienKms; 
		return coste;
	}

	@Override
	public String getTipoRuta() {
		String ruta;
		if(this.esCarretera = true) {
			//falta cambiar la calse en ruta terrestre del string
			ruta = getClass().getName() + "- carretera";
		}
		else {
			ruta = getClass().getName()  + "- tren";
		}
		
		return ruta;
	}

}
