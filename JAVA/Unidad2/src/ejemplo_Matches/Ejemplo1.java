package ejemplo_Matches;

public class Ejemplo1 {

	public static void main(String[] args) {
		String numeros = "1010";
		String numeros2 = "1a10";
		String vacio = " ";
		String letras = "abc";
		String numeros3 = "12345678a";
		
		System.out.println(numeros.matches("\\d*"));
		System.out.println(vacio.matches("\\d+"));
		System.out.println(letras.matches("[A-Za-z]{1}"));
		
		System.out.println(numeros3.matches("\\d{8}[A-Za-z]{1}"));
	}

}
