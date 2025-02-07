package herencias_Ejercicio1;

public class Camion extends Vehiculo {

    private int tonelajeKilos;
    private int numEjes;

    public Camion(String dueno, int numPuertas, int numRuedas, int numPasajeros, int tonelajeKilos, int numEjes) {
        super(dueno, numPuertas, numRuedas, numPasajeros); // Llamamos al constructor de la clase base
        this.tonelajeKilos = tonelajeKilos;
        this.numEjes = numEjes;
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public void setTonelajeKilos(int tonelajeKilos) {
        this.tonelajeKilos = tonelajeKilos;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "Camion [dueno=" + getDueno() + ", numPuertas=" + getNumPuertas() + ", numRuedas=" + getNumRuedas() +
                ", numPasajeros=" + getNumPasajeros() + ", tonelajeKilos=" + tonelajeKilos + ", numEjes=" + numEjes + "]";
    }
}
