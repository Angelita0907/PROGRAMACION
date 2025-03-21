package ejemplo_HerenciaClase;

public class GestionaPersona {

	public static void main(String[] args) {
		Persona p = new Persona("Pepe", "Perez", 22, 500);
		Persona  p2 = new Entrenador("Pepa", "Marin", 24, 550);
		Entrenador e1 = new Entrenador("Maria", "Nuñez", 30, 1000);
		
		/*e1.concentrarse();
		p2.concentrarse();
		p.concentrarse();*/
		
		e1.dirigirPartido();
		// para que podamos usarlo en persona lo pasamos con casting
		Entrenador p2ToEntrenador = (Entrenador) p2;
		p2ToEntrenador.dirigirPartido();
		
		System.out.println(p2.toString());
		System.out.println(e1.toString());
		
		p.concentrarse();
		p.concentrarse(30);
		p.concentrarse("30");
		
		
	}

}
