package ejemplo_Enum;

import ejemplo_Enum.DiadelaSemana;

public class Principal {

	public static void main(String[] args) {
		
		DiadelaSemana dia = DiadelaSemana.LUNES;
		System.out.println(dia);

		for(DiadelaSemana dia2 : DiadelaSemana.values()) {
			if(dia2 == DiadelaSemana.MARTES)
			{
				System.out.println("Hoy es Martes");
			}
		}
		
		
		
	}

}
