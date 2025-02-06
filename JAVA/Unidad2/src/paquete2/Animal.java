package paquete2;

public class Animal {

	public String tipo;
	public String nombre;
	private int edad;

	public boolean caminar() {
		return true;
	}

	public void darleDeComer() {
		if (tipo.equals("perro")) {
			comer();
		} else {
			System.out.println("No te toca comer");
		}
	}

	private void comer() {
		System.out.println("Estoy comiendo");
	}

	public boolean sonDelMismotipo(Animal a1, int numero) {
		boolean son = false;
		son = tipo.equals(a1.tipo);
		return son;
	}

}
