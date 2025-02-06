package tablas;

public class Ejercicio1 {

	public static void main(String[] args) {
		String semana [] = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		
/*		for (int pos = 0; pos < semana.length; pos++ )
		{
			if (pos < 5) 
			{
			System.out.println("Laborable: "+semana[pos]);
			}
			else 
			{
				System.out.println("Festivos: "+semana[pos]);
			}
		}
*/		
		int dia = 0;
		
		// Llega al miércoles y para
		
		while (dia < semana.length && !semana[dia].equals("pipipi")) 
		{
			System.out.println(semana[dia]);
			dia++;
		}
	}

}
