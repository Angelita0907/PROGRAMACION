package gestionDeDispositivos;

public class GestionDispositivos {

	public static void main(String[] args) {
		Smartphone smart1 = new Smartphone("S25", "Samsung", 900, false, 3);
		//llamar metodo toString
		Laptop lap1 = new Laptop("Mac 11", "Ios", 1200, 16, 2.5);
		System.out.println(lap1);
		PCSobremesa pc1 = new PCSobremesa("SanpDragon", "NVidia", 2100, 32, true);


		Dispositivo smart2 = new Smartphone("Mi 11", "Xiaomi", 650, false, 2);

		Dispositivo lap2 = new Laptop("S24", "Samsung", 720, 8, 1);

		Dispositivo pc2 = new PCSobremesa("Corsair 4", "Corsair", 1715, 32, false);

		//Comparacion 
		System.out.println("Son iguales?: "+ smart1.equals(smart1));
		System.out.println("Son iguales?: "+ pc1.equals(lap2));

		boolean esDipositivo;
		if (smart1 instanceof Dispositivo)
		{
			//casting
			esDipositivo = true;
		}
		if (lap1 instanceof Dispositivo)
		{
			//casting
		}
		if (pc1 instanceof Dispositivo)
		{
			//casting
		}
		
	}

}
