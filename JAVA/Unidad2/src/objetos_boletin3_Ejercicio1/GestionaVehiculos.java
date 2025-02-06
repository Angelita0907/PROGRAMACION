package objetos_boletin3_Ejercicio1;

public class GestionaVehiculos {

	public static void main(String[] args) {
		
		Vehiculo coche1 = new Vehiculo("Fiat","500xL",2018,"Diesel",50,50,6.4F);
		Vehiculo coche2 = new Vehiculo("Ford","Focus",2014,"Diesel",50,50,6.4F);
	
	float consumoCoche1 = coche1.calculaConsumo(10);
	float consumoCoche2 = coche2.calculaConsumo(30);
	
	System.out.println(consumoCoche1);
	System.out.println(consumoCoche2);

	}
	
}
