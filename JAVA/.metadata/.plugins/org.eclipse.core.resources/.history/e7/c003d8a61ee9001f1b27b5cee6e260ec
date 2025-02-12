package herencias_Ejercicio1;

public class Automovil extends Vehiculo {

    public Automovil(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.calificacionEcologica = calificacionEcologica;
    }

	private String calificacionEcologica;

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }
    
    boolean tieneLimitaciónParaCircular(String ciudad) {
    	boolean limitado = false;
    	
    	if (ciudad.equals("Madrid") || ciudad.equals("Barcelona") && calificacionEcologica.equals("B") || calificacionEcologica.equals("C"))
    	{
    		limitado = true;
    	}
    	else if(ciudad.equals("Sevilla") || ciudad.equals("Valencia") && calificacionEcologica.equals("C"))
    	{
    		limitado = true;
    	}
    	else {
    		limitado = false;
    	}
    	
    	return limitado;
    }

    @Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}

}
