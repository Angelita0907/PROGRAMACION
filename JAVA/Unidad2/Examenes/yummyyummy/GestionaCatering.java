package yummyyummy;

public class GestionaCatering {

	public static void main(String[] args) {
		
		Menu m1 = new Menu(1, "Mañana", 1000, 30, 10, Dieta.VEGANO, false, 0);
		Menu m2 = new Menu(2, "MedioDia", 3000, 9, 12, Dieta.VEGETARIANO, false, 0);
		Menu m3 = new Menu(3, "Noche", 2000, 15, 10, Dieta.SIN_LACTOSA, false, 0);
		System.out.println(m1);

		Cliente c1 = new Cliente("12345678A", "Pedro", "Matin", 20, m3, true);
		Cliente c2 = new Cliente("12345678B", "Martin", "Matin", 66, m2, true);
		Cliente c3 = new Cliente("12345678C", "Ana", "Matin", 40, m1, false);

		//Sring alergias [] = {}; asignar alergias
		
	}

}
