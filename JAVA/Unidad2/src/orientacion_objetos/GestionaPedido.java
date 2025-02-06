package orientacion_objetos;

public class GestionaPedido {

	public static void main(String[] args) {
		
		int aumento = 5;
		
		Productos mandarinas = new Productos();
		mandarinas.nombre = "Mandarinas";
		mandarinas.numUnidades = 6;
		mandarinas.precioVenta = 2;
		
		Productos manzanas = new Productos();
		manzanas.nombre = "Manzanas";
		manzanas.numUnidades = 2;
		manzanas.precioVenta = 4;
		
		boolean pedido = mandarinas.pedirUnidades();
		System.out.println("¿Perdir unidades? "+pedido);
		
		if (pedido)
		{
			int masMandarinas = mandarinas.aumentoUnidades(aumento);
			System.out.println(masMandarinas);
		}
		System.out.println(mandarinas.numUnidades);
		
		pedido = manzanas.pedirUnidades();
		System.out.println("¿Perdir unidades? "+pedido);
		if (pedido)
		{
			int masManzanas = manzanas.aumentoUnidades(aumento);
			System.out.println("Ahora tiene: "+masManzanas+" unidades");
		}
		
	}

}
