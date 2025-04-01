package listas;

import java.util.ArrayList;
import java.util.List;

public class EjemplosListas {

	public static void main(String[] args) {
		
		List < String > lista = new ArrayList <String> ();
		lista.add("Pedro");
		lista.add("David");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		lista.remove("Pedro");
		
		for(String cadena : lista) {
			System.out.println(cadena);
		}
		
		System.out.println(lista.size());
		
	}

}
