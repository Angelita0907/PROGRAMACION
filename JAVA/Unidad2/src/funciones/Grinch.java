package funciones;

import java.util.Scanner;

public class Grinch {

	public static void main(String[] args) {
		Grinch f = new Grinch();	
		String nombreFichero = "023122512345678hackGrinch_elfosClothes.png";		
		
		String [] listaHack = { "4085852hackGrinch_medidas_chimenea.pdf", "19hackGrinch_lista_regalos.docx", "72143hackGrinch_plan_de_rescate.txt", "5hackGrinch_inventario_juguetes.xlsx", "11hackGrinch_esquema_cueva.ppt.hack", "83534685hackGrinch_diario_personal.log", "92220hackGrinch_cartas_niños.csv", "2879707hackGrinch_manual_de_travesuras.pdf", "3000123hackGrinch_lista_enemigos.doc", "6000326hackGrinch_resumen_robos.txt" };
		
		nombreFichero.indexOf("Grinch_");
		
		String ficherolimpio = f.desGrinch(nombreFichero);
		System.out.println(ficherolimpio);

	}

	String desGrinch (String nombreFichero) 
	{
		String limpio = " ";
		
		
		
		return limpio;
	}
	
}
