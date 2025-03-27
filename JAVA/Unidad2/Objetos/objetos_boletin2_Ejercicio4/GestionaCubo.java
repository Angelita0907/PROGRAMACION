package objetos_boletin2_Ejercicio4;

public class GestionaCubo {

	public static void main(String[] args) {
		Cubo cubo1 = new Cubo(4,0);
		
		System.out.println(cubo1.capacidadMax);
		System.out.println(cubo1.calculaArea());
		
		System.out.println(cubo1.rellenar(6));
		System.out.println(cubo1);
		
		cubo1.vaciar(4);
		System.out.println(cubo1);
		System.out.println(cubo1.vaciar(3));
		
	}

}
