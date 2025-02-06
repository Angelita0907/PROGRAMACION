package orientacion_objetos;

public class Productos {
	
	String nombre;
	int numUnidades;
	float precioVenta;
	
	boolean pedirUnidades()
	{
		boolean pedir = false;
		if (numUnidades < 3)
		{
			pedir = true;
		}
		else
		{
			pedir = false;
		}
		return pedir;
	}
	
	int aumentoUnidades (int aumento)
	{	
		numUnidades = numUnidades+aumento;
		
		return numUnidades;
	}
	
	String pasoACadena() {
		String cadena = "Producto " + nombre + " Unidades: " + numUnidades + " y con precio: " + precioVenta;

		return cadena;
	}

}