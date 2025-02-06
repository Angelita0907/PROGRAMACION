package Array;

public class EjemploArray {

	public static void main(String[] args) {
		
		EjemploArray f =  new EjemploArray();
		
		int [] tabla1 = {1,2,3,4};
		int [] tabla2 = {1,2,3,4};

		f.comparaTalas(tabla1, tabla2);

	}

	boolean comparaTalas(int [] tabla1, int [] tabla2)
	{
		boolean iguales = true;
		//comparo elemento a elemento si son iguales
		if (tabla1.length != tabla2.length)
		{
			iguales = false;
		}
		
		else
		{
			for(int i = 0; i < tabla1.length; i++)
			{
				
			}
		}
		
		return iguales;
	}
	
}