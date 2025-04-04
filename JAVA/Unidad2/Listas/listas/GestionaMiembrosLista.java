package listas;

import java.util.ArrayList;
import java.util.List;

public class GestionaMiembrosLista {

	public static void main(String[] args) throws GuzmanitosException {
		
		List < MiembroLista > amigo = new ArrayList <MiembroLista> ();
		
		MiembroLista m1 = new MiembroEstandar("pedro@pedro.com", "Pedro");
		MiembroLista m2 = new MiembroEstandar("ana@ana.com", "Ana");
		MiembroLista m5 = new MiembroEstandar("pepo@pepo.com", "Pepo");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		MiembroLista m3 = new MiembroPremium("vicente@vicente.com", "Vicente", TipoPremium.PREMIU_VIP);
		MiembroLista m4 = new MiembroPremium("andres@andres.com", "Andres", TipoPremium.PREMIUM);
		
		try {
			m1.addAmigo(m4);
			m1.addAmigo(m3);
			m1.addAmigo(m4);
		} catch (GuzmanitosException e) {
			System.out.println(e.getMessage());
			throw new GuzmanitosException("Excepcion de Angela");
		}
		for(MiembroLista m : m1.getAmigo()) {
			System.out.println(m);
		}
		

	}

}
