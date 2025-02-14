package herencias_b1_Ejercicio1;

public class Automovil extends Vehiculo {

    public Automovil(String dueno, int numPuertas, int numRuedas, CalificacionEco calificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		setCalificacionEcologica(calificacionEcologica);
    }

	private CalificacionEco calificacionEcologica = CalificacionEco.ECO;
	
	protected enum CalificacionEco{
		ECO, O, B, C; 
	}

    public CalificacionEco getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(CalificacionEco calificacionEcologica) {
    	if(calificacionEcologica.equals(CalificacionEco.ECO) || calificacionEcologica.equals(CalificacionEco.O) 
    	|| calificacionEcologica.equals(CalificacionEco.B) || calificacionEcologica.equals(CalificacionEco.C)) 
    	{
    		this.calificacionEcologica = calificacionEcologica;
    	}
    }

    @Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numPuertas="
				+ numPuertas + ", numRuedas=" + numRuedas + "]";
	}

}
