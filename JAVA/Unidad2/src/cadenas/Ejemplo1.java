package cadenas;

public class Ejemplo1 {

	public static void main(String[] args) {
		String c = "Hola";
		String d = " y Adios";
		System.out.println(c.charAt(2));
		
		/* Buscar caracteres en cadenas
		String cadena = "Hello planet earth, a great planet.";
		System.out.println(cadena.indexOf("planet"));
		System.out.println(cadena.lastIndexOf("planet"));
		System.out.println(cadena.indexOf("e", 5));
		System.out.println(cadena.lastIndexOf("e",5));
		*/
		
		/* Concatenar
		String cd =c.concat(d);
		System.out.println(cd);
	    */
		
		/*
		String c2 = new String(c);
		System.out.println(c + " == " + c2 + " --> " + (c == c2));
		System.out.println(c + " equals " + c2 + " --> " + c.equals(c2));
        */
		
		//Reemplazar
		String frase = "Hello planet earth, a great planet.";
		String frase2 = frase.replace("et","ET" );
		String frase3 = frase.replaceAll("et", "ET");
		//hay que asignar a la variable ese replace para que se guarden los cambios
		frase = frase.replace("et", "ET");
		System.out.println(frase);
		System.out.println(frase2);
		System.out.println(frase3);

	}

}
