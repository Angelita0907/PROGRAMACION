package modelo.ExamenEjercicio1;

public class GestionaMiembros {

	public static void main(String[] args) {
		
		MiembroBase m1 = new MiembroEstandar("pedro@pedro.com", "Pedro");
		MiembroBase m2 = new MiembroEstandar("ana@ana.com", "Ana");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		MiembroBase m3 = new MiembroPremium("vicente@vicente.com", "Vicente", TipoPremium.PREMIU_VIP);
		MiembroBase m4 = new MiembroPremium("andres@andres.com", "Andres", TipoPremium.PREMIUM);
		
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		

		try {
			m2.addAmigo(m3);
		} catch (GuzmanitosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
