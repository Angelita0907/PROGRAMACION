package herencias_b1_Ejercicio1;

public class GestionaVehiculo {

	public static void main(String[] args) {
		Vehiculo coche1 = new Automovil("Manuel", 5, 4,"A");
		Automovil coche2 = new Automovil("Pedro", 5, 4,"B");
		Camion camion1 = new Camion("Eva", 5, 6, 500, 3, 3);


		boolean esVehiculo = coche1 instanceof Vehiculo;
		System.out.println("Es vehiculo?"+esVehiculo);
		
		boolean esCoche = coche2 instanceof Vehiculo;
		System.out.println("Es vehiculo?"+esVehiculo);

		boolean esCamion = camion1 instanceof Camion;
		
		
		
	}

}
