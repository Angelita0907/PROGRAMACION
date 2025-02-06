package orientacion_objetos;

public class GestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();

		pikachu.nombre="Pikachu";
		pikachu.nivel=12;
		pikachu.tipo="Eléctrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewtwo";
		mew2.nivel = 20;
		mew2.tipo = "Psíquico";
		
		String cadenaPikachu = pikachu.convierteEnCadena();
		String cadenamew2 = mew2.convierteEnCadena();
		System.out.println(cadenaPikachu);
		System.out.println(cadenamew2);
		
		boolean gana = pikachu.combate(mew2);
		System.out.println("Pikachu gana a MewTwo? "+gana);
		cadenaPikachu = pikachu.convierteEnCadena();
		cadenamew2 = mew2.convierteEnCadena();
		System.out.println(cadenaPikachu);
		System.out.println(cadenamew2);
	
	}

}
