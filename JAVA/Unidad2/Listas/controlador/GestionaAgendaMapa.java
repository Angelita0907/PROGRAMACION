package controlador;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import modelo.AgendaMapa;
import modelo.Contacto;

public class GestionaAgendaMapa {

	public static void main(String[] args) {
		
		Contacto c1 = new Contacto("Pepe", "Arez", "12345678");
		Contacto c2 = new Contacto("Pepa", "Berez", "87654321");
		Contacto c3 = new Contacto("Pepo", "Cerez", "72456123");
		
		AgendaMapa a = new AgendaMapa();
		
		a.getAgenda().put("12345678", c1);
		a.getAgenda().put("87654321", c2);
		a.getAgenda().put("72345678", c3);
		
		a.getAgenda().put("72345678", c1);
		System.out.println(a.getAgenda().size());
	
		System.out.println(a.getAgenda().get("88345678"));
		
		System.out.println(a.getAgenda().values());
		System.out.println(a.getAgenda().keySet());
		
		// entry nos da las parejas de los datos que hemos metido y no por separado
		Set<Map.Entry<String, Contacto>> entrada = a.getAgenda().entrySet();
		
		Entry<String, Contacto> elemento;
		Iterator it = entrada.iterator();
		
		while (it.hasNext()) {
			elemento = (Entry<String, Contacto>) it.next();
			elemento.getKey();
			elemento.getValue();
		}
		
	}

}
